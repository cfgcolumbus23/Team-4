package group4.goodwillapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import group4.goodwillapp.model.Applicant;

public interface ApplicantRepository extends MongoRepository<Applicant, Long> {
    //Find Applicant
    Optional<Applicant> findByApplicantId(Long applicantId);
}
