package com.fps.util;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.server.ContainerRequest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fps.constants.APIStatus;
import com.fps.constants.PrivilegeEnum;
import com.fps.models.Response;

import static com.fps.constants.Constants.*;

public abstract class APIUtils {
  public static WebApplicationException buildWebApplicationException(
      javax.ws.rs.core.Response.Status httpResponseStatus,
      APIStatus status,
      String message,
      String debugMessage) {
    Response response = new Response(status, message, debugMessage);
    return new WebApplicationException(
        javax.ws.rs.core.Response.status(httpResponseStatus)
            .type(MediaType.APPLICATION_JSON)
            .entity(response)
            .build());
  }

  public static Response buildResponse(APIStatus status, String message, String debugMessage) {

    return new Response(status, message, debugMessage);
  }

  public static String generateJSON(Object classs) {

    String json = null;

    ObjectMapper objectMapper = new ObjectMapper();
    try {

      Object jsonObject =
          objectMapper.readValue(objectMapper.writeValueAsString(classs), Object.class);

      json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);

    } catch (Exception e) {
      e.printStackTrace();
    }
    return json;
  }

  public static String getHeaderValue(ContainerRequest request, String key) {
    return getHeaderValue(request.getRequestHeader(key));
  }

  public static String getHeaderValue(HttpHeaders headers, String key) {
    return getHeaderValue(headers.getRequestHeader(key));
  }

  public static String getHeaderValue(List<String> values) {
    String value = null;
    if (values != null && values.size() > 0) value = values.get(0);
    if (value != null) return value.trim();
    else return value;
  }

 

  public static String getPath(HttpServletRequest request) {
    String url = "";
    String host = request.getServerName();
    String port = "";
    //	***************************************************
    //	Only need port and http (not https) when testing...
    //	***************************************************
    if (host.equalsIgnoreCase("127.0.0.1") || host.equalsIgnoreCase("localhost")) {
      port = ":" + String.valueOf(request.getLocalPort());
      url += "http";
    } else {
      url += "https";
    }
    url += "://" + host + port + request.getContextPath() + request.getServletPath();
    return url;
  }

  public static boolean hasPrivilege(HttpHeaders headers, PrivilegeEnum privilege)
      throws Exception {
    boolean hasPrivilege = false;
    try {
      String headerValue = getHeaderValue(headers, HTTP_HEADER_X_PRIVILEGES);
      if (headerValue == null) return hasPrivilege;
      headerValue = headerValue.trim();
      if (headerValue.length() == 0) return hasPrivilege;
      Long privileges = Long.valueOf(headerValue);
      if (privileges == null) return hasPrivilege;
      hasPrivilege = (privileges.longValue() & privilege.id()) == privilege.id();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return hasPrivilege;
  }
}
