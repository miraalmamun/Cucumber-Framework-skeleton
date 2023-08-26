package mir.testingcode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DocString {

    static String str = """
            {
              "name": "John",
              "age": 30,
              "address": {
                "street": "123 Main St",
                "city": "Springfield"
              }
            }
            """;

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(str);
        System.out.println("jsonNode = " + jsonNode);
        System.out.println(jsonNode.get("name").textValue());
        JsonNode address = jsonNode.get("address");
        System.out.println("address = " + address.get("city").textValue());
    }

}
