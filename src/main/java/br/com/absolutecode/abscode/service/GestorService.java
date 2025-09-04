package br.com.absolutecode.abscode.service;

import br.com.absolutecode.abscode.model.Buddy;
import br.com.absolutecode.abscode.model.Gestor;
import br.com.absolutecode.abscode.repository.BuddyRepository;
import br.com.absolutecode.abscode.repository.GestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GestorService {
    private final GestorRepository gestorRepository;

    @Autowired
    public GestorService(GestorRepository gestorRepository) {
        this.gestorRepository = gestorRepository;
    }
    public List<Gestor> getAll() {
        return gestorRepository.findAll();
    }
    public Optional<Gestor> getById(Long id){
        return gestorRepository.findById(id);
    }
    public Gestor create(Gestor gestor) {
        return gestorRepository.save(gestor);
    }
    public void delete(Long id) {
        if(gestorRepository.existsById(id)){
            gestorRepository.deleteById(id);
        } else{
            throw new RuntimeException("Gestor not found with ID: "+ id);
        }
    }
}
