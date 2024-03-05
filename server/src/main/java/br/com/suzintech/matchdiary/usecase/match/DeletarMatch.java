package br.com.suzintech.matchdiary.usecase.match;

import br.com.suzintech.matchdiary.database.entity.MatchEntity;
import br.com.suzintech.matchdiary.database.repository.MatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeletarMatch {

    private final MatchRepository repository;

    public void executar(final MatchEntity entity) {
        repository.delete(entity);
    }
}
