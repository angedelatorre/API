import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.junit.Test;

public class TEST_PATCH {

	@Test
public void test3_patch() {
		
		JSONObject object = new JSONObject();
		
		object.put("Name: ", "Angel");
		object.put("Job: ", "Cashier");
		
		System.out.println(object.toJSONString());
		
		given().
		body(object.toJSONString()).
		when().
		 patch("https://reqres.in/api/users/2").
		 then().
		 statusCode(200).log().all();;
		
	}

}
