package mir.pages;

import mir.managers.WebDriverManager;

public class LoginPage {

    WebDriverManager driver;
    public LoginPage(WebDriverManager driver)
    {
        System.out.println("LoginPage Constructor");
        this.driver = driver;
    }

    public void iAmLoginPage()
    {
        System.out.println("I am Login Page");
    }




}
