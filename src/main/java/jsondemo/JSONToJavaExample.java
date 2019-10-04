package jsondemo;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JSONToJavaExample {
    public static void main(String[] args) {
        Employee employee = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            employee = mapper.readValue(new File("employee.json"), Employee.class);
            System.out.println(employee);
        } catch (JsonGenerationException e) {

        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
