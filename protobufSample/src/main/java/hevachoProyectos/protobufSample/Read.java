package hevachoProyectos.protobufSample;

import hevachoProyectos.protobufSample.AddressBookProtos.Person;

import java.io.FileInputStream;

public class Read {

	/**
	 * Read the file
	 * @param args
	 */
	public static void main( String[] args )
    {
       try{
    	   
    	   AddressBookProtos.AddressBook direcciones
    	   = AddressBookProtos.AddressBook.newBuilder()
    	     .mergeFrom(new FileInputStream("./swapFile")).build();
    	
    	   for (Person persona : direcciones.getPeopleList()) {
    		   System.out.println("Name: "+persona.getName()+" Phone1:"+persona.getNumbers(0)+" Phone2:"+persona.getNumbers(1));
    	   }
    	   
    	
       }catch(Exception e){
    	   e.printStackTrace();
       }
    	
    }
	
}
