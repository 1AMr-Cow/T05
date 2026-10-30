package co.edu.uptc.sala.modelo;

public class EstadoInvalidoexception extends Exception{

    public EstadoInvalidoexception(String codigo, EstadoPortatil estado, String accion){

        super("No se puede " + accion + " el portatil " + codigo + ": esta " + estado.getTexto().toLowerCase() + ".");
    }
    
}
