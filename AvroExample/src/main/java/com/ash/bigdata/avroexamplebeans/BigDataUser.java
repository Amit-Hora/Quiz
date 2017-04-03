package com.ash.bigdata.avroexamplebeans;

import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import com.ash.bigdata.avroexample.User;

public class BigDataUser {

	public static void main(String[] args) throws IOException {
		/**
		 * Constructing the object by directly using constructor
		 */
		User user1 = new User();
		user1.setName("Amit");
		user1.setFavoriteNumber(256);
		User user3 = User.newBuilder()
	             .setName("Charlie")
	             .setFavoriteColor("blue")
	             .setFavoriteNumber(null)
	             .build();
	/**
	 * serliaize
	 */
		DatumWriter<User> userDatumWriter = new SpecificDatumWriter<User>(User.class);
		DataFileWriter<User> dataFileWriter = new DataFileWriter<User>(userDatumWriter);
		dataFileWriter.create(user1.getSchema(), new File("users.avro"));
		dataFileWriter.append(user1);
		dataFileWriter.append(user3);
		dataFileWriter.close();
		deSerialize();
	}
	
	static void deSerialize() throws IOException{
		// Deserialize Users from disk
		DatumReader<User> userDatumReader = new SpecificDatumReader<User>(User.class);
		DataFileReader<User> dataFileReader = new DataFileReader<User>(new File("users.avro"), userDatumReader);
		User user = null;
		while (dataFileReader.hasNext()) {
		// Reuse user object by passing it to next(). This saves us from
		// allocating and garbage collecting many objects for files with
		// many items.
		user = dataFileReader.next(user);
		System.out.println(user);
		}
	}
}
