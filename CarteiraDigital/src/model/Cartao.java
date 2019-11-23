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
public class Cartao {
    int id;
    String nome;
    double limite;
    double fatura;
    
    Cartao(){
        this(0, "", 0.0, 0.0);
    }
    Cartao(int caId, String caNome, double caLimite, double caFatura){
        id = caId;
        nome = caNome;
        limite = caLimite;
        fatura = caFatura;
    }
}
