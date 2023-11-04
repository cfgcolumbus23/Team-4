package group4.goodwillapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "carrerpaths")
public class CareerPath {
    @Id
    private long carrerPathId;

    @JsonProperty("courseId")
    private long courseId;
}
