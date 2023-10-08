package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    public Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existe " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Taylor Swift", 1234);
        conjuntoConvidados.adicionarConvidado("Karlie Kloss", 1235);
        conjuntoConvidados.adicionarConvidado("Dianna Agron", 1235);
        conjuntoConvidados.adicionarConvidado("Lily Donaldson", 1236);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existe " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
        
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1235);

        System.out.println("Existe " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
        
        conjuntoConvidados.exibirConvidados();

    }

}
