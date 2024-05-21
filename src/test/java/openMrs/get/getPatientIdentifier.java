package openMrs.get;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import openMrs.pojo.ResultsPojo;
import org.junit.Test;

public class getPatientIdentifier {
    @Test
    public void patientIdentifier() {
        RestAssured.baseURI = "http://codefish.ninja";
        RestAssured.basePath = "openmrs/ws/rest/v1/patientidentifiertype";
        Response response = RestAssured.given().accept(ContentType.JSON)
                .header("Authorization","Basic QWRtaW46QWRtaW4xMjM=")
                .when().get()
                .then().statusCode(200)
                .extract().response();
        ResultsPojo parsedResponse = response.as(ResultsPojo.class);
        System.out.println(parsedResponse.getResults().get(0).getUuid());
        System.out.println(parsedResponse.getResults().get(1).getUuid());
        System.out.println(parsedResponse.getResults().get(2).getUuid());

    }


}
