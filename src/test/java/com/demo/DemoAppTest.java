package com.demo;

import com.google.gson.Gson;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class DemoAppTest {

    @Test
    public void addTest() {
        Integer i1 = 10;
        Integer i2 = 20;
        CalculatorPojo pojo = new CalculatorPojo();
        pojo.setFirstNumber(i1);
        pojo.setSecondNumber(i2);
        pojo.setOperation("substract");
        Gson gson = new Gson();
        String json = gson.toJson(pojo);
        Response response = AppUtil.postCall("http://localhost:10002/demo/calculate",json);
        System.out.println(response.asString());
    }
}
