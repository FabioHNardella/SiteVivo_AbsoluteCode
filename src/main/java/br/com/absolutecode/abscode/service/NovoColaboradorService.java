package br.com.absolutecode.abscode.service;

import br.com.absolutecode.abscode.model.Gestor;
import br.com.absolutecode.abscode.model.NovoColaborador;
import br.com.absolutecode.abscode.repository.GestorRepository;
import br.com.absolutecode.abscode.repository.NovoColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NovoColaboradorService {
    private final NovoColaboradorRepository novoColaboradorRepository;

    @Autowired
    public NovoColaboradorService(NovoColaboradorRepository novoColaboradorRepository) {
        this.novoColaboradorRepository = novoColaboradorRepository;
    }
    public List<NovoColaborador> getAll() {
        return novoColaboradorRepository.findAll();
    }
    public Optional<NovoColaborador> getById(Long id){
        return novoColaboradorRepository.findById(id);
    }
    public NovoColaborador create(NovoColaborador novoColaborador) {
        return novoColaboradorRepository.save(novoColaborador);
    }
    public void delete(Long id) {
        if(novoColaboradorRepository.existsById(id)){
            novoColaboradorRepository.deleteById(id);
        } else{
            throw new RuntimeException("Novo Colaborador not found with ID: "+ id);
        }
    }

}
