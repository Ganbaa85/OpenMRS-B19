package openMrs.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationResponsePojo {
    private List<LocationPojo> results;


    public List<LocationPojo> getResults() {
        return results;
    }

    public void setResults(List<LocationPojo> results) {
        this.results = results;
    }


}
