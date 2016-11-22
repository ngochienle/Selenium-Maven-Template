package com.lazerycode.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lazerycode.selenium.DriverBase;

public class HAWStaffsIT extends DriverBase {

    @Test
    public void hawStaffs() throws Exception {
        // Create a new WebDriver instance
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = getDriver();

        driver.get("https://www.haw-hamburg.de/ti-i/unser-department/beschaeftigte.html");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // staffs table
        // WebElement staffsTable =
        // driver.findElement(By.xpath("//table[@class='kurzprofil_tabelle']"));

        // specified data row
        WebElement staffEmail =
                driver.findElement(
                        By.xpath(
                                "//*[contains(text(), 'ilona.blanck(@)haw-hamburg.de')]/../../../td[1]"));

        System.out.println(staffEmail.getText());
        System.out.println(staffEmail.getTagName());

        //
        // find sibling

        // Find the text input element by its name


        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        // (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
        // @Override
        // public Boolean apply(WebDriver d) {
        // return d.getTitle().toLowerCase().startsWith("cheese!");
        // }
        // });

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
    }

    // @Test
    // public void googleMilkExample() throws Exception {
    // // Create a new WebDriver instance
    // // Notice that the remainder of the code relies on the interface,
    // // not the implementation.
    // WebDriver driver = getDriver();
    //
    // // And now use this to visit Google
    // driver.get("http://www.google.com");
    // // Alternatively the same thing can be done like this
    // // driver.navigate().to("http://www.google.com");
    //
    // // Find the text input element by its name
    // WebElement element = driver.findElement(By.name("q"));
    //
    // // Enter something to search for
    // element.clear();
    // element.sendKeys("Milk!");
    //
    // // Now submit the form. WebDriver will find the form for us from the element
    // element.submit();
    //
    // // Check the title of the page
    // System.out.println("Page title is: " + driver.getTitle());
    //
    // // Google's search is rendered dynamically with JavaScript.
    // // Wait for the page to load, timeout after 10 seconds
    // (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
    // @Override
    // public Boolean apply(WebDriver d) {
    // return d.getTitle().toLowerCase().startsWith("milk!");
    // }
    // });
    //
    // // Should see: "cheese! - Google Search"
    // System.out.println("Page title is: " + driver.getTitle());
    // }
}