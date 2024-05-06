package TestXmlMapper;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Company {
	
	public String comName;  
    public String comEmail;     
      
    @JacksonXmlElementWrapper (useWrapping = true)
    public List<Address> address;   
    public List<String> contacts12;     
  
    // constructor    
    Company(String comName, String comEmail, List<Address> address, List<String> contacts){    
        this.comName = comName;    
        this.comEmail = comEmail;    
        this.address = address;    
        this.contacts12 = contacts;    
    }    
    }           


