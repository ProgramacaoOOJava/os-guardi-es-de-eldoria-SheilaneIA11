public class Main {    //classe principal e responsavél por executar o programa no terminal/console
    public static void main(String[] args) {

         //instanciando um objeto da classe personagem com valores definidos
        Personagem heroi1 = new Personagem("Arthemis", "Arqueira", 5, 80, 12.5);

		heroi1.exibirStatus();       //chamando o método para exibir os dados do personagem no console
    }
}

