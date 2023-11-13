import java.util.Scanner;
public class Libro {
    private String nombreLibro;
    private String autorLibro;
    private String editorial;
    public Libro(String nombreLibro, String autorLibro, String editorial){
        this.nombreLibro = nombreLibro;
        this.autorLibro = autorLibro;
        this.editorial = editorial;
    }
    public String getNombreLibro(){
        return nombreLibro;
    }
    public String getAutorLibro(){
        return  autorLibro;
    }
    public String getEditorial(){
        return editorial;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

}
