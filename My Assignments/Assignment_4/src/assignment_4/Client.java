/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author mussab
 */
class Client
{
    public static void main(String args[]) throws IOException
    {
        String ip="localhost";
        int port=9999;
        Socket s=new Socket(ip,port);
        String username,password;
        System.out.println("Please enter name");
        Scanner sc=new Scanner(System.in);
        username=sc.next();
        System.out.println("Please enter password");
        Scanner sc1=new Scanner(System.in);
        password=sc1.next();
        
        OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());/*
        Sending data to output port of socket we are converting our data
        into a stream format and then you are mentioning where to send this data
        */
        PrintWriter out=new PrintWriter(os);
        os.write(username+" "+password);
        os.flush();
          out.close();
    }
}
