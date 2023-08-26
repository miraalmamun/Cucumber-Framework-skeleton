package mir.managers;

import mir.pages.HomePage;
import mir.pages.LoginPage;

public class PageObjectManager {

    public HomePage homePage;
    public LoginPage loginPage;
    WebDriverManager app;

    public PageObjectManager()
    {
        System.out.println("PageObjectManager Constructor");
        app = new WebDriverManager();
    }
    public HomePage getHomePage()
    {
        return (homePage == null) ? homePage = new HomePage(app) : homePage;
    }
    public LoginPage getLoginPage()
    {
        return (loginPage == null) ? loginPage = new LoginPage(app) : loginPage;
    }
}
