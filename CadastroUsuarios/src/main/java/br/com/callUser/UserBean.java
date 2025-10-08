package br.com.callUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

public class UserBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;

    private static List<String> nomes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void adicionarNome() {
       
        if (nome != null && !nome.trim().isEmpty()) {
            nomes.add(nome); 
            this.nome = null; 
        }
    }
}