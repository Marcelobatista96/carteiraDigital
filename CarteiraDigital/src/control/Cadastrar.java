/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author marce
 */
public class Cadastrar {
    
    public static void Cadastrando() throws IOException{
    try {
                Cliente cadastro = new Cliente();
                String fileName = "Lgn.txt";
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

                cadastro = new Cliente();

                cadastro.nome = JOptionPane.showInputDialog("Preencha seu nome:");
                writer.write(cadastro.nome);
                writer.newLine();
                do {
                    cadastro.senha = JOptionPane.showInputDialog("Digite uma senha de sua preferência com no mínimo 6 dígitos e no máximo 8 dígitos");
                    if (cadastro.senha.length() < 6 || cadastro.senha.length() > 8) {
                        JOptionPane.showMessageDialog(null, "Senha inválida. Favor, tente novamente!");
		
                    }
                } while (cadastro.senha.length() < 6 || cadastro.senha.length() > 8);

                writer.write(cadastro.senha);
                writer.newLine();
            }catch (IOException f){
                JOptionPane.showMessageDialog(null, "Erro. Favor, contatar o suporte em:\n(11)99999-9999");
            }
	    writer.close();
            System.exit(0);
}
}
