/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.cadastro.pessoas;

import java.util.ArrayList;

/**
 *
 * @author renato
 */
public class Main {

    public static void main(String[] args) {
        PessoaDAO cadastro = new PessoaDAO();

        Pessoa gabriel = new Pessoa();
        gabriel.setNome("Gabriel Ludwig");
        gabriel.setIdade(33);

        Pessoa vinicius = new Pessoa();
        vinicius.setNome("Vinicius Rossi");
        vinicius.setIdade(31);

        Pessoa carol = new Pessoa();
        carol.setNome("Carol Donadel");
        carol.setIdade(28);

        cadastro.adicionar(gabriel);
        cadastro.adicionar(vinicius);
        cadastro.adicionar(carol);
        System.out.println("");
        ArrayList<Pessoa> res = cadastro.getPessoa("");
        for (Pessoa re : res) {
            System.out.printf("%s-%s\n", re.getNome(), re.getIdade());
        }

        //opcao 1
        res.clear();
        res.addAll(cadastro.getPessoas());

        //opcao 2
        res = cadastro.getPessoas();

        //opcao 3
        ArrayList<Pessoa> todas = cadastro.getPessoas();

        //opcao 4
        ArrayList<Pessoa> menoresQue30 = new ArrayList<>();
        for (Pessoa pessoa : cadastro.getPessoas()) {
            if (pessoa.getIdade() < 30) {
                menoresQue30.add(pessoa);
            }
        }
        //opcao 5
        if (menoresQue30.isEmpty()) {
            System.out.println("Não há menores que 30");
        } else {
            System.out.println("Pessoas menores que 30 anos");
            for (Pessoa pessoa : menoresQue30) {
                System.out.println(pessoa);
            }
        }

        boolean vazio = true;
        System.out.println("Pessoas menores que 30 anos");
        for (Pessoa pessoa : cadastro.getPessoas()) {
            if (pessoa.getIdade() < 30) {
                System.out.println(pessoa);
                vazio = false;
            }
        }
        if(vazio){
            System.out.println("Não há menores que 30");
        }

    }
}
