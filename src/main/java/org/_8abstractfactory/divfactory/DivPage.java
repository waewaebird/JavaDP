package org._8abstractfactory.divfactory;

import org._8abstractfactory.factory.Item;
import org._8abstractfactory.factory.Page;

public class DivPage extends Page {
    public DivPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html><head><title>");
        sb.append(title);
        sb.append("</title></style>\n");
        sb.append("div.TRAY {}\n");
        sb.append("div.LINK {}\n");
        sb.append("</styles></head><body>\n");
        sb.append("<h1>\n");
        sb.append(title);
        sb.append("</h1>\n");
        for(Item item : content) {
            sb.append(item.makeHTML());
        }
        sb.append("<hr><address>");
        sb.append(author);
        sb.append("</address>\n");
        sb.append("</body></html>\n");
        return sb.toString();
    }
}
