package com.ovd.citymall.shop;

import java.util.ArrayList;
import java.util.Scanner;

import com.ovd.citymall.Mall;
import com.ovd.citymall.MyUtils;

public class ShopCategory {
	String name;
	ArrayList<Shop> shopList = new ArrayList<Shop>();
	Mall mall;

	public ShopCategory(String name) {
		super();
		this.name = name;
		init();
	}

	private void init() {
		if (this.name.equals("Clothing")) {
			shopList.add(new ClothingShop("Nordstrom"));
			shopList.add(new ClothingShop("Express"));
			shopList.add(new ClothingShop("H & M"));
		} else if (this.name.equals("Sporting")) {
			shopList.add(new SportShop("Dick's Sporting Goods"));
			shopList.add(new SportShop("Play it Again"));
			shopList.add(new SportShop("Field & Stream"));
		} else if (this.name.equals("Furniture")) {
			shopList.add(new FurnitureShop("Ashley"));
			shopList.add(new FurnitureShop("Value City Furniture"));
			shopList.add(new FurnitureShop("Crate & Barrel"));
		} else if (this.name.equals("Book")) {
			shopList.add(new BookShop("Half Price Books"));
			shopList.add(new BookShop("Barnes & Noble"));
			shopList.add(new BookShop("Prologue Bookshop"));
		}
	}

	public void displayMenu(Mall mall) {
		this.mall = mall;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to " + name + "!");
		System.out.println("List of Shop:");

		for (int i = 0; i < shopList.size(); i++) {
			System.out.println((i + 1) + ". " + shopList.get(i).getName());
		}
		System.out.println("\n X - to go back");

		System.out.println("");
		System.out.print("Please select a number corresponding Shop you want to enter: ");
		String userSelection = scan.nextLine();
		if (MyUtils.isInt(userSelection)) {
			int userSelectionInt = Integer.parseInt(userSelection);
			if (userSelectionInt <= shopList.size()) {
				shopList.get(userSelectionInt-1).displayMenu(this);
			}
		} else {
			if ("X".equalsIgnoreCase(userSelection)) {
				mall.displayMenu(mall.getApp());
			}
		}
		displayMenu(mall);
		scan.close();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mall getMall() {
		return mall;
	}

	public void setMall(Mall mall) {
		this.mall = mall;
	}

}
