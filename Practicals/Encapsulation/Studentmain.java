package com.corejava;

public class Studentmain 
{

	public static void main(String[] args) 
	{
		
		//Creating object of Student Class
		
		Students s1 = new Students();
		
		//setting the values
		s1.setName("Mohammad");
		s1.setAge(23);
		
		//print the values
		System.out.println("Student Name: "+ s1.getName());
		System.out.println("Student Age: "+ s1.getAge());
	}

}
