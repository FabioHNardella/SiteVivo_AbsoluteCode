package br.com.absolutecode.abscode.service;

import br.com.absolutecode.abscode.model.Buddy;
import br.com.absolutecode.abscode.repository.BuddyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BuddyService {
    private final BuddyRepository buddyRepository;

    @Autowired
    public BuddyService(BuddyRepository buddyRepository) {
        this.buddyRepository = buddyRepository;
    }
    public List<Buddy> getAll() {
        return buddyRepository.findAll();
    }
    public Optional<Buddy> getById(Long id){
        return buddyRepository.findById(id);
    }
    public Buddy create(Buddy buddy) {
        return buddyRepository.save(buddy);
    }
    public void delete(Long id) {
        if(buddyRepository.existsById(id)){
            buddyRepository.deleteById(id);
        } else{
            throw new RuntimeException("Buddy not found with ID: "+ id);
        }
    }


}
