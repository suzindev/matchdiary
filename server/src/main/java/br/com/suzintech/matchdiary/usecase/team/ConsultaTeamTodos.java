package br.com.suzintech.matchdiary.usecase.team;

import br.com.suzintech.matchdiary.database.entity.TeamEntity;
import br.com.suzintech.matchdiary.database.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ConsultaTeamTodos {

    private final TeamRepository repository;

    public List<TeamEntity> executar() {
        return repository.findAll();
    }
}
