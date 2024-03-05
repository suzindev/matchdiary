package br.com.suzintech.matchdiary.web.controller;

import br.com.suzintech.matchdiary.web.domain.team.TeamRequest;
import br.com.suzintech.matchdiary.web.domain.team.TeamResponse;
import br.com.suzintech.matchdiary.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/team")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService service;

    @GetMapping("/{id}")
    @Transactional(readOnly = true)
    public ResponseEntity<TeamResponse> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    @Transactional(readOnly = true)
    public ResponseEntity<List<TeamResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    @Transactional
    public ResponseEntity<TeamResponse> add(@RequestBody TeamRequest request) {
        return ResponseEntity.ok(service.add(request));
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<TeamResponse> update(@PathVariable("id") Long id, @RequestBody TeamRequest request) {
        return ResponseEntity.ok(service.update(request, id));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.delete(id));
    }
}
