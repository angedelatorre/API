import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.junit.Test;

public class TEST_POSTTest {

	@Test
	public void test1_post() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("Name: ", "Angel");
		map.put("Job: ", "engineer");
		
		System.out.println(map);
		
		given().
		body(((JSONObject) map).toJSONString()).
		when().
		 post("https://reqres.in/api/users").
		 then().
		 statusCode(201);
		
	}
	
}
