package com.logFileModifier;

//import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.MongoClient; 
//import com.mongodb.MongoCredential; 

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	      // Creating a Mongo client 
	      MongoClient mongo = new MongoClient( "127.0.0.1" , 27017 ); 
	      
	      MongoIterable<String> list = mongo.listDatabaseNames();
	      for (String name : list) {
	         System.out.println(name);
	      }
	   
	     /* // Creating Credentials 
	      MongoCredential credential; 
	      credential = MongoCredential.createCredential("sampleUser", "myDb", 
	         "password".toCharArray()); 
	      System.out.println("Connected to the database successfully");  
	      
	      // Accessing the database 
	      MongoDatabase database = mongo.getDatabase("myDb"); 
	      System.out.println("Credentials ::"+ credential); 
		*/

	}

}
