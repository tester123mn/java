package object_Class;

import java.util.Objects;

public class Bus {
	String travelsName;
	String driverName;
	int price;
	String source;
	String destination;

	Bus() {
	}

	public Bus(String travelsName, String driverName, int price, String source, String destination) {
		super();
		this.travelsName = travelsName;
		this.driverName = driverName;
		this.price = price;
		this.source = source;
		this.destination = destination;
	}

	public String toString() {
		return "Travels Name=" + this.travelsName + "\n" + "Driver Name=" + this.driverName + "\n" + "Price="
				+ this.price + "\n" + "Source=" + this.source + "\n" + "Destination=" + this.destination;
	}

	public boolean equals(Object o) {
		Bus b = (Bus) o;
		if (this.travelsName.equals(b.travelsName) && this.driverName.equals(b.driverName) && this.price == b.price
				&& this.source.equals(b.source) && this.destination.equals(b.destination)) {
			return true;
		}
		return false;
	}

	public int hashcode() {
		return Objects.hash(travelsName, driverName, price, source, destination);
	}

}
