/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static control.Cadastrar.*;
import java.io.*;
import model.Cliente;

/**
 *
 * @author marce
 */
public class Carregar {

    public static String Inicializar() throws IOException {
        int i;
        Cliente login = new Cliente();
        String fileName2 = "Lgn.txt";

        try {
            BufferedReader ler = new BufferedReader(new FileReader(fileName2));
            login.nome = ler.readLine();
            login.senha = ler.readLine();
        } catch (FileNotFoundException e) {
            Cadastrando();
        }
        ler.close();	
        System.exit(0);
    }

}
