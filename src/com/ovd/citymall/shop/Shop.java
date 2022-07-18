package com.ovd.citymall.shop;

import java.util.ArrayList;
import java.util.Scanner;

import com.ovd.citymall.MyUtils;

public class Shop {
	String name;
	int contactNumber;
	String website;
	ArrayList<Department> departmentList = new ArrayList<Department>();
	ShopCategory shopCategory;

	public Shop(String name) {
		super();
		this.name = name;
	}

	public void displayMenu(ShopCategory shopCategory) {
		this.shopCategory = shopCategory;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nWelcome to " + name + "!");
		System.out.println("\nList of Departments:");

		for (int i = 0; i < departmentList.size(); i++) {
			System.out.println("  " + (i + 1) + ". " + departmentList.get(i).getName());
		}
		System.out.println("\n X - to go back");

		System.out.println("");
		System.out.println("Please select a number corresponding Shop you want to enter: ");
		String userSelection = scan.nextLine();
		if (MyUtils.isInt(userSelection)) {
			int userSelectionInt = Integer.parseInt(userSelection);
			if (userSelectionInt <= departmentList.size()) {
				departmentList.get(userSelectionInt - 1).displayMenu(this);
			}
		} else {
			if ("X".equalsIgnoreCase(userSelection)) {
				shopCategory.displayMenu(shopCategory.getMall());
			}
		}
		displayMenu(shopCategory);
		scan.close();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int number) {
		this.contactNumber = number;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public ArrayList<Department> getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(ArrayList<Department> departmentList) {
		this.departmentList = departmentList;
	}

	public ShopCategory getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(ShopCategory shopCategory) {
		this.shopCategory = shopCategory;
	}

}
