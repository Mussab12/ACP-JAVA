class temperature
             {

              public static void main (String [] args) 
                   {
                     double farenheitval,celciusval,F,C;
                     celciusval=Double.parseDouble(args[0]);
                     F=(celciusval*9/5)+32;
                     System.out.println(celciusval+"Celcius in Farenheit is"+F);
                     farenheitval=Double.parseDouble(args[1]);
                     C=(farenheitval-32)*5/9;
                     System.out.println(farenheitval+"Farenheit in Celcius is"+C);
                    }
              }
