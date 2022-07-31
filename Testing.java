package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
// Untuk mengaktifkannya dengan cara un-comment
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kings\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();

        //==LOGIN==
//        String url = "https://kumparan.com/login";
//        driver.get(url);
//        testCaseLogin1(driver);
//        testCaseLogin2(driver);
//        testCaseLogin3(driver);
//        testCaseLogin4(driver);

        //==SEE NEWS==
//        String url = "https://kumparan.com/channel/news";
//        driver.get(url);
//        testCaseNews1(driver);
    }

    private static void testCaseLogin1(WebDriver driver) {
        driver.findElement(By.name("email")).sendKeys("zamzamnuruzzaman03@gmail.com");
        driver.findElement(By.name("password")).sendKeys("zamzam12");
        driver.findElement(By.xpath("//button[@data-qa-id='btn-save']")).click();
        String tl= "kumparan.com - Platform Media Berita Kolaboratif, Terkini Indonesia Hari Ini";
        System.out.print("Test Case 1: ");
        if(driver.getTitle().equalsIgnoreCase(tl)){
            System.out.println("Login Sukses");
        } else {
            System.out.println("Login Gagal");
        }
        driver.close();
    }

    private static void testCaseLogin2(WebDriver driver) {
       driver.findElement(By.name("email")).sendKeys("mangkudun03@gmail.com");
       driver.findElement(By.name("password")).sendKeys("zamzam12");
       driver.findElement(By.xpath("//button[@data-qa-id='btn-save']")).click();
       System.out.print("Test Case 2: ");
        if(driver.findElement(By.xpath("//*[@id='content']/div/div/div[3]/div/div[2]/div[1]/div/div[2]/div/span")).isDisplayed()){
            System.out.println("Login Gagal");
        } else {
            System.out.println("Login Sukse");
        }
   }

    private static void testCaseLogin3(WebDriver driver) {
        driver.findElement(By.name("email")).sendKeys("zamzamnuruzzaman03@gmail.com");
        driver.findElement(By.name("password")).sendKeys("zamzam009988");
        driver.findElement(By.xpath("//button[@data-qa-id='btn-save']")).click();
        System.out.print("Test Case 3: ");
        if(driver.findElement(By.xpath("//*[@id='ontent'/div/div/div[3]/div/div[2]/div[1]/div/div[2]/div/span")).isDisplayed()){
            System.out.println("Login Gagal");
        } else {
            System.out.println("Login Sukse");
        }
    }

    private static void testCaseLogin4(WebDriver driver) {
        driver.findElement(By.name("email")).sendKeys(" ");
        driver.findElement(By.name("password")).sendKeys(" ");
        driver.findElement(By.xpath("//button[@data-qa-id='btn-save']")).click();
        System.out.print("Test Case 4: ");
        if(driver.findElement(By.xpath("//*[@id='content']/div/div/div[3]/div/div[2]/div[1]/div/div[2]/div/span")).isDisplayed()){
            System.out.println("Login Gagal");
        } else {
            System.out.println("Login Sukses");
        }
    }

    private static void testCaseNews1(WebDriver driver){
        driver.findElement(By.xpath("//*[@id='content']/div/div/div[3]/div/div[4]/div[3]/div/div/div[2]/div/div[2]/div/div[1]/div/div/div")).click();
    }

}

