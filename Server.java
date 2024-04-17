/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class Server extends Thread {
    private ServerSocket serverSocket;

    public Server(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public void run() {
        while (true) {
            try {
               System.out.println("Listening for client message on port " + serverSocket.getLocalPort());
               Socket socket = serverSocket.accept();
DataInputStream in = new DataInputStream(
socket.getInputStream());
   DataOutputStream out = new DataOutputStream(socket.getOutputStream());
out.writeUTF("Hello from server.");
            } 
catch (SocketTimeoutException sTException) {
                sTException.printStackTrace();
            } 
 catch (IOException ioException) {
ioException.printStackTrace();
} 
finally {
                try {
                    serverSocket.close();
                } 
catch (IOException ioException) {
                    ioException.printStackTrace();
                }
   }
        }
    }
         public static void main(String[] args) {
        try {
            Thread thread = new Server(6060);
            thread.start();
        } 
catch (IOException e) {
            e.printStackTrace();  
}  
}
}




