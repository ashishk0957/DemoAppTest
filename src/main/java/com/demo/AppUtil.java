package com.demo;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AppUtil {

    public static Response postCall(String url,String inputBody) {

        Response apiResponse = given()
                .contentType(ContentType.JSON)
                .body(inputBody)
                .log()
                .everything()
                .expect()
                .log()
                .ifError()
                .when()
                .post(url);

        return apiResponse;
    }
}
