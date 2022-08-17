package romenska.patterns.structura.decorator.database;

import java.util.Base64;

public class EncryptionDecorator extends DatabaseDecorator {

	public EncryptionDecorator(Database database) {
		super(database);
	}

	@Override
	public void write(String data) {
		super.write(encode(data));

	}

	@Override
	public String read() {
		return decode(super.read());
	}

	private String encode(String data) {
		return Base64.getEncoder().encodeToString(data.getBytes());
	}

	private String decode(String data) {
		return new String(Base64.getDecoder().decode(data));
	}

}
