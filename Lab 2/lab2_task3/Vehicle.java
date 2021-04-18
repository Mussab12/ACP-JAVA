public abstract class Vehicle 
   {
      String name,model,brand,type;
      int number_of_wheels;
      public abstract void display();
      public void setVehicleinfo(String na,String mod,String br,String tp)
       {
         name=na;
         model=mod;
         brand=br;
         type=tp;
        
       }
      public  void noofwheels(int wheels)
       {
         number_of_wheels=wheels;
       }
    
   }
      
