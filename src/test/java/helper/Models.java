package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class Models {
    private static RequestSpecification request;

    public static void setupHeaders() {
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json");
    }

    public static Response postLoginUser(String endpoint) {
        String email = "eve.holt@reqres.in";
        String password = "cityslicka";
        JSONObject payload = new JSONObject();
        payload.put("email", email);
        payload.put("password", password);
        setupHeaders();

        return request.body(payload.toString()).when().post(endpoint);
    }
}
