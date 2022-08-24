package io.github.andrefurtado11135.hrworker.controller;

import io.github.andrefurtado11135.hrworker.model.entities.Worker;
import io.github.andrefurtado11135.hrworker.service.WorkerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
@AllArgsConstructor
public class WorkerController {

    public WorkerService workerService;

    @GetMapping
    public ResponseEntity<List<Worker>> getAll(){
        return ResponseEntity.ok(workerService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(workerService.findById(id));
    }
}
