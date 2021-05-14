package com.example.demoprojectstructure.handler;

import com.example.demoprojectstructure.dto.ApiResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler({RuntimeException.class})
    public ApiResponse handleRuntimeException(RuntimeException e) {
        final ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage(e.getMessage());
        apiResponse.setCode(400);
        apiResponse.setTimestamp(LocalDateTime.now());
        return apiResponse;
    }
}
