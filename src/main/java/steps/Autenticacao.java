package steps;

public class Autenticacao {
    private String usuario;
    private String senha;

    public void cadastrarUsuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean fazerLogin(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }

}
