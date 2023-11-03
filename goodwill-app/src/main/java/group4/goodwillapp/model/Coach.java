package group4.goodwillapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Document(collection ="coaches")
public class Coach extends Person{
    @Id
    private long coachId;

    public Coach(){}

    public Coach(String name, String email, String phoneNum, int age, String password,long coachId){
        super(name, email, phoneNum, age, password);
        this.coachId = coachId;
    }

    
}
