package romenska.patterns.structura.decorator.database;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDataBase implements Database {

	private String name;

	public FileDataBase(String name) {
		this.name = name;
	}

	@Override
	public void write(String data) {

		try (DataOutputStream fos = new DataOutputStream(new FileOutputStream(new File(name)))) {
			fos.writeUTF(data);
		} catch (IOException ex) {
			throw new RuntimeException("Cannot write file");
		}

	}

	@Override
	public String read() {
		
		try (DataInputStream reader = new DataInputStream(new FileInputStream(new File(name)))) {
			return reader.readUTF();
		} catch (IOException ex) {
			throw new RuntimeException("Cannot read file");
		}
		
	}

}
