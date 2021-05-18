import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.junit.Test;

public class TEST_PUTTest {

	@Test
public void test2_put() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("Name: ", "Angel");
		map.put("Job: ", "Office Worker");
		
		System.out.println(map);
		
		given().
		body(((JSONObject) map).toJSONString()).
		when().
		 put("https://reqres.in/api/users/2").
		 then().
		 statusCode(201);
	}
}
