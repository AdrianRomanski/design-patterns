package adrianromanski.pluralsight.bryan_hansen.creational.factory.website;

import adrianromanski.pluralsight.bryan_hansen.creational.factory.page.AboutPage;
import adrianromanski.pluralsight.bryan_hansen.creational.factory.page.CommentPage;
import adrianromanski.pluralsight.bryan_hansen.creational.factory.page.ContactPage;
import adrianromanski.pluralsight.bryan_hansen.creational.factory.page.PostPage;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
