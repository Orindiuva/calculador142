import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.iterasys.Main;

public class TesteCalculadora {
    
    
    @Test
    public void testeSomar(){
        //AAA - Arrange-preparar/ Act=agir / Assert-confirmar
        //CEV - Configura / Excecuta / Valida

        //Configura
        float num1 = 10;
        float num2 = 8; 

        //Dados de saída - resultado esperado
        float resultadoEsperado = 18; 

        //Executar
        float resultadoAtual = Main.somar(num1, num2);

        //Valida
        assertEquals(resultadoEsperado, resultadoAtual);        
    }

    @Test
    public void testeSubtrair(){
        //Configura
        float num1 = 20;
        float num2 = 2; 

        //Dados
        float resultadoEsperado = 18.0f; 

        //Executa 
        float resultadoAtual = Main.subtrair(num1, num2);

        //Valida
        assertEquals(resultadoEsperado, resultadoAtual);

    }

    @Test
    public void testeMultiplicar(){
        //Configura
        float num1 = 20;
        float num2 = 2; 

        //Dados
        float resultadoEsperado = 40; 

        //Executa 
        float resultadoAtual = Main.multiplicacao(num1, num2);

        //Valida
        assertEquals(resultadoEsperado, resultadoAtual);

    }   
    
    @Test
    public void testeDividir(){
        //Configura
        int num1 = 27;
        int num2 = 3; 

        //Dados
        String resultadoEsperado = "9"; 

        //Executa 
        String resultadoAtual = Main.diviDirTry(num1, num2);

        //Valida
        assertEquals(resultadoEsperado, resultadoAtual);

    }    

    @Test
    public void testeDividirZero(){
        //Configura
        int num1 = 27;
        int num2 = 0; 

        //Dados
        String resultadoEsperado = "Não é possível divisão por zero!"; 

        //Executa 
        String resultadoAtual = Main.diviDirTry(num1, num2);

        //Valida
        assertEquals(resultadoEsperado, resultadoAtual);

    }   

    @ParameterizedTest
    @CsvSource(value = {
        "15, 25, 40.0",
        "0, 12, 12.0", 
        "-5, 9, 4.0", 
        "-7, -8, -15.0", 
        "0.5, 3.7, 4.2"
    }, delimiter = ',')
    public void testeSomar(float num1, float num2, float resultadoEsperado ){
        //Executar
        float resultadoAtual = Main.somar(num1, num2);
        //Valida
        assertEquals(resultadoEsperado, resultadoAtual);        
    }


}
