package has_a_relation.sample;

public class Person_Address {

	public static void main(String[] args) {

		String fName="Sandeep";
		String lName="Singh";
		Address a=new Address("local", "Chennai", 120980);
		
		System.out.println("FName:"+fName);
		System.out.println("LName:"+lName);
		System.out.println("Street:"+a.street);
		System.out.println("City:"+a.city);
		System.out.println("ZipCode:"+a.zipcode);
			
	}
}