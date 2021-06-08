

import java.util.Random;


class exercise3 extends Thread
{
    Random r=new Random();
   int sum=0;
    double avg;
    int size=10;
    int random_num;
    int upper_bound=50;
  exercise3()
  {
     Thread t1=new Thread(this,"Main Thread");
   
      t1.start();
      
      
  }
   
    public void run()
    {
        avg_fun();
        
    }
    synchronized void avg_fun()
    {
        avg=sum/size;
        System.out.println("Average is"+avg);
    }
    
    synchronized void sum_fun()
    {
        for(int i=0;i<size;i++)
        {
      random_num=r.nextInt(999-100+1)+100;
     System.out.println(random_num);
     sum=sum+random_num;
   
        }
   System.out.println("Sum is"+sum);
     
    }
 
}

 class exercise3 {

    
    public static void main(String[] args) {
        
        int p;
         exercise3 ex[] = new exercise3[5];  
     for( p = 0; p <ex.length; p++)
     {
       ex[p] = new exercise3();
       ex[p].sum_fun();
    }

}

 }
