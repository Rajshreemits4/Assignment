package pkg_2;

public class Brand {
	public void levis() {
		System.out.println("Levis is the brand name");
	}

	public void lee() {
		System.out.println("Lee is the brand name");
	}

	public static void main(String[] args) {
		Clothing ref = new Clothing();
		ref.man();
		ref.kids();
	}
}
