public class MyPoint{
	private double x,y;
	 
	public MyPoint(){
	    x = 0;
	    y = 0;
	}
	 
	public MyPoint(double x, double y){
	    this.x = x;
	    this.y = y;
	}
	 
	public double getX(){
	    return x;
	}
	 
	public double getY(){
	    return y;
	}
	 
	public void setX(double x) {
	    this.x = x;
	}
	 
	public void setY(double y) {
	    this.y = y;
	}
	 
	public double distance(MyPoint p){
	    return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}
	 
	public double diatance(double x, double y){
	    return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}
}