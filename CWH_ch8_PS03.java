class Square{
    int side; 
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle{
    int width;
    int breadth;
    public int area(){
        return width*breadth;
    }
    public int perimeter(){
        return 2 * (width+breadth);
    }
}
class Circle{
    int r;
    // int c;
    public double area(){
        double pi = 3.14;
        return pi * (r*r);
    }
  
    public double circumference(){
        double pi = 3.14;
        return 2 * pi * r;
}
    public double perimeter(){
        return circumference();
    }
}


public class CWH_ch8_PS03 {
    public static void main(String[] args) {
       Square sq = new Square();
       sq.side = 2;
       System.out.println(sq.area());
       System.out.println(sq.perimeter());

       Rectangle rec = new Rectangle();
       rec.breadth = 4;
       rec.width = 9;
       System.out.println(rec.area());
       System.out.println(rec.perimeter());

       Circle cir = new Circle();
       cir.r = 4;
       System.out.println(cir.area());
       System.out.println(cir.circumference());
      
    }

}
