package com.examen.full.stack.examenfullstack.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@Slf4j
public class AdviceController {

    @ExceptionHandler(DataAccessException.class)
    public ResponseEntity<?> handleDBException(DataAccessException e) {
        Map<String, String> exceptionDetails = new HashMap<>();

        exceptionDetails.put("message", e.getCause().getCause().getMessage());
        exceptionDetails.put("timestamp", LocalDateTime.now().toString());
        exceptionDetails.put("code", String.valueOf(HttpStatus.BAD_REQUEST.value()));
        return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleError(HttpServletRequest req, Exception ex) {
        log.error("Request: " + req.getRequestURL() + " raised " + ex);
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", ex);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }
/*
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<?> handleNullPointer(NullPointerException ex) {

        Map<String, String> exceptionDetails = new HashMap<>();
        exceptionDetails.put("code", String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
        exceptionDetails.put("timestamp", LocalDateTime.now().toString());
        exceptionDetails.put("message", ex.getSuppressed().toString());
        return new ResponseEntity<>(exceptionDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }*/
}
