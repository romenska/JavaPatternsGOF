package romenska.patterns.structura.bridge;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


	@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
	public class DeviceTest {

		static Device device;
		static Remote remote;

		@BeforeAll
		static void beforeAll() {
			device = new Tv();
			remote = new BasicRemote(device);
		}

		@Test
		@Order(1)
		@DisplayName("Switch on device")
		public void testRemotePowerOn() {
			assertFalse(device.isEnabled());
			remote.power();
			assertTrue(device.isEnabled());
		}

		@Test
		@Order(2)
		@DisplayName("Volume up")
		public void testEnabledRemoteVolumeUp() {
			for (int i = 0; i < 20; i++)
				remote.volumeUp();
			assertEquals(Device.VOLUME_MAX, device.getVolume());
		}

		@Test
		@Order(3)
		@DisplayName("Volume down")
		public void testEnabledTvRemoteVolumeDown() {
			for (int i = 0; i < 20; i++)
				remote.volumeDown();
			assertEquals(Device.VOLUME_MIN, device.getVolume());

		}

		@Test
		@Order(4)
		@DisplayName("Switch off device")
		public void testTvRemotePowerOff() {
			assertTrue(device.isEnabled());
			remote.power();
			assertFalse(device.isEnabled());
		}

		@Test
		@Order(5)
		public void testDiableRemoteVolumeUp() {
			device.setVolume(Device.VOLUME_DEFAULT);
			for (int i = 0; i < 20; i++)
				remote.volumeUp();
			assertEquals(Device.VOLUME_DEFAULT, device.getVolume());
		}

		@Test
		@Order(6)
		public void testDiableRemoteVolumeDown() {
			device.setVolume(Device.VOLUME_DEFAULT);
			for (int i = 0; i < 20; i++)
				remote.volumeDown();
			assertEquals(Device.VOLUME_DEFAULT, device.getVolume());
		}

	

}
