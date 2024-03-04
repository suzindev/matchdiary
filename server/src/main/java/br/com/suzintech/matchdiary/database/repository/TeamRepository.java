package br.com.suzintech.matchdiary.database.repository;

import br.com.suzintech.matchdiary.database.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamEntity, Long> {
}
