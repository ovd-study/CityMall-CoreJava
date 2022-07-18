package com.ovd.citymall.shop;

public class SportShop extends Shop {

	public SportShop(String name) {
		super(name);
		init();
	}

	private void init() {
		departmentList.add(new Department("Basketball"));
		departmentList.add(new Department("Soccer"));
		departmentList.add(new Department("Football"));
	}

}
