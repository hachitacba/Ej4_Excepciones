/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Aldo
 */
public class ExcepcionControlVector extends Exception{
    private int codigo;
    public ExcepcionControlVector(int codEr){
        codigo=codEr;
        
    }
    public String getMessage()
    {
        String mensaje="Error en el manejo del vector";
        switch(codigo)
        {
            case 1: mensaje="Error por tamaño incorrecto del vector";
            break;
            
            case 2: mensaje="Error por intentar acceder a una posicion no válida";
            break;
            
            case 3: mensaje="Debe ingresar un nro entero";
            break;
            
            default: mensaje="Otro error en el manejo de vector";
                    
        }
        return mensaje;
    }
}
