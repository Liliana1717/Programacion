package Lista;
import java.time.LocalDate;
import java.util.List;


public class Venta {

    private  Cliente cliente;
    private List<VideoJuego> videoJuegos;
    private LocalDate fecha;

    public Venta(Cliente cliente, List<VideoJuego> videoJuegos) {
        this.cliente = cliente;
        this.videoJuegos = videoJuegos;
        this.fecha = LocalDate.now();


    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<VideoJuego> getVideoJuegos() {
        return videoJuegos;
    }

    public void setVideoJuegos(List<VideoJuego> videoJuegos) {
        this.videoJuegos = videoJuegos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String ToString(){
        String lista = "";
        for (VideoJuego v : videoJuegos){
            lista+= v.getTitulo() + "|";
        }
        return "fecha " + fecha +
                "|Cliente" + cliente+
                "|juegos" + lista;
    }
}
