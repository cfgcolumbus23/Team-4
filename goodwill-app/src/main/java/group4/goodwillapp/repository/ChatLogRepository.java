package group4.goodwillapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import group4.goodwillapp.model.ChatLog;

@Repository
public interface ChatLogRepository extends MongoRepository<ChatLog, Long>  {
    //Find ChatLog
    Optional<ChatLog> findByChatLogId(Long chatLogId);

    Optional<ChatLog> findByChatId(long chatId);

    Optional<ChatLog> findByApplicantId(long applicantId);

    Optional<ChatLog> findByCoachId(long coachId);
}
