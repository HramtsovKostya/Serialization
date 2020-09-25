import person.*;
import serialization.*;
import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final String BINARY_PATH = "save\\person.bin";
        final String JSON_PATH = "save\\person.json";

        Person person = new Person("Николай", Gender.MALE, 20, 65.8, 1.75);

        BinarySerializer.serialize(BINARY_PATH, person);
        person = (Person) BinarySerializer.deserialize(BINARY_PATH);

        JsonSerializer.serialize(JSON_PATH, person);
        person = (Person) JsonSerializer.deserialize(JSON_PATH, person);

        System.out.println(person);
    }
}