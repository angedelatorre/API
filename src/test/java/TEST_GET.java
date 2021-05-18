import static org.junit.Assert.*;
import static io.restassured.RestAssured.*;

import org.junit.Test;

public class TEST_GET {

	@Test
	public void test_get() {
		
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
		log().all();
	}
		

}
