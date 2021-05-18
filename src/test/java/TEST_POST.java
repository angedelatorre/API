import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TEST_POST {

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
