package com.selePro2;

import org.testng.annotations.Test;

public class TestScript2Test3 {
	public class TestScript1Test {
		@Test(groups="smoke")
	public void ts1() {
		System.out.println("==TestScript 1===");
	}
		@Test
	public void ts2() {
		System.out.println("==TestScript 2===");
	}
		@Test
	public void ts3() {
		System.out.println("==TestScript 3===");
	}
		@Test
		public void ts4() {
			System.out.println("==TestScript 4===");
		}
}
}
