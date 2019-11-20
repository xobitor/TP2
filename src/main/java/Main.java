import java.util.List;
import java.util.ArrayList;

import models.*;

public class Main {

    public static void main(String args[]) {

        //INICIALIZAÇÃO E DECLARAÇÃO DE VARIÁVEIS E OBJETOS NECESSÁRIOS
        int i;
        Address address1 = new Address ("Rua 42", 34, 4710);
        Address address2 = new Address ("Avenida Zé Carlos", 2, 4500);

        User user1 = new User ("Tiago", "tiago@mail.com", "password", address1);
        User user2 = new User ("Sara", "sara@mail.com", "drowssap", address2);

        List<User> userList = new ArrayList<User>();
        userList.add(user1);

        List<Product> offCart = new ArrayList<Product>(); //lista de produtos que ainda não estão no carrinho
        List<Product> onCart = new ArrayList<Product>(); //lista de produtos que já estão no carrinho

        //CRIAÇÃO DE CATEGORIAS E PRODUTOS
        Category category1 = new Category ("Mercearia", "Arroz, massa", "Azul");
        Category category2 = new Category ("Fruta", "Maçãs, Bananas", "Amarelo");
        Category category3 = new Category ("Talho", "Carne fresca", "Vermelho");

        Product product1 = new Product ("Arroz agulha", "Arroz agulha generico", "picture", category1, 0.99, "un");
        Product product2 = new Product ("Mom's spaghetti", "Mom's spaghetti", "picture", category1, 0.89, "un");
        Product product3 = new Product ("Banana", "Banana da Madeira", "picture", category2, 1.00, "kg");
        Product product4 = new Product ("Peras Embaladas", "10x peras embaladas", "picture", category2, 1.19, "un");
        Product product5 = new Product ("Lombo de porco", "Lombinho de porquinho", "picture", category3, 3.00, "kg");
        Product product6 = new Product ("Carne picada de porco", "Carne picada", "picture", category3, 2.89, "kg");
        Product product7 = new Product ("Sal grosso", "Embalagem com 1kg de sal grosso", "picture", category1, 0.49, "un");


        ShoppingList shpList = new ShoppingList("Lista de Compras", user1, userList, offCart, onCart); //Criação da Lista de Compras

        shpList.addUserToUserList(user2); //Adicionar utilizador para partilhar a lista

        //ADICIONAR ELEMENTOS À LISTA DE COMPRAS
        shpList.addProduct(product1);
        shpList.addProduct(product2);
        shpList.addProduct(product3);
        shpList.addProduct(product4);
        shpList.addProduct(product5);
        shpList.addProduct(product6);
        shpList.addProduct(product7);

        //ADICIONAR 2 PRODUTOS AO CARRINHO, DA LISTA DE COMPRAS
        shpList.addProductToShoppingCart(product2);
        shpList.addProductToShoppingCart(product7);

        //INÍCIO DO OUTPUT
        System.out.println("--------------------------");
        System.out.println(shpList.getListName());
        System.out.println("--------------------------");

        System.out.println("Users:");
        for (i = 0; i < userList.size(); i++){
            System.out.println(userList.get(i).getName() + "\n");
        }
        System.out.println("---------------------------\n");

        System.out.println("Produtos no carrinho:\n");
        for (i = 0; i < onCart.size(); i++){
            System.out.println(onCart.get(i).getName() + " - " + onCart.get(i).getPrice() + " euros\\" + onCart.get(i).getUnityType());
        }
        System.out.println("............................");
        System.out.println("Produtos: " + shpList.getTotalOfProductsOnShoppingCart() + "\nPreco total: " + shpList.getPriceOnShoppingCart() + " euros");
        System.out.println("---------------------------\n");

        System.out.println("Produtos fora do carrinho:\n");
        for (i=0; i < offCart.size(); i++){
            System.out.println(offCart.get(i).getName() + " - " + offCart.get(i).getPrice() + " euros\\" + offCart.get(i).getUnityType());
        }
        System.out.println("............................");
        System.out.println("Produtos: " + shpList.getTotalOfProductsOffShoppingCart() + "\nPreco total: " + shpList.getPriceOffShoppingCart() + " euros\n");
        System.out.println("---------------------------\n");

        System.out.println("Total de produtos: " + shpList.getTotalOfProducts() + "\nPreco final: " + shpList.getTotalPrice() + " euros\n");
        System.out.println("Percentagem completa: " + (int)shpList.getPercentageCompleted() + "%\n");
        System.out.println("---------------------------\n");

    }
}
