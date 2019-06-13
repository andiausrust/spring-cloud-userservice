package com.andi.userservice.ui.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class CreateUserRequestModel {

    @NotNull(message = "first name must not be null")
    @Size(min = 2, message = "first name must be 2 long")
    private String firstName;

    @NotNull(message = "last name must not be null")
    @Size(min = 2, message = "last name must be 2 long")
    private String lastName;

    @NotNull
    @Size(min = 8, max = 16, message = "password must be between 8 and 16 characters")
    private String password;

    @NotNull
    @Email
    private String email;


}