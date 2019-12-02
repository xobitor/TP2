package models;

public class User {

    private String name;
    private String email;
    private String password;
    private Address address;
    private int maxValue;

    public User(){
        this.name = "";
        this.email = "";
        this.password  = "";
        this.address = new Address();
        this.maxValue = 0;
    }

    public User (String name, String email, String password, Address address, int maxValue){
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.maxValue = maxValue;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
    public Address getAddress(){
        return this.address;
    }
    public int getMaxValue() {
        return this.maxValue;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setAddress(Address address){
        this.address = address;
    }
    public void setMaxValue(int maxValue) {this.maxValue = maxValue;}
}
