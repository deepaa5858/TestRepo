package com.MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void openbrowser() {
		System.out.println("Trying to open the browser");

	}

	@After
	public void closebrowser() {
		System.out.println("Trying to CLOSE the browser");

	}

}
