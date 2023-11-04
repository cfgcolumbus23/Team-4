package group4.goodwillapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group4.goodwillapp.model.IdCounter;
import group4.goodwillapp.repository.IdCounterRepository;

@Service
public class IdCounterService {

    @Autowired
    IdCounterRepository idCounterRepository;

    public long getIdCounterNumByCollection(String collectionName){
        IdCounter counter = idCounterRepository.findBycollectionName(collectionName).get();
        long id = counter.getIdNum();
        counter.setIdNum(id+1);
        idCounterRepository.save(counter);
        return id;
    }

    public void saveIdCounter(IdCounter idCounter){
        idCounterRepository.save(idCounter);
    }
}
