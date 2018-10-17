package com.mkyong;

import java.util.UUID;

/**
 * Generate a unique number
 *
 */
public class App1 
{


    
    public String generateUniqueKey(){
    	
    	String id = UUID.randomUUID().toString();
    	return id;
    	
    }
}
