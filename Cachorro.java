public class Cachorro extends Animal {

    private String raca;

    public Cachorro(String nome, int qntdPatas, String raca){
        super(nome, qntdPatas);
        this.raca = raca;

    }

    public String getRaca(){
        return raca;

    }

    public void setRaca(String raca){
        this.raca = raca;

    }

    public void exibiSomCachorro(){
        System.out.println("O cahoro está latindo");
        
    }

    public void exibiInfo(){
        System.out.println("Animal: Cachorro \nNome: "+getNome()+"\nCor: "+getRaca()+ "\nQuantidade de patas: " +getQntdPatas());

    }

}