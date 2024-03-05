package br.com.suzintech.matchdiary.service.match;

import br.com.suzintech.matchdiary.usecase.match.*;
import br.com.suzintech.matchdiary.web.domain.match.MatchRequest;
import br.com.suzintech.matchdiary.web.domain.match.MatchResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MatchService {

    private final ConsultaMatchPorId consultaMatchPorId;

    private final ConsultaMatchTodos consultaMatchTodos;

    private final MatchConvert convert;

    private final SalvarMatch salvar;

    private final MatchValidate validate;

    private final DeletarMatch deletar;

    public MatchResponse getById(final Long id) {
        return convert.executar(consultaMatchPorId.executar(id));
    }

    public List<MatchResponse> getAll() {
        return consultaMatchTodos.executar()
                .stream()
                .map(convert::executar)
                .collect(Collectors.toList());
    }

    public MatchResponse add(MatchRequest request) {
        validate.executar(request);

        return convert.executar(salvar.executar(convert.executar(request)));
    }

    public MatchResponse update(MatchRequest request, Long id) {
        validate.executar(request);

        return convert.executar(salvar.executar(convert.executar(request, consultaMatchPorId.executar(id))));
    }

    public String delete(final Long id) {
        deletar.executar(consultaMatchPorId.executar(id));

        return "Partida excluída com sucesso!";
    }
}
