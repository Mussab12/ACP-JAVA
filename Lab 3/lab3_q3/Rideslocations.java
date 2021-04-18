import java.util.Scanner;
class Rideslocations
    {
        String ride,location;
       public void setrideandlocation()
       {
        
        System.out.println("Your ride");
        Scanner sc=new Scanner(System.in);
        ride=sc.next();
        System.out.println("Your location");
        location=sc.next();
        if(ride.equals("car") && (location.equals("road")))
          {
            System.out.println("Welcome to the ride!!!!!");

          }
        
          
        else
         {
         try
           {

          throw new ArithmeticException("Mismatch Exception Handled");
         }
        catch(ArithmeticException e)
          {
            System.out.println(e.getMessage());
          }
           System.out.println("Program terminated");

         }

         
         

     }

   }
