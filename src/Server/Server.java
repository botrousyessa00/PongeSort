/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author botrous.yessa
 */
public class Server {
      private int port;
    private ServerSocket SS;

    public Server(int port) {
        this.port = port;
        if(!startServer())
            System.out.println("errore in fase di creazione");
    }

    private boolean startServer() {
        try {
            SS = new ServerSocket(port);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        System.out.println("Server creato con successo");
        return true;
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Server server = new Server(6666);
        server.runServer();
    }

}
