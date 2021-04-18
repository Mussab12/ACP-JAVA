import java.util.Scanner;
class RentedCar implements CarRentals
{
  String carname,carbrand,carRenter,custname;
  int carno,cnic,day,perRent;
  public void setrentcarinfo()
     {
         System.out.println("Enter the car number that you want to rent");
         Scanner sc=new Scanner(System.in);
         carno=sc.nextInt();
         System.out.println("Enter the car name you want to rent");
         carname=sc.next();
         System.out.println("Enter the car brand you want");
         carbrand=sc.next();
         System.out.println("Enter the name of the car renter");
         carRenter=sc.next();
         
      }
public void getrentcarinfo()
       {
         System.out.println("Renter Name"+carRenter);
         System.out.println("CAR NAME:"+carname);
         System.out.println("CAR NO:"+carno);
         System.out.println("Brand:"+carbrand);
        }

public void setcustomerinfo()
      {
        System.out.println("Enter the Customer name");
         Scanner sc=new Scanner(System.in);
         custname=sc.nextLine();
        System.out.println("Enter the Cnic of Customer");
         cnic=sc.nextInt();
      }

public void getcustomerinfo()
     {
       System.out.println("Cust Name:"+custname);
       System.out.println("CNIC:"+cnic);
        
  }
public void setrent()
  {  
     System.out.println("Enter the rent Amount on car");
     Scanner sc=new Scanner(System.in);
     perRent=sc.nextInt();
     
     


}
public int getrent()	
{
  return (perRent);


}
public double calRent()
  { 
     int days;
     System.out.println("Enter how many days you want to rent car");
     Scanner sc=new Scanner(System.in);
     days=sc.nextInt();
    double price=this.getrent()*days;
    if(days>7 && days<=30) {
      price=price*0.9;
      }
else if(days>30 && days<=150){
			price *= 0.8;
		}else if(days>150){
			price *= 0.7;
		}
 
System.out.println("Rent Calculated on Car:"+price);
return (price);
}
   
}
