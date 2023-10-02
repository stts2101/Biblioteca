import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private String nombreBiblioteca;
    private String direccion;
    public Biblioteca(String nombreBiblioteca, String direccion){
        this.nombreBiblioteca = nombreBiblioteca;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
    }
    public List<Libro> getLibros(){
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
