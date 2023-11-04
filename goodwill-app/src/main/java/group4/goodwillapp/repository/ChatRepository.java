package group4.goodwillapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import group4.goodwillapp.model.Chat;

@Repository
public interface ChatRepository extends MongoRepository<Chat, Long> {
    //Find Chat
    Optional<Chat> findByChatId(Long chatId);
    
}
