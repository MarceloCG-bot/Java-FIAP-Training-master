package br.com.fiap.entify;

public interface autenticavel {
        String MSG_LOGOUT = "Saindo";

        boolean login(String usuario, String senha);

        void logou();
}
