package mir.stepsDefinations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.DocStringType;
import io.cucumber.java.en.Given;

public class Json {


    @Given("I have the following JSON data:")
    public void i_have_the_following_JSON_data(JsonNode json) {

        System.out.println("Name: " + json.get("name").asText());
        System.out.println("Age: " + json.get("age").asInt());
        JsonNode address = json.get("address");
        System.out.println("Street: " + address.get("street").asText());
        System.out.println("City: " + address.get("city").asText());
    }
    @DocStringType
    public JsonNode json(String docString) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readTree(docString);
    }

}
