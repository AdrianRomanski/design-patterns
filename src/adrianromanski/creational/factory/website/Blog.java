package adrianromanski.creational.factory.website;

import adrianromanski.creational.factory.page.AboutPage;
import adrianromanski.creational.factory.page.CommentPage;
import adrianromanski.creational.factory.page.ContactPage;
import adrianromanski.creational.factory.page.PostPage;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
