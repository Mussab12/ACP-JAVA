/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mussab
 */
public class Databaseconnection {

    /**
     * @param args the command line arguments
     *   
     */ 
    
    private static final String DriverName="com.mysql.jdbc.Driver";
     private static final String HOST="localhost";
     private static final int PORT=3306;
     private static final String USER="root";
     private static final String PASSWORD="";
     private static final String DATABASE="Question_1";
     private String url;
     public Connection getConnection() throws ClassNotFoundException, SQLException
     {
         Class.forName(DriverName);
         this.url="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
         Connection connection=(Connection) DriverManager.getConnection(url,USER,PASSWORD);
         
         return connection;
         
     }
     
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
  
           
        
               Databaseconnection t1=new Databaseconnection();
         try (Connection connection = t1.getConnection()) {
             if(connection.toString()!=null)
             {
                 JOptionPane.showMessageDialog(null,""+connection.toString());
             }
             else
             {
                 System.out.println("Connection failed");
             }}
    }
    public static ResultSet getData(String query) throws ClassNotFoundException, SQLException
{
    Databaseconnection dc =new Databaseconnection();
    java.sql.Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    try
    {
        con=dc.getConnection();
        st=con.createStatement();
        rs=st.executeQuery(query);
        return rs;
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
    
}
    
    
    
}