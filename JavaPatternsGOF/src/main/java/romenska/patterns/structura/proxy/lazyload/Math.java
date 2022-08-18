package romenska.patterns.structura.proxy.lazyload;

public class Math implements IMath {
	public Math() {
		System.out.print("Library loading simulation");
		for (int i=0;i<10;i++) {
			try {
				Thread.sleep(100);
				System.out.print(".");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("done");
	}
	
	@Override
	public double add(double x, double y) {
		return x+y;
	}
	@Override
	public double sub(double x, double y) {
		return x-y;
	}
	@Override
	public double mul(double x, double y) {
		return x*y;
	}
	@Override
	public double div(double x, double y) {
		return x/y;
	}
}
