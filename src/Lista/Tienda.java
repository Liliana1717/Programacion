package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Tienda {

        private List<VideoJuego> inventario = new ArrayList<>();
        private List<Cliente> clientes = new ArrayList<>();
        private List<Venta> ventas = new ArrayList<>();
        public void añadirJuego(){
            for (VideoJuego v : inventario){
                System.out.println(v);
            }
        }
   public VideoJuego BuscarPorId(UUID id){
            for (VideoJuego v : inventario){
                if (v.getId().equals(id)){
                    return v;
                }

            }
            return null;
   }
   public VideoJuego buscarPorTitulo (String titulo){
            for (VideoJuego v : inventario){
                if (v.getTitulo().equalsIgnoreCase(titulo)){
                    return v;
                }
            }
            return null;
   }

     public void buscarStock(String titulo){
            VideoJuego v = buscarPorTitulo(titulo);
            if (v != null){
                System.out.println("stock disponible" + v.getStock());
            }
            else {
                System.out.println("");
            }

     }




}
