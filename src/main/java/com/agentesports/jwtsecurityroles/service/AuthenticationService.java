package com.agentesports.jwtsecurityroles.service;

import com.agentesports.jwtsecurityroles.dto.SignUpRequest;
import com.agentesports.jwtsecurityroles.entities.User;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);
}
