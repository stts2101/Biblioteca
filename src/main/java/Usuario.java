import java.util.List;

public class Usuario {
    private String nombreUsuario;
    private String rutUsuario;
    private String fonoUsuario;
    private List<Usuario> usuarios;


    public Usuario(String nombreUsuario, String rutUsuario, String fonoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.rutUsuario = rutUsuario;
        this.fonoUsuario = fonoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String getRutUsuario() {
        return rutUsuario;
    }
    public String getFonoUsuario() {
        return fonoUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setRutUsuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }

    public void setFonoUsuario(String fonoUsuario) {
        this.fonoUsuario = fonoUsuario;
    }
}
