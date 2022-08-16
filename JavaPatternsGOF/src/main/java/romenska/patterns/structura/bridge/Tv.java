package romenska.patterns.structura.bridge;

public class Tv implements Device {

	boolean work = false;
	int volume = Device.VOLUME_DEFAULT;

	@Override
	public boolean isEnabled() {
		return work;
	}

	@Override
	public void enable() {
		work = true;
		System.out.println("TV is switched on");
	}

	@Override
	public void disable() {
		work = false;
		System.out.println("TV is switched off");
	}

	@Override
	public int getVolume() {
		return volume;
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("TV volume is "+volume+"%");
		this.volume=volume;
		
	}
	
}
