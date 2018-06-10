package animals;

public class Main {

	public static void main(String[] args) {
		DomesticAnimal buddy = new Dog(13, "Buddy","inside","boxer");
		buddy.goToWashroom();
		System.out.println(buddy.Location);
	}

}
