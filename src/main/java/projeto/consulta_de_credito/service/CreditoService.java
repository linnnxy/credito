package projeto.consulta_de_credito.service;

import org.springframework.stereotype.Service;
import projeto.consulta_de_credito.model.Credito;
import projeto.consulta_de_credito.repository.CreditoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CreditoService {

    private final CreditoRepository creditoRepository;

    public CreditoService(CreditoRepository creditoRepository) {
        this.creditoRepository = creditoRepository;
    }

    // Buscar créditos pelo número da NFS-e
    public List<Credito> buscarPorNumeroNfse(String numeroNfse) {
        return creditoRepository.findByNumeroNfse(numeroNfse);
    }

    // Buscar crédito pelo número do crédito
    public Optional<Credito> buscarPorNumeroCredito(String numeroCredito) {
        // Certifique-se de que o método no repositório retorna um Optional<Credito>
        return creditoRepository.findByNumeroCredito(numeroCredito);
    }

    // Salvar um novo crédito
    public Credito salvarCredito(Credito credito) {
        return creditoRepository.save(credito);
    }

    // Atualizar um crédito existente
    public Optional<Credito> atualizarCredito(Long id, Credito creditoAtualizado) {
        return creditoRepository.findById(id).map(credito -> {
            credito.setNumeroCredito(creditoAtualizado.getNumeroCredito());
            credito.setNumeroNfse(creditoAtualizado.getNumeroNfse());
            credito.setDataConstituicao(creditoAtualizado.getDataConstituicao());
            credito.setValorIssqn(creditoAtualizado.getValorIssqn());
            credito.setTipoCredito(creditoAtualizado.getTipoCredito());
            credito.setSimplesNacional(creditoAtualizado.isSimplesNacional());
            credito.setAliquota(creditoAtualizado.getAliquota());
            credito.setValorFaturado(creditoAtualizado.getValorFaturado());
            credito.setValorDeducao(creditoAtualizado.getValorDeducao());
            credito.setBaseCalculo(creditoAtualizado.getBaseCalculo());
            return creditoRepository.save(credito);
        });
    }

    // Deletar um crédito pelo ID
    public boolean deletarCredito(Long id) {
        if (creditoRepository.existsById(id)) {
            creditoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
