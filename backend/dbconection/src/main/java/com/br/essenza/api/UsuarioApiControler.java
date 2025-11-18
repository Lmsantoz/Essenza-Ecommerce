package com.br.essenza.api;

import fi.iki.elonen.NanoHTTPD;

import static fi.iki.elonen.NanoHTTPD.newFixedLengthResponse;

public class UsuarioApiControler {
    private UsuarioService service;

    public UsuarioApiControler(UsuarioService service) {
        this.service = service;
    }

    public NanoHTTPD.Response handle(NanoHTTPD.IHTTPSession session) {
        return newFixedLengthResponse("Controller funcionando");
    }
}
