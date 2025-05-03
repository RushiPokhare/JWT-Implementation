package service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class JWTService {
    private static String secretKey="3f8c6b2e9f1d4a7b8e0c1a9d3e6f5b7c4d8a1e0f2b3c4a6d7e9f0b1c2d3e4f5a\n";
    private static long expiryTime=360000;

//    generates tokens with extra claims
    public String generateToken(Map<String,Object> extraClaims, UserDetails userDetails){
        return buildTokens(extraClaims,userDetails,expiryTime);
    }

    private String buildTokens(Map<String, Object> extraClaims, UserDetails userDetails, long expiryTime) {
        return
    }
}
