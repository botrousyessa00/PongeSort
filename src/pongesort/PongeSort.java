/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongesort;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author botrous.yessa
 */
public class PongeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        char[] caratteri = {'h', 'k', 'l', 's', 'e', 'y', 'u', 'i', 'z', 'o'};
        Socket s = new Socket("localhost", 7120);
        ObjectOutputStream out;
        out = new ObjectOutputStream(s.getOutputStream());
        out.writeObject(caratteri);
        out.close();
    }

}
