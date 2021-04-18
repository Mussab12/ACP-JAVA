import java.util.Scanner;
class bottlestask
     {
   int bottles,glasses,total_no_of_bottles;
       public void setbottles()
         {
           
           System.out.println("number of Bottles");
           Scanner sc=new Scanner(System.in);
           bottles=sc.nextInt();
           System.out.println("number of Glasses");
           glasses=sc.nextInt();
           total_no_of_bottles=5*bottles;
           
            
               if(glasses>total_no_of_bottles)
               {
                  try
                    {
            throw new ArithmeticException("LessNumberOfBottlesException");
                 
               }     
                    
              
             
           catch(ArithmeticException a) 
              {
             System.out.println("Exception:"+a.getMessage());
              }
          }
            
          }
      }


