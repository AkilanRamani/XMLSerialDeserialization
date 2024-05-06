package TestXmlMapper;

import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class PojoToXMLExample1 {

	public static void main(String[] args) {
		 XmlMapper xmlMap = new XmlMapper();    
	        // create Scanner class object    
	        Scanner sc= new Scanner(System.in);         
	        // using try-catch  
	        try {    
	            College colg;    
	            String name, university, street, state, city, rank;    
	            System.out.println("Enter College Name:");    
	            name = sc.nextLine();    
	            System.out.println("Enter University Name:");    
	            university = sc.nextLine();    
	  
	            System.out.println("Enter Street:");    
	            street = sc.nextLine();    
	              
	            System.out.println("Enter City:");    
	            city = sc.nextLine();  
	              
	            System.out.println("Enter State:");    
	            state = sc.nextLine();  
	            System.out.println("Enter College Rank:");    
	            rank = sc.nextLine();    
	            // set values to College object by using constructor    
	            colg = new College(name, university, new Address(street, state, city), rank);  
	            // serialize College using xmlMap    
	            String xmlString = xmlMap  
	                    .writeValueAsString(colg);    
	            System.out.println(xmlString);    
	        } catch (IOException e) {     
	            e.printStackTrace();    
	        }    
	        //close Scanner class object    
	        sc.close();    
	    }    

	}


