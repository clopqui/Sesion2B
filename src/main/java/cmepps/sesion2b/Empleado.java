/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmepps.sesion2b;

/**
 *
 * @author chris
 */
public class Empleado {
    public enum TipoEmpleado{Vendedor, Encargado}
    
    public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtras){
        float salariobase=0, primas=0, extras=0;
        
        //determinacion salario base
        if(tipo==TipoEmpleado.Encargado){
            salariobase=2500;
        } else if(tipo==TipoEmpleado.Vendedor){
            salariobase=2000;
        }
        
        //determinacion prima
        if(ventasMes>=1500){
            primas = 200;
        } else if (ventasMes>=1000){
            primas = 100;
        }
        
        //determinacion extras
        extras = horasExtras*30;
        
        return salariobase + primas + extras;
    }
    
    public float calculoNominaNeta(float nominaBruta){
        float retencion = 0;
        
        if(nominaBruta>2500){
            retencion=0.18f;
        } else if(nominaBruta>2000){
            retencion=0.15f;
        }
        
        return nominaBruta*(1-retencion);
    }
}
