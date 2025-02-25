
public class Main {
    public static void main(String[] args) {
        //criando objetos da classe
        // instanciar a classe, criando objetos

        Carro obj1 = new Carro(); // chama o construtor
        obj1.ano= 2022;
        obj1.velocidade = 0;
        obj1.marca = "Volkswagen";
        obj1.modelo = "Polo";
        obj1.exibirDetalhes();
        obj1.acelerar(100);
        obj1.frear(40);
        obj1.exibirDetalhes();

        Carro obj2 = new Carro(2024, 0, "Fiat", "Fastback");
        obj2.exibirDetalhes();
        obj2.acelerar(30);
        obj2.exibirDetalhes();


        Carro obj3 = new Carro(); // chama o construtor
        obj3.exibirDetalhes();
    }
}