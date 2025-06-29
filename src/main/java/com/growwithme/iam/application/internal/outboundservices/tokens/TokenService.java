package com.growwithme.iam.application.internal.outboundservices.tokens;

public interface TokenService {

  String generateToken(String email);

  String getEmailByToken(String token);

  boolean validateToken(String token);
}
