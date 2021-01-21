package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class menu {

    // Class Variables
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    // Constructors
    public menu () {
        this.lastUpdated = new Date();
    }


    // Methods
    // Getters and Setters
    public ArrayList<MenuItem> getMenuItems() { return this.menuItems; }

    public void setMenuItems (ArrayList<MenuItem> menuItems) { this.menuItems = menuItems; }

    public Date getLastUpdated() { return this.lastUpdated; }

    public void setLastUpdated () { this.lastUpdated = lastUpdated; }
}
