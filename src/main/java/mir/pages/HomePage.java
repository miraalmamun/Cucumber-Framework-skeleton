package mir.pages;

import mir.managers.WebDriverManager;

public class HomePage {

    WebDriverManager driver;
    public HomePage(WebDriverManager driver)
    {
        System.out.println("HomePage Constructor");
        this.driver = driver;
    }

    public void iAmHomePage()
    {
        System.out.println("I am Home Page");
    }
}
