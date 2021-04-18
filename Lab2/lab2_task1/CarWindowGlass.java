class CarWindowGlass extends WindowGlass 
       {
         private int tintper;
         public void Settintper(int ti)
                 {
                     tintper=ti;
                 }
         public int getTintper()
                {
                   return (tintper);
                 }
         public void show()
                {
     System.out.println("Opacity:"+getopacity());
    System.out.println("Thickness:"+getthickness());
    System.out.println("Width:"+width);
    System.out.println("Height:"+height);
    System.out.println("Tint percent:"+tintper);
               }
          }

