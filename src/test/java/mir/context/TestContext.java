package mir.context;

import mir.managers.PageObjectManager;

public class TestContext {
    private PageObjectManager pageObjectManager;
    public TestContext() {
        System.out.println("Constructor TestContext");
        this.pageObjectManager = new PageObjectManager();
    }
    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
