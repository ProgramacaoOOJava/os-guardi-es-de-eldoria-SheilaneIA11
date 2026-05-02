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
        this.classe = classe;                  //usando o this. para diferenciar os atributos da classe
		this.nivel = nivel;                          
		this.pontosDeVida = pontosDeVida;
		this.poderBase = poderBase;
    }

    public void exibirStatus() {            //Método que exibe todas as informações cadastradas do personagem
      System.out.println("--- Status do Personagem ---");
		System.out.println("Nome: " + nome);
		System.out.println("Classe: " + classe);
		System.out.println("Nível: " + nivel);
		System.out.println("Pontos De Vida: " + pontosDeVida);
		System.out.println("Poder Base: " + poderBase);

    }
}

