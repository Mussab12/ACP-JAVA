import java.io.*;
import java.util.Scanner;
class game
{
  public static void main(String args[]) throws IOException
   {
       String name,join;
       int gamesplayed=0,penality=0,toplay=0;
       FileWriter f1=new FileWriter("games.txt",true);
       BufferedWriter bf=new BufferedWriter(f1);
      System.out.println("Enter the username to add in file");
     Scanner sc=new Scanner(System.in);
    name=sc.nextLine();
    System.out.println("Enter the games to add in file");
    Scanner sc2=new Scanner(System.in);
    gamesplayed=sc2.nextInt();
    join=name+ " "+" "+" "+gamesplayed;
     bf.write(join);
     bf.close();

     
    f1.close();
   System.out.println("Enter the no of game played");
   Scanner sc3=new Scanner(System.in);
   toplay=sc3.nextInt();
   if(toplay>gamesplayed)
   {

    penality=gamesplayed-toplay;
    System.out.println("You have played too many games now you will be charged"+penality);
  }
else
{
System.out.println("You are in safe zone continue playing");
}
}
}
