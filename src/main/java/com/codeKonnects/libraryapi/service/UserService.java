package com.codeKonnects.libraryapi.service;


import com.codeKonnects.libraryapi.models.users.enums.ERole;
import com.codeKonnects.libraryapi.payload.request.LoginRequest;
import com.codeKonnects.libraryapi.payload.request.RegistrationRequest;
import com.codeKonnects.libraryapi.payload.response.LoginResponse;
import com.codeKonnects.libraryapi.payload.response.RegistrationResponse;

public interface UserService {

    RegistrationResponse registration(RegistrationRequest userRegistrationRequest, ERole eRole);

    LoginResponse login(LoginRequest loginRequest);
}
