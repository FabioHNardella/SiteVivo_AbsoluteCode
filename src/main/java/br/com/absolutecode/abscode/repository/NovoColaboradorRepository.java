package br.com.absolutecode.abscode.repository;

import br.com.absolutecode.abscode.model.NovoColaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NovoColaboradorRepository extends JpaRepository<NovoColaborador,Long> {
}
