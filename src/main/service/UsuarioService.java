
@Service
public class UsuarioService {

    private final NotificacaoService notificacaoService;

    public UsuarioService(NotificacaoService notificacaoService) {
        this.notificacaoService = notificacaoService;
    }

    public void cadastrarUsuario() {
        try {
            // Lógica de cadastro

            notificacaoService.sucesso(
                    "Usuário cadastrado com sucesso!"
            );

        } catch (Exception e) {
            notificacaoService.erro(
                    "Erro ao cadastrar usuário."
            );
        }
    }
}
