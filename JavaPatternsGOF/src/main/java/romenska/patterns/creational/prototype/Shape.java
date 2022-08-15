package romenska.patterns.creational.prototype;

import java.util.Objects;

public abstract class Shape {

	private int x;
	private int y;
	private String color;
	
	public Shape( int x, int y, String color){}
	
	protected Shape(Shape target){
		this.x = target.x;
		this.y = target.y;
		this.color = target.color;
	}
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract Shape clone();

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Shape)) return false;
        Shape shape = (Shape) object;
        return shape.x == x && shape.y == y && Objects.equals(shape.color, color);
    }
}
