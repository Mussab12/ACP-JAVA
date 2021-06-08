/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author mussab
 */
public class Server {
    public static void main(String args[]) throws IOException, ClassNotFoundException, SQLException
    {
        /*We wil have two sockets in server one bigger socket for accepting all 
        client requests. Second for one client 
        */
        System.out.println("Server is started");
        ServerSocket ss=new ServerSocket(9999);
        
        System.out.println("Server is waiting for client request");
        Socket s=ss.accept();
        
        System.out.println("Client connected");
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        int idno;
        System.out.println("Please enter id no to display the user and password");
        Scanner sc3=new Scanner(System.in);
        idno=sc3.nextInt();
        
        String query="SELECT * FROM `Q1` WHERE `id`='"+idno+"'  ";
        Databaseconnection dc =new Databaseconnection();
                    Connection connection=dc.getConnection();
   Statement stmt=connection.createStatement();
   ResultSet rs=stmt.executeQuery(query);
        String ch=br.readLine();
        String regex="\\s+(?=[^\\s]*$)";// this is used for splitting the 
        // the name and password that we enter in client computer because
// on the server name and password are stored in one variable so we split it
        String[] result=ch.split(regex);
        String str1=result[0];
        String str2=result[1];
        //System.out.println(str1);
        //System.out.println(str2);
   
  
  //System.out.println("Data"+ch); if you want to display database data
   while(rs.next())
   {
       String myname=rs.getString("Name");
       String mypassword=rs.getString("Password");
        System.out.println(myname
                           + "\t\t" +mypassword);
        if(myname.equals(str1)&&mypassword.equals(str2))
        {
            System.out.println("Welcome");
        }
        else
            {
        System.out.println("Error");
   }
   
       
        

        
           }
    
    }
}
