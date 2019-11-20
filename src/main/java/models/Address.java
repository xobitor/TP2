package models;

public class Address {
    private String streetName;
    private int doorNo;
    private int postalCode;

    public Address (String streetName, int doorNo, int postalCode){
        this.streetName = streetName;
        this.doorNo = doorNo;
        this.postalCode = postalCode;
    }

    public String getStreetName(){
        return this.streetName;
    }
    public int getDoorNo(){
        return this.doorNo;
    }
    public int getPostalCode(){
        return this.postalCode;
    }

    public void setStreetName(String streetName){
        this.streetName = streetName;
    }
    public void setDoorNo(int doorNo){
        this.doorNo = doorNo;
    }
    public void setPostalCode(int postalCode){
        this.postalCode = postalCode;
    }

    @Override
    public String toString(){
        return getStreetName() + ", Door no. " + getDoorNo() + ", " + getPostalCode();
    }
}
