package mir.testingcode;


import com.github.javafaker.Faker;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Person {
    private String name;
    private String phone;
    private List<String> subjects;
    private int age;

    // Generate a new Person instance with random data
    // Generate a new Person instance with random data
    public static Person generateRandomPerson() {
        Person person = new Person();

        // Generate random name
        person.setName(generateRandomName());

        // Generate random phone number
        person.setPhone(generateRandomPhoneNumber());

        // Generate random subjects
        person.setSubjects(generateRandomSubjects());

        // Generate unique random age
        person.setAge(generateUniqueRandomAge());

        return person;
    }

// Getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

// Helper methods to generate random data

    private static String generateRandomName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    private static String generateRandomPhoneNumber() {
        Faker faker = new Faker();
        return faker.phoneNumber().phoneNumber();
    }

    private static List<String> generateRandomSubjects() {
        Faker faker = new Faker();
        return faker.lorem().words(3);
    }

    private static int generateUniqueRandomAge() {
        Set<Integer> uniqueAges = new HashSet<>();
        Random random = new Random();
        int age;
        do {
            age = random.nextInt(50) + 18; // Generate age between 18 and 67
        } while (!uniqueAges.add(age));
        return age;
    }

}
