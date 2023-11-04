package group4.goodwillapp.controller;

import java.util.List;

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
import group4.goodwillapp.service.ApplicantService;

@RestController
@RequestMapping("/applicant")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @PostMapping("/save")
    public void saveCourse(@RequestBody Applicant applicant) {
        applicantService.saveApplicant(applicant);
    }

    @GetMapping("/get/{appId}")
    public ResponseEntity<Applicant> getApplicantById(@PathVariable Long appId) {
        return applicantService.getApplicantById(appId)
                .map(applicant -> new ResponseEntity<>(applicant, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Applicant>> getAllApplicants() {
        try{
            return new ResponseEntity<List<Applicant>>(applicantService.getAllApplicants(), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }  
    }

    
}
