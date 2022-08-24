package io.github.andrefurtado11135.hrworker.repository;

import io.github.andrefurtado11135.hrworker.model.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
