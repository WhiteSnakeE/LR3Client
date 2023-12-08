package com.knure.project.server.service;

public class Util {

    private Util() { /* hide it */ }

    public static SecurityHeader createSecurityHeader(String token) {
        SecurityHeader header = new SecurityHeader();
        header.setToken(token);
        return header;
    }

}

