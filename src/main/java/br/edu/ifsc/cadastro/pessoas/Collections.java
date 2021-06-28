package br.edu.ifsc.cadastro.pessoas;

/**
 * @author Leandro Fontana.
 */

import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

/**
 * The type Collections.
 */
public class Collections {
    private LinkedList<Pessoa> pessoaLL = new LinkedList<>();
    private HashSet<Pessoa> pessoaHS = new HashSet<>();
    private HashMap<Integer, Pessoa> pessoaHM = new HashMap<Integer, Pessoa>();
    private int chave=1;

    /**
     * Adicionar Pessoa à LinkedList pessoaLL.
     *
     * @param p pessoa
     */
    public void adicionarLL(Pessoa p){
        pessoaLL.add(p);
    }

    /**
     * Adicionar Pessoa ao Hashset pessoaHS.
     *
     * @param p pessoa
     */
    public void adicionarHS(Pessoa p){
        pessoaHS.add(p);
    }

    /**
     * Adicionar Pessoa ao Hashmap pessoaHM.
     *
     * @param p pessoa
     */
    public void adicionarHM(Pessoa p){
        pessoaHM.put(chave, p);
    }

    /**
     * Gets pessoaHM.
     *
     * @return HashMap pessoaHM
     */
    public HashMap<Integer, Pessoa> getPessoaHM() {
        return pessoaHM;
    }

    /**
     * Gets pessoaLL.
     *
     * @return LinkedList PesssoaLL
     */
    public LinkedList<Pessoa> getPessoaLL() {
        return pessoaLL;
    }

    /**
     * Gets pessoaHS.
     *
     * @return hashSet PessoaHS
     */
    public HashSet<Pessoa> getPessoaHS() {
        return pessoaHS;
    }
}
