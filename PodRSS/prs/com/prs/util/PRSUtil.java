package com.prs.util;

import java.lang.reflect.Field;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PRSUtil {
    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static Gson gson1 = new Gson();
  public static void serializePretty(Object o) {
      System.out.println(gson.toJson(o));
  }
  public static void serialize(Object o) {
      System.out.println(gson1.toJson(o));
  }
  public static void getClassFields(Class<?> clazz) {
      Class<?> c = clazz;

      Field[] classFields = c.getDeclaredFields();
      ArrayList<String> str = new ArrayList<String>();
      for(Field f :classFields) {
	  str.add(f.getType().getName()+" "+f.getName());
      }
      serializePretty(str);
  }

}
