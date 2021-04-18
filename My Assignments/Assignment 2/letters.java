import java.io.*;
import java.util.Scanner;

class letters
      {
         public static void main(String args[]) throws IOException
        {

          FileReader f1 = new FileReader("letters.txt");
          Scanner scanner=new Scanner(f1);
          String line=scanner.nextLine();
        int upper=0,lower=0,digit=0;
          for(int i=0;i<line.length();i++)
          {
            char ch=line.charAt(i);
            if(ch>='A' && ch<='Z')
             {
               upper++;
              }
            else if(ch>='a' && ch<='z'){
    lower++;
}
else if(ch>='0' && ch<='9')
{
    digit++;
}
          
           
           
           
          } 
            int a=upper;
             int b=lower;
              int c=digit;
          FileWriter writer=new FileWriter("output.txt")
           writer(a);

           /*PrintWriter writer= new PrintWriter("output.txt");
           writer.println("There are"+" "+a+" "+"Upper case letters");
           writer.println("There are"+" "+b+" "+"Lower case letters");
                  writer.println("There are"+" "+c+" "+"digits");*/
           writer.close();
           
         
 
    }
   
    }  
