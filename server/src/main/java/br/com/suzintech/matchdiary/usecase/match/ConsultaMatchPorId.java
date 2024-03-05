package br.com.suzintech.matchdiary.usecase.match;

import br.com.suzintech.matchdiary.database.entity.MatchEntity;
import br.com.suzintech.matchdiary.database.repository.MatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConsultaMatchPorId {

    private final MatchRepository repository;

    public MatchEntity executar(final Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Partida não encontrada."));
    }
}
