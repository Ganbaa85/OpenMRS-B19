package openMrs.pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter @Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultsPojo {
    private List<PatientIdentifierPojo> results;

}
