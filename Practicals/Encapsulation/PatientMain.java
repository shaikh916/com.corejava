package com.corejava;

public class PatientMain 
{

	public static void main(String[] args) 
	{
		Patient p1 = new Patient();
		 // Set values
		  p1.setName("kaif");
	        p1.setAge(22);
	        p1.setTemperature(102.6);
	        
	        // Get and display values
	        System.out.println("Patient Name: " + p1.getName());
	        System.out.println("Patient Age: " + p1.getAge());
	        System.out.println("Patient Temperature: " + p1.getTemperature() + "°C");

	}

}
