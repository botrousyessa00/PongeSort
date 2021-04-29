/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongesort;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author botrous.yessa
 */
public class PongeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket server=new ServerSocket();
        Socket s=new Socket();
        ObjectInputStream in=new ObjectInputStream(s.getInputStream());
        char[]caratteri={'c','x','g','h','j','k','l','a','s'};
        Thread.sleep(2000);
    }
    
}
