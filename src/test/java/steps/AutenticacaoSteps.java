package steps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;

public class AutenticacaoSteps {

    private Autenticacao autenticacao;
    private boolean acesso;

    @Dado("que o usuário {string} com senha {string} está cadastrado")
    public void cadastrar_usuario(String usuario, String senha) {
        autenticacao = new Autenticacao();
        autenticacao.cadastrarUsuario(usuario, senha);
    }

    @Quando("eu faço login com {string} e {string}")
    public void fazer_login(String usuario, String senha) {
        acesso = autenticacao.fazerLogin(usuario, senha);
    }

    @Então("o acesso é concedido")
    public void verificar_acesso_concedido() {
        assertTrue(acesso);
    }

    @Então("o acesso não foi concedido")
    public void verificar_acesso_negado() {
        assertFalse(acesso);
    }


}