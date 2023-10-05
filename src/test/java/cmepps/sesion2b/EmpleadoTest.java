/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cmepps.sesion2b;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author chris
 */
public class EmpleadoTest {
    
    public EmpleadoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculoNominaBruta method, of class Empleado.
     */
    @Test
    public void testCalculoNominaBrutaEncargado() {
        System.out.println("calculoNominaBrutaEncargado");
        Empleado.TipoEmpleado tipo = Empleado.TipoEmpleado.Encargado;
        float ventasMes = 0.0F;
        float horasExtras = 0.0F;
        Empleado instance = new Empleado();
        float expResult = 2500F;
        float result = instance.calculoNominaBruta(tipo, ventasMes, horasExtras);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of calculoNominaBruta method, of class Empleado.
     */
    @Test
    public void testCalculoNominaBrutaVendedor() {
        System.out.println("calculoNominaBrutaVendedor");
        Empleado.TipoEmpleado tipo = Empleado.TipoEmpleado.Vendedor;
        float ventasMes = 0.0F;
        float horasExtras = 0.0F;
        Empleado instance = new Empleado();
        float expResult = 2000F;
        float result = instance.calculoNominaBruta(tipo, ventasMes, horasExtras);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of calculoNominaBruta method, of class Empleado.
     */
    @Test
    public void testCalculoNominaBrutaOtros() {
        System.out.println("calculoNominaBrutaOtros");
        Empleado.TipoEmpleado tipo = null;
        float ventasMes = 0.0F;
        float horasExtras = 0.0F;
        Empleado instance = new Empleado();
        float expResult = 0.0f;
        float result = instance.calculoNominaBruta(tipo, ventasMes, horasExtras);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of calculoNominaBruta method, of class Empleado.
     */
    @Test
    public void testCalculoNominaBrutaVentasMesNegativa() {
        System.out.println("calculoNominaBrutaVentaMesNegativa");
        Empleado.TipoEmpleado tipo = Empleado.TipoEmpleado.Vendedor;
        float ventasMes = -50;
        float horasExtras = 0.0F;
        Empleado instance = new Empleado();
        float expResult = 2000F;
        float result = instance.calculoNominaBruta(tipo, ventasMes, horasExtras);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of calculoNominaBruta method, of class Empleado.
     */
    @Test
    public void testCalculoNominaBrutaVentasMesMenor1000() {
        System.out.println("calculoNominaBrutaVentasMesMenor1000");
        Empleado.TipoEmpleado tipo = Empleado.TipoEmpleado.Vendedor;
        float ventasMes = 500F;
        float horasExtras = 0.0F;
        Empleado instance = new Empleado();
        float expResult = 2000F;
        float result = instance.calculoNominaBruta(tipo, ventasMes, horasExtras);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of calculoNominaBruta method, of class Empleado.
     */
    @Test
    public void testCalculoNominaBrutaVentasMesEntre1000y1500() {
        System.out.println("calculoNominaBrutaVentasMesEntre1000y1500");
        Empleado.TipoEmpleado tipo = Empleado.TipoEmpleado.Vendedor;
        float ventasMes = 1300F;
        float horasExtras = 0.0F;
        Empleado instance = new Empleado();
        float expResult = 2100F;
        float result = instance.calculoNominaBruta(tipo, ventasMes, horasExtras);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of calculoNominaBruta method, of class Empleado.
     */
    @Test
    public void testCalculoNominaBrutaVentasMesMayor1500() {
        System.out.println("calculoNominaBrutaVentasMesMayores1500");
        Empleado.TipoEmpleado tipo = Empleado.TipoEmpleado.Vendedor;
        float ventasMes = 2000F;
        float horasExtras = 0.0F;
        Empleado instance = new Empleado();
        float expResult = 2200F;
        float result = instance.calculoNominaBruta(tipo, ventasMes, horasExtras);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of calculoNominaBruta method, of class Empleado.
     */
    @Test
    public void testCalculoNominaBrutaVentasHorasExtrasPositivas() {
        System.out.println("calculoNominaBrutaVentasHorasExtrasPositivas");
        Empleado.TipoEmpleado tipo = Empleado.TipoEmpleado.Vendedor;
        float ventasMes = 0.0F;
        float horasExtras = 10F;
        Empleado instance = new Empleado();
        float expResult = 2300F;
        float result = instance.calculoNominaBruta(tipo, ventasMes, horasExtras);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of calculoNominaBruta method, of class Empleado.
     */
    @Test
    public void testCalculoNominaBrutaVentasHorasExtrasNegativas() {
        System.out.println("calculoNominaBrutaVentasHorasExtrasNegativas");
        Empleado.TipoEmpleado tipo = Empleado.TipoEmpleado.Vendedor;
        float ventasMes = 0.0F;
        float horasExtras = -30F;
        Empleado instance = new Empleado();
        float expResult = 1100F;
        float result = instance.calculoNominaBruta(tipo, ventasMes, horasExtras);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculoNominaNeta method, of class Empleado.
     */
    @Test
    public void testCalculoNominaNetaNegativa() {
        System.out.println("calculoNominaNetaNegativa");
        float nominaBruta = -2000F;
        Empleado instance = new Empleado();
        float expResult = -2000F;
        float result = instance.calculoNominaNeta(nominaBruta);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of calculoNominaNeta method, of class Empleado.
     */
    @Test
    public void testCalculoNominaNetaMenos2100() {
        System.out.println("calculoNominaNetaMenos2100");
        float nominaBruta = 2000F;
        Empleado instance = new Empleado();
        float expResult = 2000F;
        float result = instance.calculoNominaNeta(nominaBruta);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of calculoNominaNeta method, of class Empleado.
     */
    @Test
    public void testCalculoNominaNetaEntre2100y2500() {
        System.out.println("calculoNominaNetaEntre2100y2500");
        float nominaBruta = 2300F;
        Empleado instance = new Empleado();
        float expResult = 1955F;
        float result = instance.calculoNominaNeta(nominaBruta);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of calculoNominaNeta method, of class Empleado.
     */
    @Test
    public void testCalculoNominaNetaMayor2500() {
        System.out.println("calculoNominaNetaMayor2500");
        float nominaBruta = 3000F;
        Empleado instance = new Empleado();
        float expResult = 2460F;
        float result = instance.calculoNominaNeta(nominaBruta);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
