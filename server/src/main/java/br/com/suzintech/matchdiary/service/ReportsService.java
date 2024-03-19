package br.com.suzintech.matchdiary.service;

import br.com.suzintech.matchdiary.usecase.match.CalculaQuantidadeVitoria;
import br.com.suzintech.matchdiary.usecase.match.ConsultaMatchTodos;
import br.com.suzintech.matchdiary.usecase.match.ConsultaQuantidadePartidas;
import br.com.suzintech.matchdiary.web.domain.reports.ReportsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReportsService {

    private final ConsultaQuantidadePartidas consultaQuantidadePartidas;

    private final ConsultaMatchTodos consultaMatchTodos;

    private final CalculaQuantidadeVitoria calculaQuantidadeVitoria;

    public ReportsResponse getAllReports() {
        return ReportsResponse.builder()
                .matchesQuantity(getMatchesQuantity())
                .winsQuantity(getWinsQuantity())
                .build();
    }

    private Integer getMatchesQuantity() {
        return consultaQuantidadePartidas.executar();
    }

    private Integer getWinsQuantity() {
        return calculaQuantidadeVitoria.executar(consultaMatchTodos.executar());
    }
}
