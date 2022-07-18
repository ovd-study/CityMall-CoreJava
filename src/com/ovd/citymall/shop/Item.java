package com.ovd.citymall.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Item {
	String name;
	double price;
	ArrayList<Item> cart = new ArrayList<Item>();
	Department department;

	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void displayMenu(Department department) {
		this.department = department;
		Scanner scan = new Scanner(System.in);
		System.out.println("Your selected Item is: \n  Name:" + name + " \n  Price:" + price + "\n");
		System.out.println("Do you want to add this item to your cart (Y/N) ?");
		String userSelection = scan.nextLine();

		if ("Y".equalsIgnoreCase(userSelection) || "YES".equalsIgnoreCase(userSelection)) {
			cart.add(this);
		}
		department.displayMenu(department.getShop());
		scan.close();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
