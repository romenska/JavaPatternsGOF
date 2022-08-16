package romenska.patterns.structura.bridge;

public class BasicRemote implements Remote {
	
    protected Device device;

    public BasicRemote() {}

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.print("Remote power: ");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

	@Override
	public void volumeUp() {
		if (device.isEnabled()) {
			if( device.getVolume()<Device.VOLUME_MAX) {
				device.setVolume( device.getVolume()+Device.VOLUME_STEP);
			}else {
				device.setVolume(Device.VOLUME_MAX);
			}
		}
	}

	@Override
	public void volumeDown() {
		if (device.isEnabled()) {
			if( device.getVolume()>Device.VOLUME_MIN) {
				device.setVolume( device.getVolume()-Device.VOLUME_STEP);
			}else {
				device.setVolume(Device.VOLUME_MIN);
			}
		}
	}
}
