import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import mockito.BancoService;
import mockito.Conta;
import mockito.ContaRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class BancoServiceTest {


    @Test
    public void testConsultarSaldo() {
            // Criando mock do repositório
            ContaRepository contaRepository;
            BancoService bc = new BancoService(contaRepository);
            


        // Criando conta simulada
        Conta conta = new Conta("1234", 10.8);
        




        // Definindo comportamento do mock


        // Criando serviço com o mock


        // Testando consulta de saldo
          double resultado =   when(bc.consultarSaldo(conta.getNumero())).thenReturn(conta.getSaldo());


        // Verificando se o saldo está correto
        assertEquals(10.8, resultado);
        // Verificando se o método buscarConta foi chamado
    }


    @Test
    public void testDepositar() {
        // Criando mock do repositório

            ContaRepository contaRepository;
            BancoService bc = new BancoService(contaRepository);

        // Criando conta simulada

        Conta conta = new Conta("1234", 10);

        // Definindo comportamento do mock


        // Criando serviço com o mock


        // Executando depósito

          when(bc.depositar(conta.getNumero(), 9));
          double resultado =   when(bc.consultarSaldo(conta.getNumero())).thenReturn(conta.getSaldo() + 9.0);

        assertEquals(19.0, resultado);
        // Verificando se o saldo foi atualizado


        // Verificando se os métodos foram chamados corretamente
    }

   // Verificando se os métodos foram chamados corretamente
    
}
