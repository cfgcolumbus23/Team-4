package group4.goodwillapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import group4.goodwillapp.model.Applicant;
import group4.goodwillapp.model.Chat;
import group4.goodwillapp.model.ChatLog;
import group4.goodwillapp.model.Coach;
import group4.goodwillapp.model.Course;
import group4.goodwillapp.model.Feedback;

public interface CoursesRepository extends MongoRepository<Course, Long> {
    //Get Course
    Optional<Course> findByCourseId(Long courseId);


    //Find ChatLog
    Optional<ChatLog> findByChatLogId(Long chatLogId);

    //Find Chat
    Optional<Chat> findByChatId(Long chatId);

    //Find Applicant
    Optional<Applicant> findByApplicantId(Long applicantId);
}
