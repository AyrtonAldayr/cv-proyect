package com.examen.full.stack.examenfullstack.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

import java.io.Serializable;


//@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
/*
@Getter
@Setter
@AllArgsConstructor
 */
public class HeaderAccess implements Serializable {

    //@Builder.Default
    @JsonProperty(value = "user-access")
    private String userAccess;

    //@Builder.Default
    @JsonProperty(value = "pass-access")
    private String passAccess;



}
