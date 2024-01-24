//package com.kdTalents.TalentPool.security;
//
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import io.jsonwebtoken.security.Keys;
//import org.springframework.stereotype.Service;
//
//import java.security.Key;
//import java.util.Date;
//
//@Service
//public class JwtService {
//    static final long EXPIRATIONTIME = 86400000;
//    static final String PREFIX ="Bearer";
//    static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
//    public String getToken(String username){
//        String token = Jwts.builder()
//                .setSubject(username)
//                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
//                .signWith(key)
//                .compact();
//        return token;
//    }
//
//    public String getAuthUser
//
//}
