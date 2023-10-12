package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

        private List<Pessoa> pessoaList;

        public OrdenacaoPessoa(){
            this.pessoaList = new ArrayList<>();
        } 
      
        public void adicionarPessoa(String nome, int idade, double altura){
            pessoaList.add(new Pessoa(nome, idade, altura));
        }

        public List<Pessoa> ordenarPorIdade(){
            List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
            if(!pessoaList.isEmpty()){
                Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
            }
        }

        public List<Pessoa> ordenarPorAltura(){
            List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
            if(!pessoaList.isEmpty()){
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
            }
        }

        public static void main(String[] args) {
            
            OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

            ordenacaoPessoa.adicionarPessoa("taylor swift", 33, 1.78);
            ordenacaoPessoa.adicionarPessoa("karlie kloss", 31, 1.88);
            ordenacaoPessoa.adicionarPessoa("dianna agron", 37, 1.66);
            ordenacaoPessoa.adicionarPessoa("lily donaldson", 36, 1.79);

            //System.out.println(ordenacaoPessoa.ordenarPorIdade());
            System.out.println(ordenacaoPessoa.ordenarPorAltura());

        }

    }
