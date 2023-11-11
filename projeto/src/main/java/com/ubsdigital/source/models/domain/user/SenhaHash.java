package com.ubsdigital.source.models.domain.user;

import org.jetbrains.annotations.NotNull;
import org.mindrot.jbcrypt.BCrypt;

public class SenhaHash {

    public static @NotNull String hashSenha(String senha) {
        String salt = BCrypt.gensalt();

        return BCrypt.hashpw(senha, salt);
    }

    public static boolean verificarSenha(String senha, String hashArmazenado) {
        return BCrypt.checkpw(senha, hashArmazenado);
    }
}