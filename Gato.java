public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int qntdPatas, String cor){
        super(nome, qntdPatas);
        this.cor = cor;
        
    }

    public String getCor(){
        return cor;

    }

    public void setCor(String cor){
        this.cor = cor;

    }

    public void exibirSom(String som){
        System.out.println("Miau");
    }

    public void exibiInfo(){
        System.out.println("\nAnimal: Gato \nNome: "+getNome()+"\nCor: "+getCor()+"\nQuantidade de patas: "+getQntdPatas());

    }
  
}