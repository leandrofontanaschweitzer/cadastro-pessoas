/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.cadastro.pessoas;

/**
 *
 * @author renato
 */
public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public Pessoa() {
    }
    
    
    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome+ " - " + idade; //To change body of generated methods, choose Tools | Templates.
    }
    

    

    

}
