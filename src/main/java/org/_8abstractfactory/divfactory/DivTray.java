package org._8abstractfactory.divfactory;

import org._8abstractfactory.factory.Item;
import org._8abstractfactory.factory.Tray;

public class DivTray extends Tray {
    public DivTray(String caption) {
        super(caption);
    }
    @Override
    public String makeHTML(){
        StringBuilder sb = new StringBuilder();
        sb.append("<p><br>");
        sb.append(caption);
        sb.append("</b></p>\n");
        sb.append("<dib class=\"TRAY\">");
        for(Item item : tray) {
            sb.append(item.makeHTML());
        }
        sb.append("</div>\n");
        return sb.toString();
    }
}

