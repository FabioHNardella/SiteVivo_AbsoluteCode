package br.com.absolutecode.abscode.repository;

import br.com.absolutecode.abscode.model.Setor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetorRepository extends JpaRepository<Setor,Long> {
}
