package romenska.patterns.structura.facade;

public class ShapeFacade {
	Circle circle;
	Rectangle rectangle;
	Line line;
	public ShapeFacade() {
		circle = new Circle();
		rectangle = new Rectangle();
		line= new Line();
	}
	public void drawCircle() {
		circle.draw();
	}
	public void drawRectangle() {
		rectangle.draw();
	}
	public void drawLine() {
		line.draw();
	}
}
