import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.junit.Test;

public class TEST_POSTTest {

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
