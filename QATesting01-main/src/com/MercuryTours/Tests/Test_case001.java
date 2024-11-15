package com.MercuryTours.Tests;

import com.MercuryToursLIB.General;

public class Test_case001 {

	public static void main(String[] args) throws InterruptedException {
		//create class from "General"
General gl=new General();
gl.setup();
gl.adminLogin();
gl.adminLogout();
gl.Teardown();
	}

}
