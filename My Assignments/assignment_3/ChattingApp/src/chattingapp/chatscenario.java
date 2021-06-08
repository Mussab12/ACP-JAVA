/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chattingapp;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mussab
 */

class Participant1 extends Thread
{
  String txt1;
  String choice;
  
  

   

   
    
    
    synchronized void user1_msg() throws InterruptedException
    {
        for( ;!"No".equals(choice) ; )
            
        {
            
       
           
        System.out.println("User 1:");
        Scanner sc=new Scanner(System.in);
        txt1=sc.nextLine();
        
     
       
       
           
         Participant2 u5=new Participant2(this);  
        
         u5.start();
         u5.join();
         System.out.println("Do you want to keep chatting type yes for continuing chatting type No for exit chatting");
         Scanner sc3=new Scanner(System.in);
         choice=sc3.next();
         
        
        }
    
       
        
            
       
    }
 @Override
    public void run()
    {
     
       
   
     try {
         user1_msg();
     } catch (InterruptedException ex) {
         Logger.getLogger(Participant1.class.getName()).log(Level.SEVERE, null, ex);
     }
         
      
    }
   
}

    class Participant2 extends Thread
    {
        String txt2;
        Participant1 ui=new Participant1();
Participant2(Participant1 u) throws InterruptedException
{
    this.ui=u;
   
}
    

      
        
        
  
    
        @Override
        public void run()
        {
            txt2message();
        }

    synchronized void txt2message() {
        System.out.println("Number 2:");
        Scanner sc1=new Scanner(System.in);
        txt2=sc1.nextLine();
    }
        
    }

public class chatscenario {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Thread th1=new Thread(new Participant1());
        th1.start();
        th1.join();
        
        
        
      
    }
    
}
