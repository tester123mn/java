package practice;

public class Mahindra {
	public static void main(String[] args) {
		Car c = new Car("thar", 800000, new Engine("Petrol", "Aluminium", 5));
		System.out.println("Brand=" + c.brand);
		System.out.println("Price=" + c.price);
		System.out.println("Type=" + c.e.type);
		System.out.println("Geer=" + c.e.geer);
		System.out.println("Meterial=" + c.e.meterial);
		System.out.println("=====================================");
		Car c1 = new Car("Scrpio", 700000, new Engine("Disel", "Cupper", 5));
		System.out.println("Brand=" + c1.brand);
		System.out.println("Price=" + c1.price);
		System.out.println("Type=" + c1.e.type);
		System.out.println("Geer=" + c1.e.geer);
		System.out.println("meterial=" + c1.e.meterial);

	}

}
