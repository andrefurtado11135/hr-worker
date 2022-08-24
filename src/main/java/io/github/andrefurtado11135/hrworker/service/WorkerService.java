package io.github.andrefurtado11135.hrworker.service;

import io.github.andrefurtado11135.hrworker.exceptions.WorkerNotFoundException;
import io.github.andrefurtado11135.hrworker.model.entities.Worker;
import io.github.andrefurtado11135.hrworker.repository.WorkerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WorkerService {

    public WorkerRepository workerRepository;

    public List<Worker> findAll(){
        return workerRepository.findAll();
    }

    public Worker findById(Long id){
        return workerRepository.findById(id).orElseThrow(() -> new WorkerNotFoundException("Worker not found"));
    }
}
