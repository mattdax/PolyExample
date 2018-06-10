package animals;

public class Dog extends DomesticAnimal {
	String breed;
	public Dog(int a, String n,String l, String b) {
		super(a,n,l);
		this.breed =b;
	}
public void goToWashroom() {
	super.Location = "Outside";
	super.goToWashroom();
}


}
