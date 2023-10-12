package Iphone;
import Chamada.Telefone;
import Musica.ReprodutorMusical;
import Internet.Navegador;

    public class Iphone implements ReprodutorMusical, Navegador, Telefone {
        @Override
        public void tocar() {
            System.out.println("Reproduzindo musica");
        }
    
        @Override
        public void pausar() {
            System.out.println("Parado na musica");
        }
    
        @Override
        public void selecionarMusica() {
            System.out.println("Escolhendo musica");
        }
    
    
        public void pagina() {
            System.out.println("Abrindo a pagina");
        }
    
        @Override
        public void adicionandoNovaPagina() {
            System.out.println("Adicionando nova pagina");
        }
    
        @Override
        public void atualizaPagina() {
            System.out.println("Atualizando a pagina");
        }
    
        @Override
        public void ligar() {
            System.out.println("Discar");
        }
    
        @Override
        public void atender() {
            System.out.println("Atender");
        }
    
        @Override
        public void iniciarCorreioVoz() {
            System.out.println("Iniciar correio de voz");
     
        }
    
    }

