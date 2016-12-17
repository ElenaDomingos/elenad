package ru.job4j;


public class Triangle {
public Point a;
public Point b;
public Point c;

public Triangle(Point a, Point b, Point c) {
this.a = a;
this.b = b;
this.c = c;
}

public double area() {
//calculate the area
double side1= this.a.distanceTo(b);
double side2= this.b.distanceTo(c);
double side3= this.c.distanceTo(a);


double p=(side1 + side2+ side3)/2.0d;
double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));

if ((side1>=(side2+side3)) && (side2>=(side1+side3)) && (side3>=(side1+side2)))
	{
return area;
}

else {
	System.out.print(" ");
}
   return 0;
   
 }
        
	
    public static void main(String[] args) {    
        Point a = new Point(15d,10d);
        Point b = new Point(10d,5d);
        Point c = new Point(0d,10d);
		Triangle triangle = new Triangle(a,b,c);
		double result = triangle.area();
	    System.out.println(result);}	
        		 
     }
