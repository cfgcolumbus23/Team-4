package group4.goodwillapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group4.goodwillapp.model.Feedback;
import group4.goodwillapp.service.FeedbackService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping(value = "/save", consumes = MediaType.ALL_VALUE)
    public void saveFeedback(@RequestBody Feedback feedback) {
        feedbackService.saveFeedback(feedback);
    }

    @GetMapping("/get/{feedbackId}")
    public ResponseEntity<Feedback> getFeedback(@PathVariable Long feedbackId) {
        return feedbackService.getFeedbackById(feedbackId)
                .map(feedback -> new ResponseEntity<>(feedback, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
