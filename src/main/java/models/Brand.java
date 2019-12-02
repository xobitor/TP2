package models;

public class Brand {

    private int id;
    private String nome;

    public Brand(){
        this.id = 0;
        this.nome = "";
    }

    public Brand (int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
