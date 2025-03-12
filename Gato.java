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

    public void exibirSomGato(){
        System.out.println("O gato está miando");
    }

    public void exibiInfo(){
        System.out.println("\nAnimal: Gato \nNome: "+getNome()+"\nCor: "+getCor()+"\nQuantidade de patas: "+getQntdPatas());

    }
  
}