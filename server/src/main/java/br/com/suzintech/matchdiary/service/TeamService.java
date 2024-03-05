package br.com.suzintech.matchdiary.service;

import br.com.suzintech.matchdiary.usecase.team.*;
import br.com.suzintech.matchdiary.web.domain.team.TeamRequest;
import br.com.suzintech.matchdiary.web.domain.team.TeamResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final ConsultaTeamPorId consultaTeamPorId;

    private final ConsultaTeamTodos consultaTeamTodos;

    private final TeamConvert convert;

    private final SalvarTeam salvar;

    private final TeamValidate validate;

    private final DeletarTeam deletar;

    public TeamResponse getById(final Long id) {
        return convert.executar(consultaTeamPorId.executar(id));
    }

    public List<TeamResponse> getAll() {
        return consultaTeamTodos.executar()
                .stream()
                .map(convert::executar)
                .collect(Collectors.toList());
    }

    public TeamResponse add(TeamRequest request) {
        validate.executar(request);

        return convert.executar(salvar.executar(convert.executar(request)));
    }

    public TeamResponse update(TeamRequest request, Long id) {
        validate.executar(request);

        return convert.executar(salvar.executar(convert.executar(request, consultaTeamPorId.executar(id))));
    }

    public String delete(final Long id) {
        deletar.executar(consultaTeamPorId.executar(id));

        return "Time excluído com sucesso!";
    }
}
