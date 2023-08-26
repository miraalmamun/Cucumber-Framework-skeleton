package mir.jsonjava;

import com.google.gson.Gson;
import java.util.*;

public class DynamicDataGeneratorTwo {
    private static final String[] NAMES = {"John", "Alice", "Michael", "Emily"};
    private static final String[] SUBJECTS = {"Math", "Science", "History", "English"};

    public static void main(String[] args) {
        String name = generateRandomName();
        String phone = generateRandomPhoneNumber();
        List<String> subjects = generateRandomSubjects();
        int age = generateUniqueRandomAge();

        Map<String, Object> jsonData = new HashMap<>();
        jsonData.put("name", name);
        jsonData.put("phone", phone);
        jsonData.put("subject", subjects);
        jsonData.put("age", age);

        Gson gson = new Gson();
        String json = gson.toJson(jsonData);

        System.out.println(json);
    }

    private static String generateRandomName() {
        Random random = new Random();
        int index = random.nextInt(NAMES.length);
        return NAMES[index];
    }

    private static String generateRandomPhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int digit = random.nextInt(10);
            phoneNumber.append(digit);
        }
        return phoneNumber.toString();
    }

    private static List<String> generateRandomSubjects() {
        Random random = new Random();
        int numSubjects = random.nextInt(4) + 1; // Generate 1 to 4 subjects
        List<String> subjects = new ArrayList<>();
        for (int i = 0; i < numSubjects; i++) {
            int index = random.nextInt(SUBJECTS.length);
            subjects.add(SUBJECTS[index]);
        }
        return subjects;
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
