class Exceptions
   {
     public static void main(String args[])
      {
        try {
            int stuage=11,stuweight=30;
            if(stuage<12&&stuweight<40)
             throw new ArithmeticException("weight exception");
           }
        catch (ArithmeticException a)
         {
           a.printStackTrace();
           }
        try {
          
            String arr[]={"Ali","Ahmed","Naqqash","Akash","Hassan","Abdal","Muhammmad"};
            for(int i=0;i<7;i++)
            {

            System.out.println(arr[7]);
            }
            }
        catch (ArrayIndexOutOfBoundsException arr)
           {
            arr.printStackTrace();
          }
        try 
          { 
            Object ref=null;
           ref.toString();
               }
        catch(NullPointerException n)
           {
             n.printStackTrace();
        }
       try
         {
           double num=Double.parseDouble("a") ;
	 System.out.println(num);

         }
       catch(NumberFormatException b)
         {
           b.printStackTrace();
         }
     
          
   }
}
