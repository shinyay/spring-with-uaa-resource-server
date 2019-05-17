package io.pivotal.shinyay.oauth2.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Oauth2ResourceServerController {

    @RequestMapping("/")
    public String index(@AuthenticationPrincipal Jwt jwt) {
        return String.format("Hello, %s", jwt.getSubject());
    }

    @RequestMapping("/read")
    public String read(JwtAuthenticationToken jwtAuthenticationToken) {
        return String.format("Hello Read: %s", jwtAuthenticationToken.getTokenAttributes());
    }

    @RequestMapping("/write")
    public String write(Principal principal) {
        return String.format("Hello, Write: %s", principal.getName());
    }
}
