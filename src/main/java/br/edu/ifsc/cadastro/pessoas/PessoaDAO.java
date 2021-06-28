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
public class PessoaDAO {

    private ArrayList<Pessoa> pessoas = new ArrayList();

    public void adicionar(Pessoa p) {
        pessoas.add(p);
    }

    public ArrayList getPessoa(String nome) {

        ArrayList resultado = new ArrayList();
        for (Pessoa pessoa : pessoas) {
            if(pessoa.getNome().toUpperCase().
                    contains(nome.toUpperCase())){
                resultado.add(pessoa);
            }
        }
        return resultado;

    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }
}
