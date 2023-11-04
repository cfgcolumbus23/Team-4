package group4.goodwillapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import group4.goodwillapp.model.ChatLog;

public interface ChatLogRepository extends MongoRepository<ChatLog, Long>  {
    //Find ChatLog
    Optional<ChatLog> findByChatLogId(Long chatLogId);

    Optional<ChatLog> findByChatId(long chatId);

    Optional<ChatLog> findByApplicantId(long applicantId);

    Optional<ChatLog> findByCoachId(long coachId);
}
