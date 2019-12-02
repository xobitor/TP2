package models;

public class Product {

    private String name;
    private String description;
    private String picture = "picture";
    private Category category;
    private double price;
    private String unityType;
    private Brand brand;

    public Product(){
        this.name = "";
        this.description = "";
        this.picture = "";
        this.category = new Category();
        this.unityType = "";
        this.brand = new Brand();
    }

    public Product (String name, String description, String picture, Category category, double price, String unityType, Brand brand){
        this.name = name;
        this.description = description;
        this.picture = picture;
        this.category = category;
        this.price = price;
        this.unityType = unityType;
        this.brand = brand;
    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public String getPicture(){
        return this.picture;
    }
    public Category getCategory(){
        return this.category;
    }
    public String getCategoryName(){
        return this.category.getName();
    }
    public String getCategoryColor(){
        return this.category.getColor();
    }
    public double getPrice(){
        return this.price;
    }
    public String getUnityType(){
        return this.unityType;
    }
    public Brand getBrand() { return this.brand; }

    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPicture(String picture){
        this.picture = picture;
    }
    public void setCategory(Category category){
        this.category = category;
    }
    public void setCategoryName(String categoryName){
        this.category.setName(categoryName);
    }
    public void setCategoryColor(String categoryColor){
        this.category.setColor(categoryColor);
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setUnityType(String unityType){
        this.unityType = unityType;
    }
    public void setBrand(Brand brand) { this.brand = brand; }
}
