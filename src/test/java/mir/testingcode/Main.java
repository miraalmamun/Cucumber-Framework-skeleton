package mir.testingcode;

import com.google.gson.Gson;

public class Main {
public static void main(String[] args) {
// Generate a random Person instance
Person person = Person.generateRandomPerson();

    // Convert the Person object to JSON using Gson
    Gson gson = new Gson();
    String json = gson.toJson(person);

    // Print the JSON string
    System.out.println(json);
}
}