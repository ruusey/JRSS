package com.prs.api;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("/")
public class API {
	

	public ArrayList<String> bannedIps = new ArrayList<String>();
	

	
	@POST
	@Path("/text")
	@Produces("application/json")
	@Consumes("application/json")
	public Response sendJRelayTest(@QueryParam("client-id") int clientId,String test){
		User client = relay.instance.users.get(clientId);
		
		Response response = new Response();
		if(client==null){
			response.setMessage("There is no client with the specified id currently connected");
		}else{
			try{
				PacketEvent pe = new PacketEvent(client);
				pe.text("", test);
				response.setSuccess(true);
			}catch(Exception e){
				response.setMessage(e.getMessage());
			}
			
		}
		return response;
	}
	@POST
	@Path("/start")
	@Produces("application/json")
	@Consumes("application/json")
	public Response startRelay() {

		Response response = new Response();

		try {
			relay.main(null);
			response.setSuccess(true);
		} catch (Exception e) {
			response.setMessage(e.getMessage());
		}

		return response;
	}
	@POST
	@Path("/sols")
	@Produces("application/json")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response newSol(@Context HttpServletRequest request,SolDataRequest sd) {
		boolean success = false;
		Response response = new Response();
		//IF THIS IP ALREADY HAS CALLED THE SERVICE
		if(bannedIps.contains(request.getRemoteAddr())){
			response.setMessage("You're Like Super Banned Sorry Maybe Use A VPN Or Try Not Being A Fucking Queer");
			response.setSuccess(false);
			return response;
		}
		if(requests.get(request.getRemoteAddr()).getSpamCount()==MAXIMUM_SPAM_REQUESTS){
			bannedIps.add(request.getRemoteAddr());
		}
		
		if(requests.containsKey(request.getRemoteAddr())){
			long requestDif = System.currentTimeMillis()-requests.get(request.getRemoteAddr()).getLastRequest();
			if(requestDif<50){
				requests.get(request.getRemoteAddr()).setSpamCount(requests.get(request.getRemoteAddr()).getSpamCount()+1);
				response.setMessage("Strop Trying To Spam You Nig, You Now Have "+(MAXIMUM_SPAM_REQUESTS-requests.get(request.getRemoteAddr()).getSpamCount())+" Attempts Left");
				response.setSuccess(false);
				return response;
			}else{
				requests.get(request.getRemoteAddr()).setLastRequest(System.currentTimeMillis());
				EmailSender.send(sd.getDestinationEmail(), SolDataInsert.formatData(sd));
			}
			
			
		}else{
			//NEW IP :D
			requests.put(request.getRemoteAddr(), new Request(System.currentTimeMillis()));
		}
		
		
		
		
		
		long utcDate = Calendar.getInstance(TimeZone.getTimeZone("UTC")).MILLISECOND;
		if(Math.abs(utcDate-sd.getTimeStamp())<1000 ){
			
			
			try {
				//success = insert.addSol(sd);
				response.setMessage("Succesfully Logged New Sol Data From " + sd.getIp()
						+ " At Time " + sd.getTimeStamp());
			} catch (Exception e) {
				response.setMessage(e.getMessage());
				e.printStackTrace();
			}
			response.setSuccess(success);
		}else{
			response.setMessage("Your Request Was Not Valid Fuck Off");
		}
		ObjectMapper mapper = new ObjectMapper();
		String s = "";
		try {
			s = mapper.writeValueAsString(response);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		System.out.println(s);
		return response;
	}
	@POST
	@Path("/validate")
	@Produces("application/json")
	@Consumes("application/json")
	public Response validateMemberId(@Context HttpServletRequest request,  @QueryParam("member-id") String memberId) {
		UserManager manager = new UserManager();
		
		Response r = new Response();
		boolean success = manager.checkMemberId(memberId);
		if(success){
			r.setSuccess(true);
			r.setMessage("Successfully Validated Member ID");
		}else{
			r.setSuccess(false);
			r.setMessage("Unable To Validate Member ID");
		}
		
		return r;
		
	}
	
	
}
