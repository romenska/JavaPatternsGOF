package romenska.patterns.creational.prototype;

public class Circle extends Shape {

	private int radius;
	
	public Circle(int x, int y, String color , int radius) {
		super(x,y,color);
		this.radius = radius;
	}
	
	protected Circle(Circle target) {
		super(target);
		if (target != null) {
			this.radius = target.radius;
		}
	}
	
	@Override
	public Shape clone() {
		return new Circle(this);
	}


    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Circle) || !super.equals(object)) return false;
        Circle shape = (Circle) object;
        return shape.radius == radius;
    }

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
    
}
