package jsondemo;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JavaToJSONExample {
    public static void main(String[] args) {
        List<City> cityList = new ArrayList<>();
        cityList.add(new City("LA","CA"));
        cityList.add(new City("NY","NY"));
        @SuppressWarnings("deprecation")
        Employee employee = new Employee(1, "Andrew Programming", new long[]{1234123, 4123123}, new Address("california"), cityList, "Manager", false);

        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("employee.json"), employee);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}