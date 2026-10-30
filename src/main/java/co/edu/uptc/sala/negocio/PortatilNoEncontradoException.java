package co.edu.uptc.sala.negocio;

public class PortatilNoEncontradoException extends Exception {

     public PortatilNoEncontradoException(String codigo) {
        super("No hay ninguna suscripcion con el codifo " + codigo + ".");
    }
    
}
