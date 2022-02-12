package com.yash.microserviceuserregistration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddUserRequestDto {
    private String firstName;
    private String lastName;
    private String username;
}
