package openMrs.utils;

public class PayloadUtils {
    public static String getPatientPayload(){

        String payload = "{\n" +
                "    \"names\": [\n" +
                "        {\n" +
                "        \"givenName\": \"NewPatient\",\n" +
                "        \"familyName\": \"Lastname\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"gender\": \"M\",\n" +
                "    \"birthdate\": \"1997-09-02\",\n" +
                "    \"addresses\": [\n" +
                "        {\n" +
                "        \"address1\": \"1 Kiev\",\n" +
                "        \"cityVillage\": \"Kiev\",\n" +
                "        \"country\": \"ukraine\",\n" +
                "        \"postalCode\": \"89003\"\n" +
                "        }\n" +
                "    ]\n" +
                "}\n";
        return payload;
    }
}
