package com.api.socket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {
    public static void main(String[] args) throws Exception {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();//establishes connection
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message= " + str);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


