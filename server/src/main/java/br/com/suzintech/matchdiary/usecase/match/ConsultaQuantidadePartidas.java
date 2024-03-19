package br.com.suzintech.matchdiary.usecase.match;

import br.com.suzintech.matchdiary.database.repository.MatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConsultaQuantidadePartidas {

    private final MatchRepository repository;

    public Integer executar() {
        return Math.toIntExact(repository.count());
    }
}
