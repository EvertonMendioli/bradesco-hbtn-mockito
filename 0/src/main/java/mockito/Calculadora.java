package main.java.mockito;

public class Calculadora {


    

 

    public int executar(int a, int b) {
       
        ServicoMatematicoImpl servicoMatematico= new ServicoMatematicoImpl();
        return servicoMatematico.somar(a, b);
        
}

    



}
