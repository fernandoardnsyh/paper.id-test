package pages;

import helper.Endpoint;
import io.restassured.response.Response;

import java.util.List;

import static helper.Models.postLoginUser;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiPage {
    String setURL;
    Response res;

    public void prepareUrlFor(String url) {
        switch (url) {
            case "LOGIN_USER":
                setURL = Endpoint.LOGIN_USER;
                break;
            default:
                System.out.println("input right url");
        }
        System.out.println("endpoint siap pakai adalah : " + setURL);
    }

    public void hitApiPostLoginUser(){
        res = postLoginUser(setURL);
        System.out.println(res.getBody().asString());
    }

    public void validationStatusCodeIsEquals(int status_code) {
        assertThat(res.statusCode()).isEqualTo(status_code);
        System.out.println(res.getStatusCode());
    }

    public void validationResponseBodyPostLoginUser() {
        String token = res.jsonPath().getString("token");
        assertThat(token).isNotNull();
    }
}
