package projeto.consulta_de_credito.repository;

import projeto.consulta_de_credito.model.Credito;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CreditoRepository extends JpaRepository<Credito, Long> {

    // Buscar crédito pelo número da NFS-e
    List<Credito> findByNumeroNfse(String numeroNfse);

    // Buscar crédito pelo número do crédito
    Credito findByNumeroCredito(String numeroCredito);
}
