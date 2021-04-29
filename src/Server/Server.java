/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author botrous.yessa
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket ss;
        ss = new ServerSocket(7120);
        Socket s = ss.accept();
        ObjectInputStream in = new ObjectInputStream(s.getInputStream());
        char[] caratteri = (char[]) in.readObject();
        in.close();
        System.out.println("-----------------------------------------");
        System.out.println("           Ecco i tuoi caratteri");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < caratteri.length; i++) {
           
            System.out.print(caratteri[i] + " ");
        }

    }

}
