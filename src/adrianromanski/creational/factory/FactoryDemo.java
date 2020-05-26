package adrianromanski.creational.factory;

import adrianromanski.creational.factory.website.Website;
import adrianromanski.creational.factory.website.WebsiteFactory;
import adrianromanski.creational.factory.website.WebsiteType;

public class FactoryDemo {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println(site.getPages());
    }
}
