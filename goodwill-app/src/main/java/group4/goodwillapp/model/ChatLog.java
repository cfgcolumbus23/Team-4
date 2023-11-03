package group4.goodwillapp.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "chat_logs")
public class ChatLog {
    @Id
    private long chatLogId;
    private ArrayList<Chat> chats;
    private long applicationId;
    private long coachId;
    
}
