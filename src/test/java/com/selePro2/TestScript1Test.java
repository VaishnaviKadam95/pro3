package com.selePro2;

import org.testng.annotations.Test;

public class TestScript1Test {
	@Test(groups={"smoke"})
public void ts1() {
	System.out.println("==TS1===");
}
	@Test(groups={"smoke","regression"})
public void ts2() {
	System.out.println("==TS2===");
}
	@Test(groups={"smoke"})
public void ts3() {
	System.out.println("=TS 3===");
}
	
}
