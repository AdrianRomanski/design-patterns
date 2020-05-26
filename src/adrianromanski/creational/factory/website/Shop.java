package adrianromanski.creational.factory.website;

import adrianromanski.creational.factory.page.CartPage;
import adrianromanski.creational.factory.page.ItemPage;
import adrianromanski.creational.factory.page.SearchPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
