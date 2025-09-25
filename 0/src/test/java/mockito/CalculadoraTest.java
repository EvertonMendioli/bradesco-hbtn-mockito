package test.java.mockito;

import main.java.mockito.Calculadora;
import main.java.mockito.ServicoMatematicoImpl;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
public class CalculadoraTest {

    @Test
    void testeSoma(){
             
      
        ServicoMatematicoImpl servicoMatematicoImpl = new ServicoMatematicoImpl();
        when(servicoMatematicoImpl.somar(2, 3).thenReturn(5);

        Calculadora resultado =  new Calculadora();
        assertEquals(5, resultado.executar(Mockito.anyInt(), Mockito.anyInt()));


    }

}
