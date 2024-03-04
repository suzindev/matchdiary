package br.com.suzintech.matchdiary.usecase.team;

import br.com.suzintech.matchdiary.database.entity.TeamEntity;
import br.com.suzintech.matchdiary.database.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeletarTeam {

    private final TeamRepository repository;

    public void executar(final TeamEntity entity) {
        repository.delete(entity);
    }
}
