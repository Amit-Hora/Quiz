package com.codefriend.designpatterns;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializingSingleton implements Serializable{

private static SerializingSingleton instance = new SerializingSingleton();
private int i;

public static SerializingSingleton getInstance() {
    return instance;
}

private SerializingSingleton() {
}

private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
    ois.defaultReadObject();
    instance = this;
}

private Object readResolve()  {
    return instance;
}

public static void main(String[] args) throws Throwable {

	SerializingSingleton s = SerializingSingleton.getInstance();
    s.i = 5;

    ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
    oos.writeObject(getInstance());
    oos.close();

    s.i = 7; //modified after serialization

    InputStream is = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(is);
    SerializingSingleton deserialized = (SerializingSingleton) ois.readObject();
    System.out.println(deserialized.i);  // prints 5
}
}