public class Animal
    {
       public void eat()
       {
        /*some statements*/ 
       }
       public void sleep()
       {
         /*some statements*/
       }
       
       public void walk() 
       {
          try
            {
         throw new Exception("As fishes can't walk"); 
           }
         catch(Exception e)
           {
      System.out.println(e.getMessage());
            }
             
       }
     }

