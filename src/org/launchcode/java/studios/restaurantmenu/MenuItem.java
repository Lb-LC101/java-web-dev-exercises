package org.launchcode.java.studios.restaurantmenu;

public class MenuItem {

    // Class Variables
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    // Constructors
    // critical information is passed in, optional info is set within constructor
    public MenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = "Not Categorized";
        this.isNew = false;
    }
    // all information is passed in
    public MenuItem(String name, String description, Double price, String category, Boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    // Methods

    //Getters and Setters
    public String getName() { return this.name; }

    public void setName() { this.name = name; }

    public String getDescription() { return this.description; }

    public void setDescription() { this.description = description; }

    public Double getPrice() { return this.price; }

    public void setPrice() { this.price = price; }

    public String getCategory() { return this.category; }

    public void setCategory() { this.category = category; }

    public Boolean getIsNew() { return this.isNew; }

    public void setIsNew() { this.isNew = isNew; }
}
