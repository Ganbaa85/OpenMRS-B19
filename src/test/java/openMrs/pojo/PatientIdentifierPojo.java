package openMrs.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PatientIdentifierPojo {
    private String uuid;
}
