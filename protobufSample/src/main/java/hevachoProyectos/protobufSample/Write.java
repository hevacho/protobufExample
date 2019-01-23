package hevachoProyectos.protobufSample;

import hevachoProyectos.protobufSample.AddressBookProtos.AddressBook;
import hevachoProyectos.protobufSample.AddressBookProtos.Person;
import hevachoProyectos.protobufSample.AddressBookProtos.Person.Builder;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Write the file
 *
 */
public class Write 
{
    public static void main( String[] args )
    {
       try{
    	   
    	Builder personaUnoBuilder = AddressBookProtos.Person.newBuilder();
    	personaUnoBuilder.setId(1);
    	personaUnoBuilder.setName("Persona1");
    	personaUnoBuilder.setEmail("persona1@mail.com");
    	personaUnoBuilder.addNumbers("659637789");
    	personaUnoBuilder.addNumbers("659637790");
    	
    	Person persona = personaUnoBuilder.build();
    	
    	Builder personaDosBuilder = AddressBookProtos.Person.newBuilder();
    	personaDosBuilder.setId(2);
    	personaDosBuilder.setName("Persona2");
    	personaDosBuilder.setEmail("persona2@mail.com");
    	personaDosBuilder.addNumbers("659666666");
    	personaDosBuilder.addNumbers("659777777");
    	
    	Person persona2 = personaUnoBuilder.build();
    	
    	hevachoProyectos.protobufSample.AddressBookProtos.AddressBook.Builder libroDireccionesBuilder 
    	  = AddressBookProtos.AddressBook.newBuilder();
    	  
    	libroDireccionesBuilder.addPeople(persona);
    	libroDireccionesBuilder.addPeople(persona2);
    	  
    	AddressBook libroDirecciones =   libroDireccionesBuilder.build();
    	
    	
    	File f = new File("./swapFile");
    	FileOutputStream fos = new FileOutputStream(f);
    	libroDirecciones.writeTo(fos);
    	
       }catch(Exception e){
    	   e.printStackTrace();
       }
    	
    }
}
