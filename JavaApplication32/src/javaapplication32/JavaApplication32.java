
package javaapplication32;

abstract class Shape {
    String color;

    abstract double area();

    public String getColor() {
        return color;
    }
}

 class Rectangle extends Shape {
  int height;
  int width;
    @Override
    double area() {
      double rectangleArea= height*width;
        return rectangleArea;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}




 class Triangle extends Shape {
     int base;
     int height;


    @Override
    double area() {
        double triangleArea= (base*height)/2;
        return triangleArea;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}



 class Circle extends Shape {

    double radius;

    @Override
    double area() {
       double circleArea= 3.14* (radius*radius); //pi r^2
        return circleArea;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public String name()
    {
        return "Circle";
    }
}


public class JavaApplication32 {

    
    public static void main(String[] args) {
       
         Rectangle rectangle=new Rectangle();
        rectangle.color="Blue";
        rectangle.height=18;
        rectangle.width=10;
        System.out.println("Area of Rectangle is :"+ " "+rectangle.area());
        System.out.println("Color of Rectnagle is "+rectangle.getColor());

         Triangle triangle= new Triangle();
         triangle.color="Red";
         triangle.height=8;
         triangle.base=10;
         System.out.println("Area of Triangle is :"+ " "+triangle.area());
        System.out.println("Color of Triangle is "+triangle.getColor());

        Circle circle=new Circle();
        circle.color="Black";
        circle.radius=10;
        System.out.println("Area of Circle is :"+ " "+circle.area());
        System.out.println("Color of Circle is "+circle.getColor());
        System.out.println("Name of Shape is : "+circle.name());

    }
    
}
