package animals;

public class DomesticAnimal {
	int age;
	String name;
	String Location;
	boolean bladderfull = true;
	
	public DomesticAnimal(int a, String n,String l) {
		this.age = a;
		this.name = n;
		this.Location = l;
		
	}
	public void goToWashroom() {
		this.bladderfull = false;
	}

}
