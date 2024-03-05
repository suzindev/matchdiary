package br.com.suzintech.matchdiary.web.controller;

import br.com.suzintech.matchdiary.service.match.MatchService;
import br.com.suzintech.matchdiary.web.domain.match.MatchRequest;
import br.com.suzintech.matchdiary.web.domain.match.MatchResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/match")
@RequiredArgsConstructor
public class MatchController {

    private final MatchService service;

    @GetMapping("/{id}")
    @Transactional(readOnly = true)
    public ResponseEntity<MatchResponse> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping
    @Transactional(readOnly = true)
    public ResponseEntity<List<MatchResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    @Transactional
    public ResponseEntity<MatchResponse> add(@RequestBody MatchRequest request) {
        return ResponseEntity.ok(service.add(request));
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<MatchResponse> update(@PathVariable("id") Long id, @RequestBody MatchRequest request) {
        return ResponseEntity.ok(service.update(request, id));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.delete(id));
    }
}
