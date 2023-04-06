package oops.programs;

class Plant {

	String name = "Tulsi";

	public void showName() {
		System.out.println("name of the plant: " + name);
		String Uses = ("It is a Medicinal plant used for curing cough,cold etc");
		System.out.println("Effective for: " + Uses);
	}

}

class PlantUse extends Plant {

}

public class SimpleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlantUse p = new PlantUse();
		p.showName();

	}

}
