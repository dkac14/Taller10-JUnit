package calculatorsmp;

import calculatorsmp.Operations;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OperationsTest {

    
    @Test
    @DisplayName("Prueba para la operación de suma")
    void testSolveSuma() {
        String formula = "3+5";
        String resultadoEsperado = "3+5=8";
        String resultado = Operations.Solve(formula);
        assertEquals(resultadoEsperado, resultado, "La suma no se resolvió correctamente.");
    }

    
    @Test
    @DisplayName("Prueba para la operación de resta")
    void testSolveResta() {
        String formula = "10-4";
        String resultadoEsperado = "10-4=6";
        String resultado = Operations.Solve(formula);
        assertEquals(resultadoEsperado, resultado, "La resta no se resolvió correctamente.");
    }

   
    @Test
    @DisplayName("Prueba para la operación de multiplicación")
    void testSolveMultiplicacion() {
        String formula = "6*7";
        String resultadoEsperado = "6*7=42";
        String resultado = Operations.Solve(formula);
        assertEquals(resultadoEsperado, resultado, "La multiplicación no se resolvió correctamente.");
    }

    
    @Test
    @DisplayName("Prueba para la operación de división")
    void testSolveDivision() {
        String formula = "8/2";
        String resultadoEsperado = "8/2=4";
        String resultado = Operations.Solve(formula);
        assertEquals(resultadoEsperado, resultado, "La división no se resolvió correctamente.");
    }

    
    @Test
    @DisplayName("Prueba para operaciones con jerarquía")
    void testSolveJerarquía() {
        String formula = "3+2*4";
        String resultadoEsperado = "3+2*4=11";
        String resultado = Operations.Solve(formula);
        assertEquals(resultadoEsperado, resultado, "La precedencia de operaciones no se respetó.");
    }

    
    @Test
    @DisplayName("Prueba para operaciones con más de un operador")
    void testSolveMultipleOperadores() {
        String formula = "2+3*4-5"; 
        String resultadoEsperado = "2+3*4-5=9";
        String resultado = Operations.Solve(formula);
        assertEquals(resultadoEsperado, resultado, "La operación con múltiples operadores no se resolvió correctamente.");
    }
    
   

    
    

}
