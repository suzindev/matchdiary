package br.com.suzintech.matchdiary.database.repository;

import br.com.suzintech.matchdiary.database.entity.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<MatchEntity, Long> {
}
