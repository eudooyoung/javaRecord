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
        boolean isUpdated = false;
        for (MenuItem menuItem : this.menuItemList) { //this.menuItemList의 n번째 인덱스를 MenuItem class 형식으로 받아 menuItem에 반환하겠다는 뜻.
            if (menuItem.getName().equalsIgnoreCase(name)) {
                if (newPrice <= 0) {
                    System.out.println("가격을 0보다 높게 설정하세요");
                } else {
                    menuItem.setPrice(newPrice);
                    isUpdated = true;
                }
            } else {
                System.out.println("해당 메뉴를 찾을 수 없습니다.");
            }
        }
        return isUpdated;
    }

    public MenuItem findMenuItem(String name) {
        MenuItem item = null;
        for (MenuItem menuItem : menuItemList) {
            if (menuItem.getName().equalsIgnoreCase(name)) {
                item = menuItem;
                break;
            }
        }
        return item;
    }

    public boolean deleteMenuItem(String name) {
        boolean isDeleted = false;
        for (int i = 0; i < this.menuItemList.size(); i++) {
            if (this.menuItemList.get(i).getName().equalsIgnoreCase(name)) {
                this.menuItemList.remove(i);
                isDeleted = true;
                break;
            }
        }
        return isDeleted;
    }
}
