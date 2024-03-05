package br.com.suzintech.matchdiary.usecase.match;

import br.com.suzintech.matchdiary.database.entity.MatchEntity;
import br.com.suzintech.matchdiary.database.repository.MatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ConsultaMatchTodos {

    private final MatchRepository repository;

    public List<MatchEntity> executar() {
        return repository.findAll();
    }
}
