package com.agentesports.jwtsecurityroles.service;

import com.agentesports.jwtsecurityroles.dto.JwtAuthenticationResponse;
import com.agentesports.jwtsecurityroles.dto.RefeshTokenRequest;
import com.agentesports.jwtsecurityroles.dto.SignUpRequest;
import com.agentesports.jwtsecurityroles.dto.SigninRequest;
import com.agentesports.jwtsecurityroles.entities.User;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signin(SigninRequest signinRequest);

    JwtAuthenticationResponse refreshToken(RefeshTokenRequest refeshTokenRequest);
}
