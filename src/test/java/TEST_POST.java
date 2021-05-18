
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TEST_POST {

	@Test
	public void test1_post() {
		
		JSONObject object = new JSONObject();
		
		object.put("Name: ", "Angel");
		object.put("Job: ", "engineer");
		
		System.out.println(object.toJSONString());
		
		given().
		body(object.toJSONString()).
		when().
		 post("https://reqres.in/api/users").
		 then().
		 statusCode(201).log().all();;
		
	}
	
}
