package com.yash.microserviceuserregistration.dto;

import com.yash.microserviceuserregistration.model.UserModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListAllUserResponseDto {
    private List<UserModel> data;
    private int Status;
    private String message;
    private String error;
}
