package com.agentesports.jwtsecurityroles.controller;


import com.agentesports.jwtsecurityroles.dto.JwtAuthenticationResponse;
import com.agentesports.jwtsecurityroles.dto.RefeshTokenRequest;
import com.agentesports.jwtsecurityroles.dto.SignUpRequest;
import com.agentesports.jwtsecurityroles.dto.SigninRequest;
import com.agentesports.jwtsecurityroles.entities.User;
import com.agentesports.jwtsecurityroles.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody SignUpRequest signUpRequest){
        return ResponseEntity.ok(authenticationService.signup(signUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse>signin(@RequestBody SigninRequest signinRequest){
        return ResponseEntity.ok(authenticationService.signin(signinRequest));
    }

    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthenticationResponse>refresh(@RequestBody RefeshTokenRequest refeshTokenRequest){
        return ResponseEntity.ok(authenticationService.refreshToken(refeshTokenRequest));
    }



}
