package com.acme.arquitech.platform.iam.interfaces.rest.resources;

public record AuthenticatedUserResource(String email, String token) {
}
