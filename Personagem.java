public class Personagem {     //criando classe para personagem
    
    //atributos que armazenam as características do personagem
    String nome;              
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;
    
    //construtor responsável por iniciar o objeto com os dados recebidos
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {  
        this.nome = nome;
    }

    public void exibirStatus() {
      

    }
}

