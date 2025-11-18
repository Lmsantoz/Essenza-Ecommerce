package com.br.essenza.api;

import fi.iki.elonen.NanoHTTPD;
import fi.iki.elonen.NanoHTTPD;
import fi.iki.elonen.NanoHTTPD.IHTTPSession;
import fi.iki.elonen.NanoHTTPD.Method;
import fi.iki.elonen.NanoHTTPD.Response;


import java.io.IOException;

public class ApiServer extends NanoHTTPD {
    private UsuarioApiControler usuarioApiControler = new UsuarioApiControler(new UsuarioService());

    public static void main(String[] args) throws Exception {
        var apiserver = new ApiServer();
    }

    public ApiServer() throws Exception {
        super(8000);
        start(SOCKET_READ_TIMEOUT, false);
        System.out.println("Servidor rodando na porta 8000... ");
    }

    @Override
    public Response serve(IHTTPSession session) {

        String uri = session.getUri();

        if (uri.startsWith("/usuario")) {
            return usuarioApiControler.handle(session);
        }
        return newFixedLengthResponse("Rota não encontrada");
    }
}
