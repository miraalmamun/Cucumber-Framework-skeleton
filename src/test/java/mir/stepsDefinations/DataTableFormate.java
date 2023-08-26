package mir.stepsDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataTableFormate {


    @Given("List of Strings:")
    public void the_following_animals(List<String> animals) {
        for (String animal : animals) {
            System.out.println(animal);
        }

        /*
          @Given("the following animals:")
          public void the_following_animals(DataTable dataTable) {
            List<String> animals = dataTable.asList();
            for (String animal : animals) {
           // Do something with each animal
           }
       } */
    }

    @Given("List of List of Strings:")
    public void the_following_matrix(List<List<String>> matrix) {
        for (List<String> row : matrix) {
            for (String cell : row) {
            }
        }
    }

    @Given("List of Maps columns as keys:")
    public void the_following_user_data(List<Map<String, String>> users) {
        for (Map<String, String> user : users) {
            String name = user.get("name");
            String age = user.get("age");
        }
    }

    @Given("Map of Strings assuming two columns where first column values become keys:")
    public void the_following_settings(Map<String, String> settings) {
        String theme = settings.get("theme");
        String mode = settings.get("mode");
        // Do something with theme and mode
    }

    @Given("Map of Lists assuming two columns where first column values become keys:")
    public void the_following_data(DataTable dataTable) {
//        List<String> fruits = data.get("fruits");
//        List<String> animals = data.get("animals");
//        // Do something with the lists

        List<List<String>> rawTable = dataTable.asLists(String.class);
        Map<String, List<String>> groupedData = new HashMap<>();

        for (List<String> row : rawTable) {
            String group = row.get(0);
            String item = row.get(1);

            groupedData.computeIfAbsent(group, k -> new ArrayList<>()).add(item);
        }

        // Example usage:
        List<String> fruits = groupedData.get("fruits");
        System.out.println(fruits);  // should print "[apple, banana]"
    }


    @Given("the grouped items:")
    public void the_grouped_items(DataTable dataTable) {
//        dataTable.entries();
//        dataTable.asMap();
//        dataTable.asMaps();
//        dataTable.asLists();
        List<List<String>> rawTable = dataTable.asLists(String.class);
        Map<String, List<String>> groupedData = new HashMap<>();

        for (List<String> row : rawTable) {
            String group = row.get(0);
            String item = row.get(1);

            groupedData.computeIfAbsent(group, k -> new ArrayList<>()).add(item);
        }

        // Example usage:
        List<String> fruits = groupedData.get("fruits");
        //System.out.println(fruits);  // should print "[apple, banana]"
    }

    /*
    //Using DataTable:
    @Given("the following users are registered:")
    public void registerUsers(DataTable table) {
        List<Map<String, String>> users = table.asMaps(String.class, String.class);

        for (Map<String, String> user : users) {
            String firstname = user.get("Firstname");
            String lastname = user.get("Lastname");
            String email = user.get("Email");
            int age = Integer.parseInt(user.get("Age"));
            String address = user.get("Address");

            System.out.println(firstname + ":" + lastname + " : " + email + " : " + age + " : " + address);

            // Use these details to perform registration (e.g., fill out a form using Selenium)
        }
    }
    */
    //Using direct mapping

    @Given("the following users are registered:")
    public void registerUsers(List<User> users) {
        for (User user : users) {
            String firstname = user.Firstname();
            String lastname = user.Lastname();
            String email = user.Email();
            int age = user.Age();
            String address = user.Address();
            System.out.println(firstname + ":" + lastname + " : " + email + " : " + age + " : " + address);
            // Use these details to perform registration
        }
    }
    @DataTableType
    public User toUser(Map<String, String> entry) {
        return new User(entry.get("Firstname"),
                entry.get("Lastname"),
                entry.get("Email"),
                Integer.parseInt(entry.get("Age")),
                entry.get("Address"));
    }






}
