package has_a_relation.sample;

public class Address{
	
	String street, city;
	int zipcode;
	
	Address(String street, String city, int zipcode){
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}
}