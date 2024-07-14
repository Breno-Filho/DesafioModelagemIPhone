import  java.util.Scanner;


public class FuncoesIphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    Scanner scanner = new Scanner(System.in);

    public void selecionarMusica(String musica){
        System.out.println("Pesquise a música que você quer tocar:");
        musica = scanner.next();
        System.out.print("Selecionando música..." + musica);

    }

    public void tocar(){
        System.out.print("Tocando a música...");
    }

    public void pausar(){
        System.out.print("Pausando música");
    }

    @Override


    public void ligar(String numero){
        System.out.println("Digite o número da pessoa que deseja ligar:");
        numero = scanner.nextLine();
        System.out.print("Ligando para o número: " + numero);

    }

    public void atender(){
        System.out.print("Atendendo número...");
     }

     public void iniciarCorreioVoz(){
        System.out.print("Iniciando correio de voz...");

     }

     public void exibirPagina(String url){
        System.out.println("Digite a página que dejesa acessar:");
        url = scanner.next();
        System.out.print("Exibindo a página " + url + "...");
     }

     public void adicionarAba(){
        System.out.print("Adicionando ABA...");
     }

     public void atualizarPagina(){
        System.out.print("Atualizando página");
    }
}