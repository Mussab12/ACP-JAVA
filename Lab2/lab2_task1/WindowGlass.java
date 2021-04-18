class WindowGlass extends Glass
  {
    public double width;
    public double height;
    public void Setwidth(double w)
     {
      width=w;
     }
    public void Setheight(double h)
    {
      height=h;
    }
    public void show() {
     System.out.println("Width:"+width);
    System.out.println("height:"+height);
    System.out.println("opacity:"+getopacity());
    System.out.println("Thickness:"+getthickness());
          } 
           
}
