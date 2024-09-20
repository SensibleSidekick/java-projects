package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    ArrayList<MenuItem> menuList = new ArrayList<>();
    String updated;

    public Menu(ArrayList<MenuItem> menuList, String updated) {
        this.menuList = menuList;
        this.updated = updated;
    }

    public void setItem (MenuItem aMenuItem, String aUpdate) {
        for (MenuItem list : menuList) {
            if (list.getIsNew()) {
                list.setIsNew(false);
            }
        }
        setUpdated(aUpdate);
        menuList.add(aMenuItem);
        aMenuItem.setIsNew(true);
    }

    public void setUpdated(String anUpdate) {
      updated = anUpdate;
    }

    public MenuItem getMenuList() {
        return System.out.println(menulist);
    }



}
