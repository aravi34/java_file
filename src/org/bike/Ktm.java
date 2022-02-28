package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("Rupees two Lakhs");

	}

	@Override
	public void speed() {
		System.out.println("160 Kilometer per hour");

	}
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	}

}
