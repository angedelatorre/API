import static org.junit.Assert.*;
import static io.restassured.RestAssured.*;

import org.junit.Test;

public class TEST_GET {

	//@Test
	public void test_get() {
		
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
		log().all();
	}
	@Test
	public void test4_delete() {
		
		System.out.println("Delete");
		 when().
		 delete("https://reqres.in/api/users/2").
		 then().
		 statusCode(200).log().all();;
	
	}
		

}
