import java.util.Scanner;
class Supermarket implements bankinterface,itemsinterface,foodinterface
  {
     int amount,withdrawlamount,total_price=0;
     int item_price[]=new int[100];
     String item_name[]=new String[100];
      String recipe[]=new String[100];

     public void setamount(int a)
    {
      amount=a;
     }
    public int getamount()
    {
       return (amount);
     }
     public void withdrawl()
     {
        System.out.println("Enter amount to withdraw from your account");
        Scanner sc=new Scanner(System.in);
        withdrawlamount=sc.nextInt();
       if(amount<=0)
       {
        System.out.println("Insufficient Balance in your account");
       }
       else
       {
       amount=this.getamount() -withdrawlamount;
        System.out.println("Rs"+" "+withdrawlamount+" "+"is withdrawed from your account");
      }
}
     public void inputitems()
      {
       System.out.println("Enter items");
       for(int i=0;i<10;i++)
       { 
          Scanner sc=new Scanner(System.in);
          item_name[i]=sc.next();
        
         
      }
      System.out.println("Enter Price of Items");
      for(int i=0;i<10;i++)
       {
         Scanner sc=new Scanner(System.in);
         item_price[i]=sc.nextInt();
       
  }
}
public void getitems()
  {
    for(int i=0;i<10;i++)
    {
      total_price=total_price+item_price[i];
    System.out.println("ITEMS:"+" "+item_name[i]+" "+item_price[i]);        
}
 
 withdrawlamount=withdrawlamount-total_price;
 if(withdrawlamount<total_price)
  {
    System.out.println("Insufficient Balance In your Account");
 }
 else 
   {
 System.out.println("Total Price"+withdrawlamount);  
}
 
}
 public void setfoodrecipe()
{ System.out.println("Enter recipes you want to display to user"); 

  for(int i=0;i<6;i++)
   {
     Scanner sc=new Scanner(System.in);
     recipe[i]=sc.next();
   }
}
public void getrecipe()
  {
    for(int i=0;i<6;i++)
    {
      System.out.println("Recipes:"+recipe[i]);
   }

}

}
