package oops.programs;

class mobile {
	String mob_name = "Samsung";

	void showmob_name() {
		System.out.println("Mobile type: " + mob_name);
	}
}

class android extends mobile {
	String ios = "android";

	void displayios() {
		System.out.println("samsumg os: " + ios);

	}
}

class version extends android {
	String version = "16 pro";

	void displayversion() {
		System.out.println("samsung version: " + version);

	}
}

public class InheritanceMultilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		version v = new version();
		v.showmob_name();
		v.displayios();
		v.displayversion();

	}

}
