package com.multi.collection.mvc.controller;

import com.multi.collection.mvc.model.dto.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class CafeController {

    private List<MenuItem> menuItemList = new ArrayList<>();

    public void addMenuItem(String name, String category, int price) {
        MenuItem menuItem = new MenuItem(name, category, price);
        menuItemList.add(menuItem);
    }

    public List<MenuItem> getMenuList() {
        return this.menuItemList;
    }

    public boolean updatePrice(String name, int newPrice) {
        for (int i = 0; i < this.menuItemList.size(); i++) {
            if (this.menuItemList.get(i).getName().equalsIgnoreCase(name)) {
                if (newPrice <= 0) {
                    System.out.println("가격을 0보다 높게 설정하세요");
                    return false;
                } else {
                    this.menuItemList.get(i).setPrice(newPrice);
                    return true;
                }
            }
        }
        System.out.println("해당 메뉴를 찾을 수 없습니다.");
        return false;
    }

    public MenuItem findMenuItem(String name) {
        for (int i = 0; i < this.menuItemList.size(); i++) {
            if(this.menuItemList.get(i).getName().equalsIgnoreCase(name)) {
                return this.menuItemList.get(i);
            }
        }
//        for (MenuItem m: this.menuItemList) {
//            if (m.getName().equalsIgnoreCase(name)) {
//                return m;
//            }
//        }
        return null;
    }

    public boolean deleteMenuItem(String name) {
        for (int i = 0; i < this.menuItemList.size(); i++) {
            if(this.menuItemList.get(i).getName().equalsIgnoreCase(name)) {
                 this.menuItemList.remove(i);
                 return true;
            }
        }
        return false;
    }
}
