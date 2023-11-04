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

    public Optional<List<Applicant>> getApplicantByCoachId(Long coachId) {
        return applicantRepository.findAllByCoachId(coachId);
    }
}