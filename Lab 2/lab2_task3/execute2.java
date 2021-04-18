		import java.util.Scanner;
class execute2 {
  public static void main(String args[])
                 {
                   System.out.println("Enter your choice for which vehicle functions you want to display");
                   Scanner sc=new Scanner(System.in);
                   int choice=sc.nextInt();
                   if(choice==1)
                   {
                   Bike b1=new Bike();
                   b1.setVehicleinfo("Honda Cd 125","CD-125","Honda","false");
                   b1.noofwheels(2);
                   b1.display();
                   b1.switchOn();
                   b1.drive();
                   b1.switchOff();
                   b1.turnOnLights();
                   b1.turnOffLights();
                   }
                else if(choice==2)
                  {  
                   
                   Car c1=new Car();
                   c1.setVehicleinfo("Honda City","2009","Honda","false");
                   c1.noofwheels(4);
                   c1.display();
                   c1.switchOn();
                   c1.drive();
                   c1.switchOff();
                   c1.turnOnLights();
                   c1.turnOffLights();

                   }
                   
                 }
               }
