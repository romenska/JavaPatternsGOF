package romenska.patterns.structura.bridge;

public interface Device {
	
	public static final int VOLUME_MIN=0;
	
	public static final int VOLUME_MAX=100;
	
	public static final int VOLUME_STEP=10;
	
	public static final int VOLUME_DEFAULT=50;
	
    boolean isEnabled();

    void enable();

    void disable();
    

    int getVolume();

    void setVolume(int volume);

}
