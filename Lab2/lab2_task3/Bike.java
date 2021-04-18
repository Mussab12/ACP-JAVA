class Bike extends Vehicle implements VehicleFunctions

       {
          public void switchOn()
       {
         System.out.println("Bike started");
       }
      public void drive()
       {
         System.out.println("Bike is being driven");
       }
      public void switchOff()
       {
         System.out.println("Bike lights are turned on");
       }

  public void turnOnLights()
       {
        System.out.println("Bike lights are turned off");
       }
      public void turnOffLights()
       {
        System.out.println("Bike switched off");
       }
    
      public void display()
      {
        System.out.println("Name:"+name);
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Wheels:"+number_of_wheels);
        System.out.println("Racer:"+type);   


   }

}
