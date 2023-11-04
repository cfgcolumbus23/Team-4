package group4.goodwillapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group4.goodwillapp.model.Applicant;
import group4.goodwillapp.model.Course;
import group4.goodwillapp.service.MongoDBService;

@RestController
@RequestMapping("/applicant")
public class ApplicantController {

    @Autowired
    private MongoDBService mongoDBService;

    @PostMapping("/saveApplicant")
    public void saveCourse(@RequestBody Applicant applicant) {
    mongoDBService.saveApplicant(applicant);
    }

    @GetMapping("/getApplicant/{appId}")
    public ResponseEntity<Applicant> getApplicantById(@PathVariable Long
    applicantId) {
    return mongoDBService.getApplicantById(applicantId)
    .map(applicant -> new ResponseEntity<>(applicant, HttpStatus.OK))
    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/getAllApplicants")
    public ResponseEntity<List<Applicant>> getAllApplicants() {
    try{
    return new ResponseEntity<List<Applicant>>(mongoDBService.getAllApplicants(),
    HttpStatus.OK);
    }catch(Exception e){
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    }

}
