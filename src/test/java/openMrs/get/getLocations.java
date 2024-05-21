package openMrs.get;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import openMrs.pojo.LocationPojo;
import openMrs.pojo.LocationResponsePojo;

import openMrs.pojo.LocationResponsePojo;
import org.junit.Test;

import java.util.List;


public class getLocations {

    @Test
    public void locationsTest() {
        RestAssured.baseURI = "http://codefish.ninja";
        RestAssured.basePath = "openmrs/ws/rest/v1/location";
        Response response = RestAssured.given().accept(ContentType.JSON)
                .header("Authorization", "Basic QWRtaW46QWRtaW4xMjM=")
                .when().get()
                .then().statusCode(200)
                .extract().response();

        LocationResponsePojo parsedResponse = response.as(LocationResponsePojo.class);
        for (LocationPojo location : parsedResponse.getResults()) {
            System.out.println(location.getUuid()+" " +location.getDisplay());
        }


    }


}




