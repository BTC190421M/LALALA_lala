package com.bit.test;

import org.junit.Test;

import com.page.ActiveWearPage;
import com.page.HomePage;
import com.page.ProductDetailPage;
import com.page.ResultsForJuniorsPage;

public class SmokeTest extends BaseTest {
			HomePage homepage;
			ActiveWearPage activeWearPage;
			ResultsForJuniorsPage resultsForJuniorsPage;
			ProductDetailPage productDetailPage;

			@Test
			public void m1() throws InterruptedException {
				homepage = new HomePage(driver);
				homepage.hoverOverOnBackToSchool();
				activeWearPage = homepage.clickOnActiveWear();
				resultsForJuniorsPage = activeWearPage.clickOnJuniors();
				productDetailPage = resultsForJuniorsPage.clickOnJunior();
				productDetailPage.selectSize();
				productDetailPage.clickOnAddToCart();
				Thread.sleep(5000);
				productDetailPage.clickOnCheckOut();

			}

		
	}


