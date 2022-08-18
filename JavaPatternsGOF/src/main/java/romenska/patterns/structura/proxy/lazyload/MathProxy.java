package romenska.patterns.structura.proxy.lazyload;

public class MathProxy implements IMath {
	
	private IMath math;
	
	private void lazyLoadMath() {
		if (math == null) {
			math = new Math();
		}
	}
	
	@Override
	public double add(double x, double y) {
		lazyLoadMath();
		return math.add(x, y);
	}
	@Override
	public double sub(double x, double y) {
		lazyLoadMath();
		return math.sub(x, y);
	}
	@Override
	public double mul(double x, double y) {
		lazyLoadMath();
		return math.mul(x, y);
	}
	@Override
	public double div(double x, double y) {
		lazyLoadMath();
		return math.div(x, y);
	}
}
