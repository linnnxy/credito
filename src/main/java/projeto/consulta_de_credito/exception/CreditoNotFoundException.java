package projeto.consulta_de_credito.exception;

public class CreditoNotFoundException extends RuntimeException {
    public CreditoNotFoundException(String mensagem) {
        super(mensagem);
    }
}
