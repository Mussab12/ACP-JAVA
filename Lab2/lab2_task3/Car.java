class Car extends Vehicle implements VehicleFunctions
   {
 public void switchOn()
       {
         System.out.println("Car started");
       }
      public void drive()
       {
         System.out.println("Car is being driven");
       }
      public void switchOff()
       {
         System.out.println("Car switched Off");
       }

  public void turnOnLights()
       {
        System.out.println("Car lights are turned On");
       }
      public void turnOffLights()
       {
        System.out.println("Car lights are turned Off");
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
