package practice;

public class Car {

	String brand;
	double price;
	Engine e;//has-a relationship

	Car() {
	}

	Car(String brand, double price, Engine e) {
		this.brand = brand;
		this.price = price;
		this.e = e;

	}
}
