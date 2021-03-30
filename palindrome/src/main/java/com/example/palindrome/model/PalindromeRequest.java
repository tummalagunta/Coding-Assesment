package com.example.palindrome.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Validated
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PalindromeRequest {

    @NotNull(message = "Name cant be null")
    @Size(min = 1, max = 1000, message
            = "Name must be between 1 and 1000 characters")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
