package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import testComponents.baseTest;

public class homePageTest extends baseTest {
	@Test
	public void validateLogo() {
		Assert.assertTrue(homepage.getImgTitle().equalsIgnoreCase("Your Store"));

	}

	@Test
	public void validate_Currency_Symbol() {
		//System.out.println("Links in header");
		Assert.assertTrue(homepage.check_Currency_Symbol());
	}

	/*
	 * @Test public void validate_LoginLink() throws InterruptedException {
	 * 
	 * Assert.assertTrue(homepage.getLogintab().equals("OpenCart - Account Login"));
	 * } /* public void validate_RegisterLink() {
	 * Assert.assertTrue(homepage.getRegistertab().
	 * equals("OpenCart - Account Register")); }
	 */

}
