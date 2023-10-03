package Test_Scripts;

import org.testng.annotations.Test;

public class ThoofanTest {
	@Test(groups = "smoke")
	public void ttest() {
		System.out.println("Destiny");
	}

	@Test(groups = "regression")
	public void ttest1() {
		System.out.println("Reached");
	}


	@Test(groups = "smoke")
	public void ttest2() {
		System.out.println("Reached Done");

	}

	@Test(groups = "smoke")
	public void ttest3() {
		System.out.println("KGF_3");

	}

	
}
