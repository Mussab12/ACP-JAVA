public abstract class Glass
    {
      private double opacity;
      private double thickness;
     public  abstract void show();
      public void Setopacity(double op)
       {
         opacity=op;
       }
      public double getopacity()
       {
        return (opacity);   
}
      public void Setthickness(double th)
      {
       thickness=th;
      }
      public double getthickness()
      {
         return (thickness);
      }
      
    }

