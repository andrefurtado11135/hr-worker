package io.github.andrefurtado11135.hrworker.model.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ErrorResponse {

    private String message;

    private LocalDateTime timestamp;
}
