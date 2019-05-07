package com.mobileUtilities_iOS;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.baseClasses.AutomationException;
import com.baseClasses.BaseClass_Web;
import com.baseClasses.HtmlReport;
import com.baseClasses.PDFResultReport;
import com.baseClasses.Sendmail;
import com.baseClasses.ThreadLocalWebdriver;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class BaseClass_iOS {
	static boolean b = true;
	// public static Properties prop=null;
	public WebDriverWait wait = null;
	public String TestReportspath;
	public String suiteName;
	public String TestName = null;
	public final SimpleDateFormat DATE_FORMAT_NOW = new SimpleDateFormat("yyyyMMddHHmmss");

	public String filepath = System.getProperty("user.dir") + "\\src\\TestResults\\RouteCreation.htm";
	public String imagepath = System.getProperty("user.dir") + "\\src\\TestResults\\RouteCreation.jpg";
	public String winHandleBefore = null;
	private String errorMsg;
	public List<String> desc = new ArrayList<>();
	int r;
	String baseURL, nodeURL;
	public Map<String, String> reportDetails = new HashMap();
	public Logger log = Logger.getLogger(BaseClass_Web.class);
	// public static String PreUniqueCaseIDValue=null;
	public PDFResultReport pdfResultReport = new PDFResultReport();
	public String TestFullName = null;
	public HtmlReport htmlrep = new HtmlReport();

	public void setWithText(String locator, String data) throws Exception {
		try {
			ThreadLocaliOSDriver.getDriver().findElementByIosUIAutomation("UiSelector().text(\"" + locator + "\")")
					.clear();
			ThreadLocaliOSDriver.getDriver().findElementByIosUIAutomation("UiSelector().text(\"" + locator + "\")")
					.sendKeys(data);
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in entering the text in element:" + localRuntimeException.getMessage() + "Fail");
			pdfResultReport.addStepDetails("Enter Text", "Text Element should be enabled",
					"Error in entering the text in element: " + localRuntimeException.getMessage(), "FAIL", "N");
			throw new AutomationException(
					"Error in entering the text in element: " + localRuntimeException.getMessage());
		}
	}

	public void setWithTextAndIndex(String locator, int no, String data) throws Exception {
		try {
			ThreadLocaliOSDriver.getDriver()
					.findElementByIosUIAutomation("UiSelector().text(\"" + locator + "\").instance(" + no + ")")
					.clear();
			ThreadLocaliOSDriver.getDriver()
					.findElementByIosUIAutomation("UiSelector().text(\"" + locator + "\").instance(" + no + ")")
					.sendKeys(data);
		} catch (RuntimeException localRuntimeException) {
			pdfResultReport.addStepDetails("findByText method", "Mobile Should find the Element",
					"Error in finding the element in mobile:" + localRuntimeException.getMessage(), "FAIL", "N");
			throw new AutomationException(
					"Error in finding the element in mobile" + localRuntimeException.getMessage());
		}
	}

	public void setWithResourceId(String locator, String data) throws Exception {
		try {
			ThreadLocaliOSDriver.getDriver()
					.findElementByIosUIAutomation("UiSelector().resourceId(\"" + locator + "\")").clear();
			ThreadLocaliOSDriver.getDriver()
					.findElementByIosUIAutomation("UiSelector().resourceId(\"" + locator + "\")").sendKeys(data);
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in entering the text in element:" + localRuntimeException.getMessage() + "Fail");
			pdfResultReport.addStepDetails("Enter Text", "Text Element should be enabled",
					"Error in entering the text in element: " + localRuntimeException.getMessage(), "FAIL", "N");
			throw new AutomationException(
					"Error in entering the text in element: " + localRuntimeException.getMessage());
		}
	}

	public void setWithResourceIdAndIndex(String locator, int no, String data) throws Exception {
		try {
			ThreadLocaliOSDriver.getDriver()
					.findElementByIosUIAutomation("UiSelector().resourceId(\"" + locator + "\").instance(" + no + ")")
					.clear();
			ThreadLocaliOSDriver.getDriver()
					.findElementByIosUIAutomation("UiSelector().resourceId(\"" + locator + "\").instance(" + no + ")")
					.sendKeys(data);
		} catch (RuntimeException localRuntimeException) {
			pdfResultReport.addStepDetails("findByText method", "Mobile Should find the Element",
					"Error in finding the element in mobile:" + localRuntimeException.getMessage(), "FAIL", "N");
			throw new AutomationException(
					"Error in finding the element in mobile" + localRuntimeException.getMessage());
		}
	}

	public void setWithClassName(String locator, String data) throws Exception {
		try {
			ThreadLocaliOSDriver.getDriver().findElementByIosUIAutomation("UiSelector().className(\"" + locator + "\")")
					.clear();
			ThreadLocaliOSDriver.getDriver().findElementByIosUIAutomation("UiSelector().className(\"" + locator + "\")")
					.sendKeys(data);
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in entering the text in element:" + localRuntimeException.getMessage() + "Fail");
			pdfResultReport.addStepDetails("Enter Text", "Text Element should be enabled",
					"Error in entering the text in element: " + localRuntimeException.getMessage(), "FAIL", "N");
			throw new AutomationException(
					"Error in entering the text in element: " + localRuntimeException.getMessage());
		}
	}

	public void setWithClassNameAndIndex(String locator, int no, String data) throws Exception {
		try {
			ThreadLocaliOSDriver.getDriver()
					.findElementByIosUIAutomation("UiSelector().className(\"" + locator + "\").instance(" + no + ")")
					.clear();
			ThreadLocaliOSDriver.getDriver().findElementByIosUIAutomation("UiSelector().className(\"" + locator + "\")")
					.sendKeys(data);
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in entering the text in element:" + localRuntimeException.getMessage() + "Fail");
			pdfResultReport.addStepDetails("Enter Text", "Text Element should be enabled",
					"Error in entering the text in element: " + localRuntimeException.getMessage(), "FAIL", "N");
			throw new AutomationException(
					"Error in entering the text in element: " + localRuntimeException.getMessage());
		}
	}

	public void clickByText(String locator) throws Exception {
		try {
			ThreadLocaliOSDriver.getDriver().findElementByIosUIAutomation("UiSelector().text(\"" + locator + "\")")
					.click();
		} catch (RuntimeException localRuntimeException) {
			pdfResultReport.addStepDetails("findByText method", "Mobile Should find the Element",
					"Error in finding the element in mobile:" + localRuntimeException.getMessage(), "FAIL", "N");
			throw new AutomationException(
					"Error in finding the element in mobile" + localRuntimeException.getMessage());
		}
	}

	public void clickByTextWithIndex(String locator, int no) throws Exception {
		try {
			ThreadLocaliOSDriver.getDriver()
					.findElementByIosUIAutomation("UiSelector().text(\"" + locator + "\").instance(" + no + ")")
					.click();
		} catch (RuntimeException localRuntimeException) {
			pdfResultReport.addStepDetails("findByText method", "Mobile Should find the Element",
					"Error in finding the element in mobile:" + localRuntimeException.getMessage(), "FAIL", "N");
			throw new AutomationException(
					"Error in finding the element in mobile" + localRuntimeException.getMessage());
		}
	}

	public void clickByResourceId(String locator) throws Exception {
		try {
			ThreadLocaliOSDriver.getDriver()
					.findElementByIosUIAutomation("UiSelector().resourceId(\"" + locator + "\")");
		} catch (RuntimeException localRuntimeException) {
			pdfResultReport.addStepDetails("findByText method", "Mobile Should find the Element",
					"Error in finding the element in mobile:" + localRuntimeException.getMessage(), "FAIL", "N");
			throw new AutomationException(
					"Error in finding the element in mobile" + localRuntimeException.getMessage());
		}
	}

	public void clickByResourceIdWithIndex(String locator, int no) throws Exception {
		try {
			ThreadLocaliOSDriver.getDriver()
					.findElementByIosUIAutomation("UiSelector().resourceId(\"" + locator + "\").instance(" + no + ")")
					.click();
		} catch (RuntimeException localRuntimeException) {
			pdfResultReport.addStepDetails("findByText method", "Mobile Should find the Element",
					"Error in finding the element in mobile:" + localRuntimeException.getMessage(), "FAIL", "N");
			throw new AutomationException(
					"Error in finding the element in mobile" + localRuntimeException.getMessage());
		}
	}

	public void click(WebElement elem) throws Exception {
		//try {
			elem.click();
		//} catch (RuntimeException localRuntimeException) {
		//	System.out.println("Error in clicking the element:" + localRuntimeException.getMessage() + "Fail");
		//	pdfResultReport.addStepDetails("Click on Element", "Click operation should be done",
		//			"Error in clicking the element: " + localRuntimeException.getMessage(), "FAIL", "N");
		//	throw new AutomationException("Error in clicking the element: " + localRuntimeException.getMessage());
		//}
	}

	public void click(By locator) throws Exception {
		// try {
		try {
			waitForElement(locator, 12);
			click(ThreadLocaliOSDriver.getDriver().findElement(locator));
			log.info("Clicked on the field :" + locator);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * } catch (RuntimeException localRuntimeException) {
		 * System.out.println("Error in clicking the element:" +
		 * localRuntimeException.getMessage() + "Fail");
		 * pdfResultReport.addStepDetails("Click on Element",
		 * "Click operation should be done", "Error in clicking the element: " +
		 * localRuntimeException.getMessage(), "FAIL","N"); throw new
		 * AutomationException("Error in clicking the element: " +
		 * localRuntimeException.getMessage()); }
		 */
	}

	
	public void webClick(By locator) throws Exception {
		// try {
		click(ThreadLocaliOSDriver.getDriver().findElement(locator));
		click(locator);
		log.info("Clicked on the field :" + locator);
	}
	
	public boolean JSClick(By locator, String locatorName) throws Throwable {
		boolean flag = false;
		try {
			System.out.println("changed");
			WebElement element = ThreadLocaliOSDriver.getDriver().findElement(locator);
			JavascriptExecutor executor = (JavascriptExecutor) ThreadLocaliOSDriver.getDriver();
			executor.executeScript("arguments[0].click();", element);
			flag = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} /*finally {
			if (!flag) {
				System.out.println("MouseOver " + " MouseOver action is not perform on " + locatorName);
				return flag;
			} else if (b && flag) {
				System.out.println("MouseOver " + " MouserOver Action is Done on " + locatorName);
				return flag;
			}

		}*/
		return flag;
	}

	public void set(By locator, String data) throws Exception {
		try {
			
			ThreadLocaliOSDriver.getDriver().findElement(locator).clear();
			ThreadLocaliOSDriver.getDriver().findElement(locator).sendKeys(data);
			log.info("Entered the value :" + data + " in the field :" + locator);
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in entering the text in element:" + localRuntimeException.getMessage() + "Fail");
			pdfResultReport.addStepDetails("Enter Text", "Text Element should be enabled",
					"Error in entering the text in element: " + localRuntimeException.getMessage(), "FAIL", "N");
			throw new AutomationException(
					"Error in entering the text in element: " + localRuntimeException.getMessage());
		}
	}

	public void setWithEnter(By locator) throws Exception {
		try {
			ThreadLocaliOSDriver.getDriver().findElement(locator).sendKeys(Keys.ENTER);
			log.info("Clicked on the enter key");
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in entering the text in element:" + localRuntimeException.getMessage() + "Fail");
			pdfResultReport.addStepDetails("Enter Text", "Text Element should be enabled",
					"Error in entering the text in element: " + localRuntimeException.getMessage(), "FAIL", "N");
			throw new AutomationException(
					"Error in entering the text in element: " + localRuntimeException.getMessage());
		}
	}
	/*
	 * public static void set(WebElement elem, String data) throws
	 * AutomationException { try { elem.clear(); elem.sendKeys(data); } catch
	 * (RuntimeException localRuntimeException) {
	 * System.out.println("Error in entering the text in element:" +
	 * localRuntimeException.getMessage() + "Fail");
	 * PDFResultReport.addStepDetails("Enter Text",
	 * "Text Element should be enabled", "Error in entering the text in element: " +
	 * localRuntimeException.getMessage(), "FAIL","N"); throw new
	 * AutomationException("Error in entering the text in element: " +
	 * localRuntimeException.getMessage()); } }
	 */

	public void swipe(int startx, int starty, int endx, int endy) {
		System.out.println("test");
		// ThreadLocaliOSDriver.getDriver().swipe(startx, starty, endx, endy, 1000);
		TouchAction t = new TouchAction<>(ThreadLocaliOSDriver.getDriver());
		// t.press(startx, starty).waitAction().moveTo(endx, endy).release().perform();
		//t.longPress(startx, starty).waitAction().moveTo(endx, endy).release().perform();
		t.longPress(PointOption.point(startx, starty)).waitAction().moveTo(PointOption.point(endx, endy)).release().perform();
	}
	
	public void scroll(int startx, int starty, int endx, int endy) {
		System.out.println("test");
		// ThreadLocaliOSDriver.getDriver().swipe(startx, starty, endx, endy, 1000);
		TouchAction t = new TouchAction<>(ThreadLocaliOSDriver.getDriver());
		// t.press(startx, starty).waitAction().moveTo(endx, endy).release().perform();
		t.longPress(PointOption.point(startx, starty)).waitAction().moveTo(PointOption.point(endx, endy)).release().perform();
	}

	public void scrool(String text) throws Exception {
		Thread.sleep(2000);
		// ThreadLocaliOSDriver.getDriver().scrollTo(text);
	}

	
	public static boolean scrollIOS(By locator, String direction) {
		 boolean flag = true;
		 try {
		  JavascriptExecutor js = (JavascriptExecutor) ThreadLocaliOSDriver.getDriver();
		  Map<String, Object> params = new HashMap<>();
		     params.put("direction", direction);
		     params.put("name", locator);
		     js.executeScript("mobile: scroll", params);
		     Thread.sleep(500);
		 }
		 catch (Exception e) {
		  //LOG.info(e.getMessage());
		  e.printStackTrace();
		  flag = false;
		 }
		    return flag;
		}

	
	
	


	
	
	
	
	public void verifyElementsinAscending(By locator) throws Exception {
		try {
			ArrayList<String> obtainedList = new ArrayList<>();
			List<WebElement> elementList = ThreadLocaliOSDriver.getDriver().findElements(locator);
			System.out.println(elementList.size());
			for (int i = 0; i < elementList.size(); i++) {
				try {
					elementList.get(i).click();
					System.out.println(elementList.get(i).getAttribute("Value"));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			for (WebElement we : elementList) {
				obtainedList.add(we.getAttribute("label"));
			}
			System.out.println(obtainedList);
			ArrayList<String> sortedList = new ArrayList<>();
			for (String s : obtainedList) {
				sortedList.add(s);
			}
			Collections.sort(sortedList);
			Assert.assertTrue(sortedList.equals(obtainedList));

		} catch (RuntimeException localRuntimeException) {
			System.out.println(
					"Error in Sorting Elements in Ascending Order:" + localRuntimeException.getMessage() + "Fail");
			pdfResultReport.addStepDetails("Error in Sorting Elements in Ascending Order:",
					"It should verify elements in ascending Order",
					"Error in Sorting Elements in Ascending Order:: " + localRuntimeException.getMessage(), "FAIL",
					"N");
		}
	}

	public void waitForElement(By locator, int timer) throws Exception {
		try {
			for (int i = 0; i < timer; i++) {
				try {
					ThreadLocaliOSDriver.getDriver().findElement(locator).isDisplayed();
					System.out.println("Element is available :" + locator);
					break;
				} catch (RuntimeException localRuntimeException) {
					//Thread.sleep(1000);
					System.out.println("Waiting for........" + locator);
					Thread.sleep(1000);
				}
			}
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in performing Wait:" + localRuntimeException.getMessage() + "Fail");
			pdfResultReport.addStepDetails("Error in performing Wait:", "It should wait for the element",
					"Error in performing Wait:: " + localRuntimeException.getMessage(), "FAIL", "N");
			throw new AutomationException("Time Out Exception: " + localRuntimeException.getMessage());
		}
	}

	/*
	 * public static void wait(int timer, WebElement elem) throws
	 * AutomationException{ try { wait = new WebDriverWait(driver, timer);
	 * wait.until(ExpectedConditions.visibilityOf(elem)); } catch (RuntimeException
	 * localRuntimeException) { System.out.println("Error in performing Wait:" +
	 * localRuntimeException.getMessage() + "Fail"); throw new
	 * AutomationException("Time Out Exception: " +
	 * localRuntimeException.getMessage()); } }
	 */

	// public void verifyElement(By loc, String locatorName) throws
	// AutomationException {
	// try {
	// ThreadLocaliOSDriver.getDriver().findElement(loc).isDisplayed();
	// log.info("Element is available :"+locatorName);
	// }catch(Exception e) {
	// log.fatal("Element is not available :" +e.getMessage());
	// }
	// }

	public boolean verifyElementNotPresent(By loc, String locatorName) throws AutomationException {
		try {
			if (ThreadLocaliOSDriver.getDriver().findElement(loc).isDisplayed() == false) {
				log.info("Element is not available :" + locatorName);
				return true;
			} else {
				log.fatal("Element available :" + locatorName);
				return false;
			}
		} catch (Exception e) {
			log.fatal("Element is not available :" + e.getMessage());
			return false;
		}
	}

	public boolean verifyElement(By loc, String locatorName) throws AutomationException {
		try {
			if (ThreadLocaliOSDriver.getDriver().findElement(loc).isDisplayed() == true) {
				log.info("Element is available :" + locatorName);
				return true;
			} else {
				log.fatal("Element not available :" + locatorName);
				return false;
			}
		} catch (Exception e) {
			log.fatal("Element is not available :" + e.getMessage());
			return false;
		}
	}

	public static boolean ischeckboxcheckedbbydefault(WebElement elem) {
		if (elem.getAttribute("checked") != null) {
			return true;
		} else {
			return false;
		}
	}

	public static void clickCheckBox(WebElement elem, boolean paramBoolean) throws AutomationException {
		try {
			if ((!elem.isSelected()) && (paramBoolean) || (elem.isSelected()) && (paramBoolean == false))
				elem.click();
			else if ((elem.isSelected()) && (paramBoolean) || (!elem.isSelected()) && (paramBoolean == false))
				System.out.println("UnChecked the CheckBox");
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in clicking Checkbox:" + localRuntimeException.getMessage() + "Fail");
			// PDFResultReport.addStepDetails("Select Check box", "User should able to
			// select the Checkbox", "Error in clicking Checkbox: " +
			// localRuntimeException.getMessage(), "FAIL","N");
			throw new AutomationException("Error in clicking Checkbox: " + localRuntimeException.getMessage());
		}
	}

	public static void verifyElementIsEnabled(WebElement elem, boolean paramBoolean) throws AutomationException {
		try {
			boolean bool = elem.isEnabled();
			if (bool == paramBoolean)
				System.out.println("Element is present in expected state" + elem + "Pass");
			else
				System.out.println("Element is not present in expected state" + elem + "Fail");
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Element not found:" + elem + "Fail");
			// PDFResultReport.addStepDetails("Verify Element", "Element should be present",
			// "Element not found: " + localRuntimeException.getMessage(), "FAIL","N");
			throw new AutomationException("Element not found: " + localRuntimeException.getMessage());

		}
	}

	public static boolean isAlertPresent() throws AutomationException {
		boolean foundAlert = false;
		try {
			WebDriverWait wait = new WebDriverWait(ThreadLocaliOSDriver.getDriver(), 60L);
			wait.until(ExpectedConditions.alertIsPresent());
			foundAlert = true;
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in finding Alert Is Present:Fail");
			// PDFResultReport.addStepDetails("Verify Alert", "Alert should be present",
			// "Alert not found: " + localRuntimeException.getMessage(), "FAIL","N");
			throw new AutomationException("Alert not found: " + localRuntimeException.getMessage());
		}
		return foundAlert;
	}

	public static void handleConfirmation(String paramString) throws AutomationException {
		Alert localAlert = ThreadLocaliOSDriver.getDriver().switchTo().alert();
		if (localAlert != null) {
			if (paramString.trim().equalsIgnoreCase("Y")) {
				System.out.println("Alert accepted!!!");
				localAlert.accept();
			} else if (paramString.trim().equalsIgnoreCase("N")) {
				System.out.println("Alert Rejected!!!");
				localAlert.dismiss();
			}
		} else {
			System.out.println("Error in finding Alert:Fail");
			// PDFResultReport.addStepDetails("Verify Alert", "Alert should be present",
			// "Error in finding Alert: ", "FAIL","N");
			throw new AutomationException("Error in finding Alert: ");
		}
	}

	public void switchBackToOriginalBrowser() throws AutomationException {
		try {
			ThreadLocaliOSDriver.getDriver().switchTo().window(winHandleBefore);
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in switching to original Browser");
			// PDFResultReport.addStepDetails("Switch back to Original Browser", "Default
			// Browser should be present", "Error in switching to Original browser:
			// "+localRuntimeException.getMessage(), "FAIL","N");
			throw new AutomationException(
					"Error in switching to Original browser: " + localRuntimeException.getMessage());
		}

	}

	public static void sleep(float paramFloat) {
		try {
			long l1 = (long) (paramFloat * 1000.0F);
			long l2 = System.currentTimeMillis();
			while (l2 + l1 >= System.currentTimeMillis())
				;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static int getTableRowCount(String tableid) throws AutomationException {
		// By locator = By.xpath(String.format(new
		// CreatePartPages(driver).webTableLocator, tableid);
		// driver.findElement(locator).

		int iRowCount = 0;
		try {
			List<WebElement> iRows = ThreadLocaliOSDriver.getDriver().findElements(By.xpath(tableid));
			iRowCount = iRows.size();
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in fetching no. of rows:" + tableid + "Fail");
			// PDFResultReport.addStepDetails("Verify table row count", "Table should be
			// present", "Error in fetching no of rows in a table:
			// "+localRuntimeException.getMessage(), "FAIL","N");
			throw new AutomationException(
					"Error in fetching no of rows in a table: " + localRuntimeException.getMessage());
		}
		return iRowCount;
	}

	public static int getColHeaderNumber(String tableid, String colExpct) throws AutomationException {
		boolean blnStatus = false;
		int getColNum = 0;
		try {
			List<WebElement> iColumns = ThreadLocaliOSDriver.getDriver().findElements(By.xpath(tableid));
			for (int j = 1; j <= iColumns.size(); j++) {
				getColNum++;
				WebElement getdata = ThreadLocaliOSDriver.getDriver().findElement(By.xpath(tableid));
				if (getdata.getText().trim().toString().contains(colExpct)) {
					blnStatus = true;
					break;
				}
			}
			if (blnStatus)
				return getColNum;
			else
				return 0;
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in fatching the column header:" + colExpct + "in table:" + tableid + "Fail");
			// PDFResultReport.addStepDetails("Verify table column header", "Table should be
			// present", "Error in fetching the column header:
			// "+localRuntimeException.getMessage(), "FAIL","N");
			throw new AutomationException("Error in fetching the column header: " + localRuntimeException.getMessage());
		}
	}

	public static int getRowNumber(String tableid, String colExpct, String rowExpct) throws AutomationException {
		boolean blnStatus = false;
		int intRowNumber = 0;
		try {
			int iRowCount = getTableRowCount(tableid);
			int getColNumber = getColHeaderNumber(tableid, colExpct);

			for (int i = 1; i <= iRowCount; i++) {
				intRowNumber++;
				WebElement getdata = ThreadLocaliOSDriver.getDriver().findElement(
						By.xpath("//table[@id='" + tableid + "']/tbody/tr[" + i + "]/td[" + getColNumber + "]"));
				if (getdata.getText().trim().toString().contains(rowExpct.trim().toString())) {

					System.out.println("Expected data:" + rowExpct + " is present in row no." + intRowNumber
							+ "in column no." + colExpct + "inside table:" + tableid + "Pass");
					blnStatus = true;
					break;
				}
			}
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Unable to find row" + rowExpct + "in webtable:" + tableid + "Fail");
		}
		if (blnStatus)
			return intRowNumber;
		else
			return 0;
	}

	public static void pressEnterKey() {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void swtichToChildTab() {
		try {
			winHandleBefore = ThreadLocaliOSDriver.getDriver().getWindowHandle();
			System.out.println(winHandleBefore);
			String childHandl = (String) ThreadLocaliOSDriver.getDriver().getWindowHandles().toArray()[1];
			ThreadLocaliOSDriver.getDriver().switchTo().window(childHandl);
			ThreadLocaliOSDriver.getDriver().manage().window().maximize();
			System.out.println("Switched backed to child tab" + "Pass");
		} catch (Exception e) {
			System.out.println("Error in Switching back to child tab" + "fail");
		}

	}

	public void VerifyText(WebElement elem, String paramString2) {
		try {
			String selectedOption = new Select(elem).getFirstSelectedOption().getText();
			if (selectedOption.trim().equalsIgnoreCase(paramString2)) {
				System.out.println("Text was found :" + paramString2 + "Pass");
				// PDFResultReport.addStepDetails("Verify Element", "Element "+paramString2+"
				// should be available", "Element "+paramString2+" was found in DOM",
				// "PASS","N");
			} else {
				System.out.println("Text was not found :" + paramString2 + "Fail");
				// PDFResultReport.addStepDetails("Verify Element", "Element "+paramString2+"
				// should be available", "Element "+paramString2+" is not found", "FAIL","N");
			}
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Element was not found :" + elem + "Fail");
			// PDFResultReport.addStepDetails("Verify Element", "Element "+paramString2+"
			// should be available", "Error in finding the element", "FAIL","N");
			throw new AutomationException("Error in finding the Element: " + localRuntimeException.getMessage());
		}
	}

	public String getToolTipText(WebElement elem, String paramString1) throws AutomationException {
		String tooltip = null;
		try {
			if (elem != null) {
				tooltip = elem.getAttribute(paramString1);
			}
		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in Getting tool tip text:" + localRuntimeException.getMessage() + "Fail");
			throw new AutomationException(
					"Error in Getting tool tip text:" + localRuntimeException.getMessage() + "Fail");
		}
		return tooltip;
	}

	public static By getLocators(String paramString1, String paramString2) {
		if (paramString1.trim().equalsIgnoreCase("xpath"))
			return By.xpath(paramString2);
		if (paramString1.trim().equalsIgnoreCase("cssselector"))
			return By.cssSelector(paramString2);
		if (paramString1.trim().equalsIgnoreCase("tagname"))
			return By.tagName(paramString2);
		if (paramString1.trim().equalsIgnoreCase("id"))
			return By.id(paramString2);
		if (paramString1.trim().equalsIgnoreCase("name"))
			return By.name(paramString2);
		if (paramString1.trim().equalsIgnoreCase("linktext"))
			return By.linkText(paramString2);
		return null;
	}

	public String getdate(int period, String format) {
		Calendar currentDate = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		currentDate.add(Calendar.DAY_OF_MONTH, period);
		String date = formatter.format(currentDate.getTime());
		return date;
	}

	public static String getattributevalue(WebElement elem, String requiredattribute) throws Exception {
		String attribute = null;
		try {
			attribute = elem.getAttribute(requiredattribute);
		} catch (RuntimeException localRuntimeException) {
			// PDFResultReport.addStepDetails("Get Element Attribute", "Element attribute
			// should able to get", "Error in getting the Element attribute" + elem,
			// "FAIL","N");
		}
		return attribute;
	}

	public static void alertaction(String action) {

		try {
			if (action.equals("accept")) {
				ThreadLocaliOSDriver.getDriver().switchTo().alert().accept();
			} else if (action.equals("dismiss")) {
				ThreadLocaliOSDriver.getDriver().switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			System.out.println("Error in performing action on Alert box:" + action + "Fail");
		}

	}

	public String text(By locator) {
		String text = ThreadLocaliOSDriver.getDriver().findElement(locator).getText();
		System.out.println("The text is :" + text);
		return text;
	}
 
	public String value(By locator) throws InterruptedException {
		//Thread.sleep(1000);
		String value = ThreadLocaliOSDriver.getDriver().findElement(locator).getAttribute("value").toString();
		System.out.println("The text is :" + value);
		return value;
	}
	
	public static void capturesnapshot(String imagename) throws IOException {
		try {
			File srcFile = ((TakesScreenshot) ThreadLocaliOSDriver.getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File(getabsoluteimagepath(imagename)));
		}

		catch (Exception e) {
			System.out.println("Error in Capturing Screenshot:Fail");
		}

	}

	public void dragAndDrop(By question, By target) {
		WebElement e1 = ThreadLocaliOSDriver.getDriver().findElement(question);
		WebElement e2 = ThreadLocaliOSDriver.getDriver().findElement(target);
		Actions a = new Actions(ThreadLocaliOSDriver.getDriver());
		a.dragAndDrop(e1, e2).build().perform();
	}

	public static String getabsoluteimagepath(String imagename) {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File picturesDir = new File(classpathRoot, "//src//TestResults");
		File picture = new File(picturesDir, imagename);
		return picture.getAbsolutePath();
	}

	public static boolean verifyElementExist(WebElement elem) {
		boolean blnStatus = false;
		WebDriverWait localWebDriverWait = new WebDriverWait(ThreadLocaliOSDriver.getDriver(), 60L);
		try {
			localWebDriverWait.until(ExpectedConditions.presenceOfElementLocated((By) elem));
			System.out.println("Element is available:" + elem + "Pass");
			blnStatus = true;

		} catch (RuntimeException localRuntimeException) {
			System.out.println("Error in finding Element:" + localRuntimeException.getMessage() + "Pass");
		}
		return blnStatus;
	}

	public static void VerifyTableElement(String[] value1, String[] value2) {
		int n = 0;
		List<WebElement> iRows = ThreadLocaliOSDriver.getDriver()
				.findElements(By.xpath("//form[@name='frmFormView']/table/tbody/tr"));
		int iRowCount = iRows.size();
		for (int i = 0; i <= iRowCount; i++) {
			WebElement getdata1 = ThreadLocaliOSDriver.getDriver()
					.findElement(By.xpath("//form[@name='frmFormView']/table/tbody/tr[" + i + "]/td[1]"));
			WebElement getdata2 = ThreadLocaliOSDriver.getDriver()
					.findElement(By.xpath("//form[@name='frmFormView']/table/tbody/tr[" + i + "]/td[2]"));
			if ((getdata1.getText().trim().toString().equalsIgnoreCase(value1[i]))
					&& (getdata2.getText().trim().toString().equalsIgnoreCase(value2[i]))) {

			} else {
				n++;
			}
		}
		if (n == 0)
			System.out.println("PASS");
		else
			System.out.println("FAIL");

	}

	public static void waitForObj(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			;
		}
	}

	public static void handleAlert() {
		try {
			WebDriverWait localWebDriverWait = new WebDriverWait(ThreadLocaliOSDriver.getDriver(), 60L);
			localWebDriverWait.ignoring(NoAlertPresentException.class).until(ExpectedConditions.alertIsPresent());
			if (localWebDriverWait.until(ExpectedConditions.alertIsPresent()) != null) {
				if (isAlertPresent()) {
					Alert localAlert = ThreadLocaliOSDriver.getDriver().switchTo().alert();
					if (localAlert != null) {
						localAlert.accept();
					} else {
						System.out.println("Alert Not Present Here." + "Fail");

					}
				}
			}
		} catch (Exception e) {
			System.out.println("Error in handling alert" + e.getMessage() + "Fail");
		}
	}

	public void AutomationException(String paramString) {
		System.out.println("Error Message : " + paramString);
		this.errorMsg = paramString;
		if (ThreadLocaliOSDriver.getDriver() != null) {
			ThreadLocaliOSDriver.getDriver().quit();
			// ThreadLocalAndroidDriver.getDriver() = null;
		}
	}

	@BeforeSuite
	public void setUpSuiteDetails(ITestContext ctx) throws Exception {
		// pdfResultReport=new PDFResultReport();
		pdfResultReport.suiteName = ctx.getCurrentXmlTest().getSuite().getName();
		System.out.println("pdfResultReport.suiteName " + pdfResultReport.suiteName);
		pdfResultReport.generateSuiteResultFolder();
		TestReportspath = System.getProperty("user.dir") + "\\TestReports\\" + pdfResultReport.suiteName + "_"
				+ new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		pdfResultReport.generateSuiteResultFolder();
		pdfResultReport.DefaultReport("SummaryReport");
	}

	@BeforeMethod
	public void captureDesc(Method method) {
		Test test = method.getAnnotation(Test.class);
		if (!test.description().toString().equals("")) {
			desc.add(test.description());
		}
	}

	@AfterSuite
	public void afterSuite() throws Exception {

		try {
			pdfResultReport.createTestRunReport(reportDetails.get("Test Script Name"),
					reportDetails.get("Test Author Name"), false);
			pdfResultReport.generatePDFSummaryReport2(TestName);
			File path = pdfResultReport.suiteFolder;
			System.out.println("path ::::::::::::::" + path);
			htmlrep.generateHtmlReport(TestName);
			Sendmail.ComposeGmail("testingse2@gmail.com", "iostest1122@gmail.com", path);
			System.out.println("Mail sent successfully.......");
			System.out.println("Execution completed......................................");
		} catch (Exception ex) {
			System.out.println("Result Suite file is not being generated : " + ex.getMessage());
		}
	}

	@BeforeClass
	public void BeforeClass() throws Exception {
		TestName = this.getClass().getSimpleName();
		System.out.println("TestName ::::::::::::::::" + TestName);
		System.out.println(System.getProperty("user.dir") + "\\Resources\\TestData.xlsx");
		/*
		 * try{ excelReport.readTestDataFile(System.getProperty("user.dir")+
		 * "\\Resources\\TestData.xlsx",no); }catch(Exception
		 * e){System.out.println("Not available");}
		 */
		pdfResultReport.captureTestCaseStartTime();
		Thread.sleep(2000);
		pdfResultReport.createPDFfile(TestName);
		// setbrowser(browserName);
	}

	@AfterClass
	public void afterClass() throws Exception {
		pdfResultReport.createTestRunReport(reportDetails.get("Test Script Name"),
				reportDetails.get("Test Author Name"), true);
		pdfResultReport.addSummaryReport(TestName, desc.get(r), TestFullName);
		r++;
		pdfResultReport.captureTestCaseEndTime();
		pdfResultReport.generatePDFSummaryReport(TestName);
		pdfResultReport.writeChartToPDF(pdfResultReport.docWriter);
		pdfResultReport.generatePDFStepdetails(TestName);
		// flush();
	}

}
