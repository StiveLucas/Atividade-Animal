public class Main {

    public static void main(String[] args) {
        
        Cachorro c1 = new Cachorro("Goku", 3, "pitibul");
        Gato c2 = new Gato("Vegeta", 2, "Azul");

        c1.exibiInfo();
        c1.exibiSomCachorro();
        c2.exibiInfo();
        c2.exibirSomGato();
    }
}