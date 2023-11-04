package group4.goodwillapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Document(collection = "id_counter")
public class IdCounter {

    @Id
    private String collectionName;

    private long idNum;
    
}
