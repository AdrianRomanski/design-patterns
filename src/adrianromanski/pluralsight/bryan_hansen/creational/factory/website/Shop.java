package adrianromanski.pluralsight.bryan_hansen.creational.factory.website;

import adrianromanski.pluralsight.bryan_hansen.creational.factory.page.CartPage;
import adrianromanski.pluralsight.bryan_hansen.creational.factory.page.ItemPage;
import adrianromanski.pluralsight.bryan_hansen.creational.factory.page.SearchPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
