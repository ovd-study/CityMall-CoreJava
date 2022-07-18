package com.ovd.citymall.shop;

public class FurnitureShop extends Shop {

	public FurnitureShop(String name) {
		super(name);
		init();
	}

	private void init() {
		departmentList.add(new Department("Kitchen"));
		departmentList.add(new Department("Living"));
		departmentList.add(new Department("Bed"));
	}
}
