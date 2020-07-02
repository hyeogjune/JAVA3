package starcraft;

abstract class Shape{
	Point p;
	Shape(){
		this(new Point(0,0));
	}
	Shape(Point p){
		this.p = p;
	}
	
	abstract double calcArea();
	
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
}

class Point{
	int x, y;
	
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "["+x+","+y+"]";
	}
}

class Circle extends Shape{
	double r;
	final double PI = 3.14;
	
	Circle(double r){
		this.r = r;
	}
	
	public double calcArea(){
		return PI*(r*r);
	}
}

class Rectangle extends Shape{
	double width;
	double height;
	
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double calcArea(){
		return width*height;
	}
	public boolean isSquare(){
		boolean result = false;
		if(width == height)
			result = true;
		return result;
	}
}
