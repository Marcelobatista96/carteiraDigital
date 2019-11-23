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
public class Conta {
    int id;
    String banco;
    String agencia;
    String nConta;
    double saldo;
    boolean corrente;
    
    Conta(){
        this (0, "", "", "", 0.0, false);
    }
    Conta(int coId, String coBanco, String coAgencia, String coNConta, double coSaldo, boolean coCorrente){
        id = coId;
        banco = coBanco;
        agencia = coAgencia;
        nConta = coNConta;
        saldo = coSaldo;
        corrente = coCorrente;
    }   
    
}
