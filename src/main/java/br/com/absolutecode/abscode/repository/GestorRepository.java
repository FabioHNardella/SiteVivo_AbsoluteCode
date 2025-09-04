package br.com.absolutecode.abscode.repository;

import br.com.absolutecode.abscode.model.Gestor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestorRepository  extends JpaRepository<Gestor,Long> {
}
