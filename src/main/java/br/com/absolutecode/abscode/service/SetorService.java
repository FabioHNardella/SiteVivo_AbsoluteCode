package br.com.absolutecode.abscode.service;

import br.com.absolutecode.abscode.model.NovoColaborador;
import br.com.absolutecode.abscode.model.Setor;
import br.com.absolutecode.abscode.repository.NovoColaboradorRepository;
import br.com.absolutecode.abscode.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SetorService {
    private final SetorRepository setorRepository;

    @Autowired
    public SetorService(SetorRepository setorRepository) {
        this.setorRepository = setorRepository;
    }
    public List<Setor> getAll() {
        return setorRepository.findAll();
    }
    public Optional<Setor> getById(Long id){
        return setorRepository.findById(id);
    }
    public Setor create(Setor setor) {
        return setorRepository.save(setor);
    }
    public void delete(Long id) {
        if(setorRepository.existsById(id)){
            setorRepository.deleteById(id);
        } else{
            throw new RuntimeException("Setor not found with ID: "+ id);
        }
    }

}
