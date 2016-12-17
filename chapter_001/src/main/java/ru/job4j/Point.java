package ru.job4j;

public class Point {
public double x;
public double y;

public Point(double x, double y) {
this.x = x;
this.y = y;
}

public double distanceTo(Point point) {
//calculate distance between two points
//|AB|� = (y2 - y1)� + (x2 - x1)�
 return Math.sqrt(Math.pow(point.x - this.x,2) + Math.pow(point.y - this.y,2));
}


}