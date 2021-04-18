class task3 
            {
              
              public static void main (String [] arr)
                {
                  int upper=0,lower=0,digit=0,special=0;
                  
                  for(int i=0;i<arr.length;i++)
                   {
                     String s=arr[i];
                     
                     char ch=s.charAt('\0');
                      
                     if(ch>='a' && ch<='z')
                      {
                       lower++;
                      }
                     else if(ch>='A' && ch<='Z')
                      {
                       upper++;
                      }
                     else if(ch>='0' && ch<='9')
                      {
                       digit++;
                      }
                     else
                      {
                       special++;
                      }
                   }
                    System.out.println("Lower case letters:"+lower);
                    System.out.println("Upper case letters:"+upper);
                    System.out.println("Digits entered:"+digit);
                    System.out.println("Special Characters entered:"+special);
                 }
              }
