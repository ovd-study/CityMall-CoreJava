package com.ovd.citymall.shop;

public class ClothingShop extends Shop {

	public ClothingShop(String name) {
		super(name);
		init();
	}

	private void init() {
		departmentList.add(new Department("Men"));
		departmentList.add(new Department("Women"));
		departmentList.add(new Department("Kid"));
	}
}
