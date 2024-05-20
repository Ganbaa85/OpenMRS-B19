package openMrs.post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import openMrs.pojo.NamesPojo;
import openMrs.utils.PayloadUtils;
import org.junit.Before;
import org.junit.Test;

public class CreatePatient {


    @Before
    public void setup() {
        RestAssured.baseURI = "http://codefish.ninja";
        RestAssured.basePath = "openmrs/ws/rest/v1/person";

    }

    @Test
    public void createPetTest() {
        Response response = RestAssured.given().accept(ContentType.JSON).contentType(ContentType.JSON)
                .header("Authorization", "Basic QWRtaW46QWRtaW4xMjM=")
                .body(PayloadUtils.getPatientPayload())
                .when().post()
                .then().statusCode(201)
                .extract().response();


    }
}
