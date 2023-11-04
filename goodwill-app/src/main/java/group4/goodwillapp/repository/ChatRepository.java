package group4.goodwillapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import group4.goodwillapp.model.Chat;

public interface ChatRepository extends MongoRepository<Chat, Long> {
    //Find Chat
    Optional<Chat> findByChatId(Long chatId);

    Optional<List<Chat>> findByMessageContent(String message);
    
}
