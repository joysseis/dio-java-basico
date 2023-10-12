import Chamada.Telefone;
import Internet.Navegador;
import Iphone.Iphone;
import Musica.ReprodutorMusical;

public class ios {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        ReprodutorMusical musica = (ReprodutorMusical) iphone;

        Telefone chamadas = (Telefone) iphone;
        
        Navegador web = (Navegador) iphone;

        System.out.println("-MUSICA-");
        musica.tocar();
        musica.pausar();
        musica.selecionarMusica();
        System.out.println("-TELEFONE-");
        chamadas.atender();
        chamadas.ligar();
        chamadas.iniciarCorreioVoz();
        System.out.println("-INTERNET-");
        web.adicionandoNovaPagina();
        web.atualizaPagina();

    }

}