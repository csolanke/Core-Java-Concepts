/**
 * 
 * @author chandrakant
 * 
 * if we are not providing any parameterized constructor in a class then no need to explicitly write default
 * constructor compiler will consider it as present 
 * .
 * 
 * But If you are providing any parameterized constructor then we must have to define default constructor.
 * 
 * 
 *
 */
public class ConstructorAndDefaultConstructor {
	
	int id;
	String name;
	
	
	ConstructorAndDefaultConstructor()
	{
		System.out.println("default constructor");
	}
	
	
	ConstructorAndDefaultConstructor(int id , String name)
	{
		this.id = id ;
		this.name = name ;
		
		System.out.println("paramaterized constructor called");
		
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorAndDefaultConstructor o1 = new ConstructorAndDefaultConstructor(10,  "chand");
		
		ConstructorAndDefaultConstructor o2 = new ConstructorAndDefaultConstructor();
		o2.name = "yesh" ;
		
		
		System.out.println(o1.name);
		
		System.out.println(o2.name);
	
		
		
	}
	
	

}
