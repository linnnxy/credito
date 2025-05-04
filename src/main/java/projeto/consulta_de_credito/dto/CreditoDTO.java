package projeto.consulta_de_credito.dto;

public class CreditoDTO {
    private String numeroCredito;
    private String numeroNfse;
    private Double valor;

    public CreditoDTO() {
    }

    public CreditoDTO(String numeroCredito, String numeroNfse, Double valor) {
        this.numeroCredito = numeroCredito;
        this.numeroNfse = numeroNfse;
        this.valor = valor;
    }

    public String getNumeroCredito() {
        return numeroCredito;
    }

    public void setNumeroCredito(String numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public String getNumeroNfse() {
        return numeroNfse;
    }

    public void setNumeroNfse(String numeroNfse) {
        this.numeroNfse = numeroNfse;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
