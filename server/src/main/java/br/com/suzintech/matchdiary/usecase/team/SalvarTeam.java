package br.com.suzintech.matchdiary.usecase.team;

import br.com.suzintech.matchdiary.database.entity.TeamEntity;
import br.com.suzintech.matchdiary.database.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SalvarTeam {

    private final TeamRepository repository;

    public TeamEntity executar(TeamEntity entity) {
        return repository.save(entity);
    }
}
