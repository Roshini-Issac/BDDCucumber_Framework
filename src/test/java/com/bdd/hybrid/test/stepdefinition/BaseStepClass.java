package com.bdd.hybrid.test.stepdefinition;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class BaseStepClass  {
	public static  RequestSpecification httpRequest=null;
	public static Response response=null;
	

	public RequestSpecification get_httpRequest_Ref(String url)
	{
		
		
		System.out.println("1.Called the RequestSpecification method");
		httpRequest= null;
		
		if(httpRequest==null)
		{			
			System.setProperty("https.protocols", "");
			RestAssured.baseURI = url;
			httpRequest = RestAssured.given().log().all();
			
		}
		else
		{
			System.out.println(" HttpRequest is not null");
		}
		
		return httpRequest;
	}

	
	
	public static Response getHttpResponse(String endpoint_path)
	{   
		response = httpRequest.get(endpoint_path);
		return response;
	}

	public String gen_6digit_randon_with_non_Leading_Zero()
	{
		
			LocalDateTime now = LocalDateTime.now();
			String format = now.format(DateTimeFormatter.ofPattern("HHmmss", Locale.ENGLISH));
			
			// Convert str into StringBuffer as Strings are immutable. 
			StringBuffer sb = new StringBuffer(format); 
			
			for(int i =0;i<sb.length(); i++)
			{
				if(sb.charAt(i)=='0')
				{
					// The  StringBuffer replace function removes i characters from given index (0 here) 
					sb.replace(0, i, "1"); 
				}
				break;
			}
	         
			return sb.toString();
	}
	
	
	
}
