import java.util.List;
public class Bibliotecario {
    private String nombreBibliotecario;
    private String rutBiliotecario;
    private String fonoBibliotecario;
    private List<Bibliotecario> bibliotecarios;

    public Bibliotecario(String nombreBibliotecario,
                         String rutBiliotecario, String fonoBibliotecario){
        this.nombreBibliotecario = nombreBibliotecario;
        this.rutBiliotecario = rutBiliotecario;
        this.fonoBibliotecario = fonoBibliotecario;
    }

    public String getNombreBibliotecario() {
        return nombreBibliotecario;
    }

    public void setNombreBibliotecario(String nombreBibliotecario) {
        this.nombreBibliotecario = nombreBibliotecario;
    }

    public String getRutBiliotecario() {
        return rutBiliotecario;
    }

    public void setRutBiliotecario(String rutBiliotecario) {
        this.rutBiliotecario = rutBiliotecario;
    }

    public String getFonoBibliotecario() {
        return fonoBibliotecario;
    }

    public void setFonoBibliotecario(String fonoBibliotecario) {
        this.fonoBibliotecario = fonoBibliotecario;
    }

    public void setBibliotecarios(List<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

}
