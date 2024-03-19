package br.com.suzintech.matchdiary.web.controller;

import br.com.suzintech.matchdiary.service.ReportsService;
import br.com.suzintech.matchdiary.web.domain.reports.ReportsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reports")
@RequiredArgsConstructor
public class ReportsController {

    private final ReportsService service;

    @GetMapping
    public ReportsResponse getReports() {
        return service.getAllReports();
    }
}
