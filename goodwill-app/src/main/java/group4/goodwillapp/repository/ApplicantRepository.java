package group4.goodwillapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import group4.goodwillapp.model.Applicant;

@Repository
public interface ApplicantRepository extends MongoRepository<Applicant, Long> {
    //Find Applicant
    Optional<Applicant> findByApplicantId(Long applicantId);

    Optional<List<Applicant>> findAllByCoachId(long coachId);

}
