package models;

import java.util.List;

public class ShoppingList {
    String listName;
    User user;
    List<User> userList;
    List<Product> ProductList1; //products not in cart
    List<Product> ProductList2; //products in cart

    public ShoppingList (String listName, User user, List<User> userList, List<Product> productList1, List<Product> productList2){
        this.listName = listName;
        this.user = user;
        this.userList = userList;
        this.ProductList1 = productList1;
        this.ProductList2 = productList2;
    }

    public String getListName(){
        return this.listName;
    }
    public String getUserName(){
        return this.user.getName();
    }
    public int getTotalOfProducts(){
        return ProductList1.size() + ProductList2.size();
    }
    public int getTotalOfProductsOffShoppingCart() { return ProductList1.size(); }
    public int getTotalOfProductsOnShoppingCart(){
        return ProductList2.size();
    }

    public double getPercentageCompleted(){
        double total;
        total = (float)getTotalOfProductsOnShoppingCart()/(getTotalOfProductsOffShoppingCart() + getTotalOfProductsOnShoppingCart());
        total = total * 100;
        return total;
    }
    public double getPriceOnShoppingCart(){
        double total = 0.0;
        int i;
        for (i=0; i < ProductList2.size(); i++){
            total += ProductList2.get(i).getPrice();
        }
        return total;
    }
    public float getPriceOffShoppingCart(){
        float total = 0;
        int i;
        for (i=0; i < ProductList1.size(); i++){
            total += ProductList1.get(i).getPrice();
        }
        return total;
    }
    public float getTotalPrice(){

        return (float)getPriceOnShoppingCart() + getPriceOffShoppingCart();
    }

    public void setListName(String listName){
        this.listName = listName;
    }
    public void setUser (User user){
        this.user = user;
    }
    public void addProduct (Product product){
        ProductList1.add(product);
    }
    public void removeProduct (Product product){
        ProductList1.remove(product);
    }
    public void addProductToShoppingCart (Product product){
        ProductList2.add(product);
        ProductList1.remove(product);
    }
    public void removeProductFromShoppingCart (Product product){
        ProductList1.add(product);
        ProductList2.remove(product);
    }

    public void addUserToUserList (User user){
        userList.add(user);
    }

}
