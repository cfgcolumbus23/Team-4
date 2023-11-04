package group4.goodwillapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group4.goodwillapp.model.Applicant;
import group4.goodwillapp.model.Chat;
import group4.goodwillapp.model.ChatLog;
import group4.goodwillapp.model.Coach;
import group4.goodwillapp.model.Course;
import group4.goodwillapp.model.Feedback;
import group4.goodwillapp.repository.ApplicantRepository;
import group4.goodwillapp.repository.ChatLogRepository;
import group4.goodwillapp.repository.ChatRepository;
import group4.goodwillapp.repository.CoachRepository;
import group4.goodwillapp.repository.CoursesRepository;
import group4.goodwillapp.repository.FeedbackRepository;

@Service
public class MongoDBService {

    @Autowired
    private CoursesRepository coursesRepository;

    @Autowired
    private ApplicantRepository applicantRepository;

    @Autowired
    private ChatRepository chatRepository;

    @Autowired
    private ChatLogRepository chatLogRepository;

    @Autowired
    private CoachRepository coachRepository;

    @Autowired
    private FeedbackRepository feedbackRepository;



    // Course save and find and findAll
    public void saveCourse(Course course) {
        coursesRepository.save(course);
    }

    public Optional<Course> getCourseById(Long courseId) {
        return coursesRepository.findByCourseId(courseId);
    }

    public List<Course> getAllCourses() {
        return coursesRepository.findAll();
    }

    // Applicant save and find and findAll
    public void saveApplicant(Applicant applicant) {
        applicantRepository.save(applicant);
    }

    public Optional<Applicant> getApplicantById(Long applicantId) {
        return applicantRepository.findByApplicantId(applicantId);
    }

    public List<Applicant> getAllApplicants() {
        return applicantRepository.findAll();
    }

    // Chat save and find and findAll
    public void saveChat(Chat chat) {
        chatRepository.save(chat);
    }

    public Optional<Chat> getChatById(Long chatId) {
        return chatRepository.findByChatId(chatId);
    }

    public List<Chat> getAllChats() {
        return chatRepository.findAll();
    }

    // ChatLog save and find and findAll
    public void saveChatLog(ChatLog chatLog) {
        chatLogRepository.save(chatLog);
    }

    public Optional<ChatLog> getChatLogById(Long chatLogId) {
        return chatLogRepository.findByChatLogId(chatLogId);
    }

    public List<ChatLog> getAllChatLogs() {
        return chatLogRepository.findAll();
    }
    
    // Coach save and find and findAll
    public void saveCoach(Coach coach) {
        coachRepository.save(coach);
    }

    public Optional<Coach> getCoachById(Long coachId) {
        return coachRepository.findByCoachId(coachId);
    }

    public List<Coach> getAllCoaches() {
        return coachRepository.findAll();
    }


    // Feedback save and find and findAll
    public void saveFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);
    }

    public Optional<Feedback> getFeedbackById(Long feedbackId) {
        return feedbackRepository.findByFeedbackId(feedbackId);
    }

    public List<Feedback> getAllFeedbacks() {
        return feedbackRepository.findAll();
    }



    
    
}
