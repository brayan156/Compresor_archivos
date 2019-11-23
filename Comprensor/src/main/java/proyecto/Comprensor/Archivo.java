package proyecto.Comprensor;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

public class Archivo {
    //Nombre,descripción,fechadecreación,últimaactualizaciónyusuarioquelocrea.
        @Id
        @NotNull
        private String nombre;

        private String descripcion;
        private String fecha;
        private String lastfecha;
        private String usuario;
        private String datos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLastfecha() {
        return lastfecha;
    }

    public void setLastfecha(String lastfecha) {
        this.lastfecha = lastfecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public Archivo(@NotNull String nombre, String descripcion, String fecha, String lastfecha, String usuario, String datos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.lastfecha = lastfecha;
        this.usuario = usuario;
        this.datos = datos;
    }

}
