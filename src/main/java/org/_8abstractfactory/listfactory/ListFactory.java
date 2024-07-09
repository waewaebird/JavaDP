package org._8abstractfactory.listfactory;

import org._8abstractfactory.factory.Factory;
import org._8abstractfactory.factory.Link;
import org._8abstractfactory.factory.Page;
import org._8abstractfactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
