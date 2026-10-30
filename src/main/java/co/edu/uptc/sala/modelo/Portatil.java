package co.edu.uptc.sala.modelo;

/** Un portatil de la sala de sistemas. */
public class Portatil {

    private String codigo;
    private String marca;
    private EstadoPortatil estado;   // PUNTO 1 · cree el enum EstadoPortatil

    /** Un portatil nuevo siempre empieza DISPONIBLE. */
    public Portatil(String codigo, String marca) {
        this(codigo, marca, EstadoPortatil.DISPONIBLE);
    }

    /** Para reconstruirlo desde el archivo, con el estado que tenia. */
    public Portatil(String codigo, String marca, EstadoPortatil estado){

        if (codigo == null || codigo.isBlank()) {
            throw new DatoInvalidoException("El código no puede ir vacio.");             
        }
        if (marca == null || marca.isBlank()){
            throw new DatoInvalidoException("La marca no puede ir vacia.");
            
        }

        // PUNTO 2 · Si el codigo o la marca vienen vacios, lance DatoInvalidoException.
        this.codigo = codigo;
        this.marca = marca;
        this.estado = estado;
    }

    public String getCodigo()         { return codigo; }
    public String getMarca()          { return marca; }
    public EstadoPortatil getEstado() { return estado; }

    // Solo se presta uno DISPONIBLE. 
    
    public void prestar() throws EstadoInvalidoexception{
        if (estado == EstadoPortatil.DISPONIBLE){
             estado = EstadoPortatil.PRESTADO;            
        }

        throw new EstadoInvalidoexception(codigo, estado, codigo);
        // PUNTO 2 · Si no esta DISPONIBLE, lance EstadoInvalidoException (accion "prestar").
        
    }

    /** Solo se devuelve uno PRESTADO. */
    public void devolver() {
        // PUNTO 2 · Si no esta PRESTADO, lance EstadoInvalidoException (accion "devolver").
        estado = EstadoPortatil.DISPONIBLE;
    }

    @Override
    public String toString() {
        return codigo + " | " + marca + " | " + estado.getTexto();
    }
}
