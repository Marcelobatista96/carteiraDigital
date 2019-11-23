/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author marce
 */
public class Cliente {
    public String nome;
    public String senha;
    
    public Cliente(){
        this("", "");
    }
    Cliente(String clNome, String clSenha){
        nome = clNome;
        senha = clSenha;
    }

}
