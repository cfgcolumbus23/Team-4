package group4.goodwillapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group4.goodwillapp.model.Applicant;
import group4.goodwillapp.repository.ApplicantRepository;

@Service
public class ApplicantService {
    
    @Autowired
    private ApplicantRepository applicantRepository;

    @Autowired
    private IdCounterService idCounterService;

    // Applicant save and find and findAll
    public void saveApplicant(Applicant applicant) {
        applicant.setApplicantId(idCounterService.getIdCounterNumByCollection("applicants"));
        applicantRepository.save(applicant);
    }

    public Optional<Applicant> getApplicantById(Long applicantId) {
        return applicantRepository.findByApplicantId(applicantId);
    }

    public List<Applicant> getAllApplicants() {
        return applicantRepository.findAll();
    }

    public Optional<List<Applicant>> getApplicantByCoachId(Long coachId) {
        return applicantRepository.findAllByCoachId(coachId);
    }

    public Integer getApplicantProgressBar(long applicantId) {
        
        Applicant applicant = getApplicantById(applicantId).get();

        double result =  (double) (applicant.getCoursesTaken().size()/applicant.getCurrCareerPath().getCourseIds().size());

        return (int) Math.round(result);
    }

    public boolean checkUserLogin(String username, String password) {
        return 0 != getAllApplicants().stream().filter(data -> data.getEmail().equals(username)).filter(data -> data.getPassword().equals(password)).count();
    }
}
