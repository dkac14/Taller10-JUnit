package calculatorsmp;

import calculatorsmp.Operations;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OperationsTest {

    @Test
    @DisplayName("Test de solve simple (valores iguales)")
    public void testSolve() {
        String formula = "3+5*2";
        String resultado = Operations.Solve(formula);
        System.out.println("Resultado: " + resultado);
        assertEquals("3+5*2=0", resultado);
    }

    @Test
    @DisplayName("Test de solve simple 2 (valores distintos)")
    public void testSolve2() {
        String formula = "3+5*2";
        String resultado = Operations.Solve(formula);
        System.out.println("Resultado: " + resultado);
        assertEquals("3+5*2=4", resultado);
    }

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

    @Test
    @DisplayName("Prueba para suma y resta con números negativos")
    void testSolveNumerosNegativos() {
        String formula = "-3+5-7";
        String resultadoEsperado = "-3+5-7=-5";
        String resultado = Operations.Solve(formula);
        assertEquals(resultadoEsperado, resultado, "La suma y resta con números negativos no se resolvió correctamente.");
    }

    @Test
    @DisplayName("Prueba para división por cero")
    void testSolveDivisionPorCero() {
        String formula = "10/0";
        try {
            Operations.Solve(formula);
            fail("Se esperaba una excepción por división por cero");
        } catch (ArithmeticException e) {
            assertEquals("/ by zero", e.getMessage(), "La excepción por división por cero no fue lanzada correctamente.");
        }
    }

    @Test
    @DisplayName("Prueba para múltiples operaciones de igual precedencia")
    void testSolveMultipleOperaciones() {
        String formula = "5+3-2";
        String resultadoEsperado = "5+3-2=6";
        String resultado = Operations.Solve(formula);
        assertEquals(resultadoEsperado, resultado, "La resolución de múltiples operaciones de igual precedencia no es correcta.");
    }

    @Test
    @DisplayName("Prueba para operaciones con multiplicación y división de igual precedencia")
    void testSolveMultiplicationDivision() {
        String formula = "10*2/5";
        String resultadoEsperado = "10*2/5=4";
        String resultado = Operations.Solve(formula);
        assertEquals(resultadoEsperado, resultado, "La resolución de operaciones con multiplicación y división no es correcta.");
    }

    @Test
    @DisplayName("Prueba con números grandes")
    void testSolveNumerosGrandes() {
        String formula = "10000*10000";
        String resultadoEsperado = "10000*10000=100000000";
        String resultado = Operations.Solve(formula);
        assertEquals(resultadoEsperado, resultado, "La operación con números grandes no se resolvió correctamente.");
    }

    @Test
    @DisplayName("Prueba para operaciones complejas")
    void testSolveComplexOperations() {
        String formula = "2+3*5-10/2";
        String resultadoEsperado = "2+3*5-10/2=13";
        String resultado = Operations.Solve(formula);
        assertEquals(resultadoEsperado, resultado, "La operación compleja no se resolvió correctamente.");
    }

    @Test
    @DisplayName("Test de SolveDivision 2, valores que coinciden ")
    public void testSolveDivision2() {
        String formula = "20/4+2";
        String resultado = Operations.Solve(formula);
        System.out.println("Resultado: " + resultado);
        assertEquals("20/4+2=2", resultado);
    }
    package calculatorsmp ;

    import calculatorsmp.Operations ;
    import static org.junit.jupiter.api.Assertions.
    *;
    import org.junit.jupiter.api.DisplayName ;
    import org.junit.jupiter.api.Test ;

    class OperationsTest {

        @Test
        @DisplayName("Test de solve simple (valores iguales)")
        public void testSolve() {
            String formula = "3+5*2";
            String resultado = Operations.Solve(formula);
            System.out.println("Resultado: " + resultado);
            assertEquals("3+5*2=0", resultado);
        }

        @Test
        @DisplayName("Test de solve simple 2 (valores distintos)")
        public void testSolve2() {
            String formula = "3+5*2";
            String resultado = Operations.Solve(formula);
            System.out.println("Resultado: " + resultado);
            assertEquals("3+5*2=4", resultado);
        }

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

        @Test
        @DisplayName("Prueba para suma y resta con números negativos")
        void testSolveNumerosNegativos() {
            String formula = "-3+5-7";
            String resultadoEsperado = "-3+5-7=-5";
            String resultado = Operations.Solve(formula);
            assertEquals(resultadoEsperado, resultado, "La suma y resta con números negativos no se resolvió correctamente.");
        }

        @Test
        @DisplayName("Prueba para división por cero")
        void testSolveDivisionPorCero() {
            String formula = "10/0";
            try {
                Operations.Solve(formula);
                fail("Se esperaba una excepción por división por cero");
            } catch (ArithmeticException e) {
                assertEquals("/ by zero", e.getMessage(), "La excepción por división por cero no fue lanzada correctamente.");
            }
        }

        @Test
        @DisplayName("Prueba para múltiples operaciones de igual precedencia")
        void testSolveMultipleOperaciones() {
            String formula = "5+3-2";
            String resultadoEsperado = "5+3-2=6";
            String resultado = Operations.Solve(formula);
            assertEquals(resultadoEsperado, resultado, "La resolución de múltiples operaciones de igual precedencia no es correcta.");
        }

        @Test
        @DisplayName("Prueba para operaciones con multiplicación y división de igual precedencia")
        void testSolveMultiplicationDivision() {
            String formula = "10*2/5";
            String resultadoEsperado = "10*2/5=4";
            String resultado = Operations.Solve(formula);
            assertEquals(resultadoEsperado, resultado, "La resolución de operaciones con multiplicación y división no es correcta.");
        }

        @Test
        @DisplayName("Prueba con números grandes")
        void testSolveNumerosGrandes() {
            String formula = "10000*10000";
            String resultadoEsperado = "10000*10000=100000000";
            String resultado = Operations.Solve(formula);
            assertEquals(resultadoEsperado, resultado, "La operación con números grandes no se resolvió correctamente.");
        }

        @Test
        @DisplayName("Prueba para operaciones complejas")
        void testSolveComplexOperations() {
            String formula = "2+3*5-10/2";
            String resultadoEsperado = "2+3*5-10/2=13";
            String resultado = Operations.Solve(formula);
            assertEquals(resultadoEsperado, resultado, "La operación compleja no se resolvió correctamente.");
        }

        @Test
        @DisplayName("Test de SolveDivision 2, valores que coinciden ")
        public void testSolveDivision2() {
            String formula = "20/4+2";
            String resultado = Operations.Solve(formula);
            System.out.println("Resultado: " + resultado);
            assertEquals("20/4+2=2", resultado);
        }

    }

}
