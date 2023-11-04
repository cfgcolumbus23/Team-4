package group4.goodwillapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group4.goodwillapp.model.Feedback;
import group4.goodwillapp.repository.FeedbackRepository;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository feedbackRepository;

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

    // public Optional<Feedback> getFeedbackByMessageContent(String message) {
    // return feedbackRepository.findByMessageContent(message);
    // }

    public Optional<Feedback> getFeedbackBySingleParent(boolean isSingleParent) {
        return feedbackRepository.findByIsSingleParent(isSingleParent);
    }

    public Optional<Feedback> getFeedbackByVeteran(boolean isVeteran) {
        return feedbackRepository.findByIsVeteran(isVeteran);
    }

    public Optional<Feedback> getFeedbackByIncarceration(boolean beenIncarcerated) {
        return feedbackRepository.findByWasIncarcerated(beenIncarcerated);
    }

    public Optional<Feedback> getFeedbackByIDD(boolean hasIDD) {
        return feedbackRepository.findByHasIDD(hasIDD);
    }

}
