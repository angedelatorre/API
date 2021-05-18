import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.junit.Test;

public class TEST_PUTTest {

	@Test
public void test2_put() {
		
		JSONObject object = new JSONObject();
		
		object.put("Name: ", "Angel");
		object.put("Job: ", "Office Worker");
		
		System.out.println(object.toJSONString());
		
		given().
		body(object.toJSONString()).
		when().
		 put("https://reqres.in/api/users/2").
		 then().
		 statusCode(201).log().all();;
	}
}
