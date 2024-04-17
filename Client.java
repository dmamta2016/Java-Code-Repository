/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author mamta
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
public class Client {
  public static void main(String[] args) {
    try {
        Socket clientSocket = new Socket("localhost", 6060);
        InputStream inFromServer = clientSocket.getInputStream();
        DataInputStream in  = new DataInputStream(inFromServer);
System.out.println("Message received from server: "+in.readUTF());
        clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}