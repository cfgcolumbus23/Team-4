package group4.goodwillapp.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "chats")
public class Chat {
    @Id
    private long chatId;
    private LocalDateTime timeSent;
    private String message;
    private String senderName;

    public Chat(){}

    public Chat(long chatId,LocalDateTime timeSent,String message,String senderName){
        this.chatId = chatId;
        this.timeSent = timeSent;
        this.message = message;
        this.senderName = senderName;
    }
    
}
