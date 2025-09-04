package br.com.absolutecode.abscode.repository;

import br.com.absolutecode.abscode.model.Buddy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuddyRepository  extends JpaRepository<Buddy, Long> {
}
