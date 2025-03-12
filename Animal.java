public class Animal {

    private String nome;
    private int qntdPatas;

    public Animal(String nome, int qntdPatas){
        this.nome = nome;
        this.qntdPatas = qntdPatas;

    }

    public String getNome(){
        return nome;

    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public int getQntdPatas(){
        return qntdPatas;
    }

    public void setQntdPatas(int qntdPatas){
        this.qntdPatas = qntdPatas;
    }
}