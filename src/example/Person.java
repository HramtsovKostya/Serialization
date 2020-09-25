package example;
import java.io.Serializable;

public class Person implements Serializable {
    public String name;
    public Gender gender;
    public int age;
    public double weight;
    public double height;

    public Person() { }

    public Person(String name, Gender gender, int age, double weight, double height) {
        if (name == null || name.length() == 0)
            throw new NullPointerException("Имя человека не может быть пустым или равным null!");

        if (gender == null)
            throw new NullPointerException("Пол человека (гендер) не может быть равен null!");

        if (age <= 0 || age > 100)
            throw  new IllegalArgumentException("Возраст не может быть равен 0, отрицательным или > 100 лет!");

        if (weight <= 0 || weight > 100)
            throw  new IllegalArgumentException("Вес не может быть равен 0, отрицательным или > 100 кг!");

        if (height <= 0 || height > 2.0)
            throw  new IllegalArgumentException("Рост не может быть равен 0, отрицательным или > 2 метров!");

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ",\n"
            + "Пол: " + gender.toString() + ",\n"
            + "Возраст = " + age + " лет,\n"
            + "Вес = " + weight + " кг,\n"
            + "Рост = " + height + " м.";
    }
}