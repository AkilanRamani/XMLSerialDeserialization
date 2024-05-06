package TestXmlMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class SerializeListToXML {

	public static void main(String[] args) {
		 XmlMapper xmlMap = new XmlMapper();    
		  
	        // create Scanner class object    
	        Scanner sc= new Scanner(System.in);         
	  
	        // using try-catch  
	        try {    
	  
	            Company company;    
	  
	            String name, email, mailingCity, mailingState, mailingStreet, shippingCity, shippingState, shippingStreet, con1, con2;    
	            List<String> contacts = new ArrayList<String>();  
	            List<Address> address = new ArrayList<Address>();  
	              
	            System.out.println("Enter Company Name:");    
	            name = sc.nextLine();    
	  
	            System.out.println("Enter Company Email:");    
	            email = sc.nextLine();    
	              
	            System.out.println("Enter Mailing Street:");    
	            mailingStreet = sc.nextLine();    
	              
	            System.out.println("Enter Mailing City:");    
	            mailingCity = sc.nextLine();  
	              
	            System.out.println("Enter Mailing State:");    
	            mailingState = sc.nextLine();  
	              
	            System.out.println("Enter Shipping Street:");    
	            shippingStreet = sc.nextLine();    
	              
	            System.out.println("Enter Shipping City:");    
	            shippingCity = sc.nextLine();  
	              
	            System.out.println("Enter Shipping State:");    
	            shippingState = sc.nextLine();  
	              
	            System.out.println("Enter Contact 1:");    
	            con1 = sc.nextLine();    
	              
	            System.out.println("Enter Contact 2:");    
	            con2 = sc.nextLine();    
	              
	            contacts.add(con1);  
	            contacts.add(con2);  
	            address.add(new Address(mailingStreet, mailingCity, mailingState));  
	            address.add(new Address(shippingStreet, shippingCity, shippingState));  
	              
	            // set values to company  object by using constructor    
	            company = new Company(name, email, address, contacts);  
	              		
	            // serialize College using xmlMap    
	            String xmlString = xmlMap  
	                    .writeValueAsString(company);    
	            System.out.println(xmlString);    
	                  
	        } catch (IOException e) {     
	            e.printStackTrace();    
	        }    
	  
	        //close Scanner class object    
	        sc.close();    
	  
	    }    

	}


