package models;

public class Category {

    private String name;
    private String description;
    private String color;

    public Category (String name, String description, String color){
        this.name = name;
        this.description = description;
        this.color = color;
    }

    public Category(){
        this.name = "";
        this.description = "";
        this.color = "";
    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public String getColor(){
        return this.color;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setColor(String color){
        this.color = color;
    }
}
