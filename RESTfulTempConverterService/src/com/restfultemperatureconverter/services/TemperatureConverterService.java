package com.restfultemperatureconverter.services;

import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;  



@Path("ConversionService") 
public class TemperatureConverterService {

	@GET  
	@Path("/CelciusToFahrenheit/{c}")  
	@Produces(MediaType.TEXT_XML)  
	public String convertInchToFeet(@PathParam("c") int c) {  

		int celcius=c;  
		double fahrenheit = 0;  
		fahrenheit =(double)(9.0/5.0)*celcius + 32;  

		return "<CelciusToFahrenheitService>"  
		+ "<Celcius>" + celcius + "</Celcius>"  
		+ "<Fahrenheit>" + fahrenheit + "</Fahrenheit>"  
		+ "</CelciusToFahrenheitService>";  
	}  

	@Path("/FahrenheitToCelcius/{f}")  
	@GET  
	@Produces(MediaType.TEXT_XML)  
	public String convertFeetToInch(@PathParam("f") int f) {  
		
		double celcius=0;  
		int fahrenheit = f;  
		celcius =(double)((fahrenheit - 32)*5)/9;;  

		return "<FahrenheitToCelciusService>"  
		+ "<Fahrenheit>" + fahrenheit + "</Fahrenheit>"
		+ "<Celcius>" + celcius + "</Celcius>"  
		+ "</FahrenheitToCelciusService>";  
	}  


}
