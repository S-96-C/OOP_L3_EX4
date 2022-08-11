public class Student{
	private String name, dit, address;
	
	public void getDetails(){
		String s =  "I am a Student. \nMy name is " + getName() + "\nI am from " + getAddress() +"\nMy dit no is " + getDit() + "\n";
		System.out.println(s);
	}
	
	//mutator methods
	public void setName(String newName) {
      name = newName;
	}
	public void setDit(String newDit) {
      dit = newDit;
	}
	public void setAddress(String newAddress) {
      address = newAddress;
	}
	
	//accessor methods
	public String getName() {
      return name;
	}
	public String getDit() {
      return dit;
	}
	public String getAddress() {
      return address;
	}
}
