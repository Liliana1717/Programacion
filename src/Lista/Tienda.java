package Lista;

import java.time.LocalDate;
import java.util.*;

public class Tienda {
    private final List<VideoJuego> inventario = new ArrayList<>();
    private final List<Cliente> clientes = new ArrayList<>();
    private final List<Venta> ventas = new ArrayList<>();

    public void addVideojuego(VideoJuego v) {
        inventario.add(v);
    }

    public void mostrarInventario() {
        inventario.forEach(System.out::println);
    }

    public VideoJuego buscarVideojuego(String titulo) {
        for (VideoJuego v : inventario) {
            if (v.getTitulo().equalsIgnoreCase(titulo)) {
                return v;
            }
        }
        return null;
    }

    public VideoJuego buscarVideojuego(UUID id) {
        for (VideoJuego v : inventario) {
            if (v.getId().equals(id)) {
                return v;
            }
        }
        return null;
    }

    public int consultarStock(String titulo) {
        VideoJuego v = buscarVideojuego(titulo);
        return v != null ? v.getStock() : -1;
    }

    public Cliente buscarCliente(String texto) {
        for (Cliente c : clientes) {
            if (c.getNombre().equalsIgnoreCase(texto) ||
                    c.getApellido().equalsIgnoreCase(texto) ||
                    c.getEmail().equalsIgnoreCase(texto)) {
                return c;
            }
        }
        return null;
    }

    public Cliente buscarCliente(int id) {
        for (Cliente c : clientes) {
            if (c.getCodigo() == id) return c;
        }
        return null;
    }


    public void registrarVenta(Cliente cliente, List<VideoJuego> juegos) {
        for (VideoJuego v : juegos) {
            if (v.getStock() > 0) {
                v.setStock(1);
            } else {
                System.out.println("Sin stock: " + v.getTitulo());
                return;
            }
        }
        ventas.add(new Venta(cliente, juegos));
    }


    public void mostrarVentas() {
        ventas.forEach(v -> {
            System.out.println(v.getFecha() + " - " + v.getCliente());
        });
    }


    public void ventasPorFecha(LocalDate fecha) {
        ventas.stream()
                .filter(v -> v.getFecha().equals(fecha))
                .forEach(v -> System.out.println(v.getCliente()));
    }

    public void ventasPorPlataforma() {
        Map<String, Integer> mapa = new HashMap<>();

        for (Venta v : ventas) {
            for (VideoJuego juego : v.getVideoJuegos()) {
                mapa.put(juego.getPlataforma(),
                        mapa.getOrDefault(juego.getPlataforma(), 0) + 1);
            }
        }

        mapa.forEach((k, val) -> System.out.println(k + ": " + val));
    }

    public void ventasPorGenero() {
        Map<String, Integer> mapa = new HashMap<>();

        for (Venta v : ventas) {
            for (VideoJuego juego : v.getVideoJuegos()) {
                mapa.put(juego.getGenero(),
                        mapa.getOrDefault(juego.getGenero(), 0) + 1);
            }
        }

        mapa.forEach((k, val) -> System.out.println(k + ": " + val));
    }

    public void masVendido() {
        Map<String, Integer> mapa = new HashMap<>();

        for (Venta v : ventas) {
            for (VideoJuego juego : v.getVideoJuegos()) {
                mapa.put(juego.getTitulo(),
                        mapa.getOrDefault(juego.getTitulo(), 0) + 1);
            }
        }

        String top = Collections.max(mapa.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Más vendido: " + top);
    }

    public void mejorDia() {
        Map<LocalDate, Integer> mapa = new HashMap<>();

        for (Venta v : ventas) {
            mapa.put(v.getFecha(),
                    mapa.getOrDefault(v.getFecha(), 0) + v.getVideoJuegos().size());
        }

        LocalDate mejor = Collections.max(mapa.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Mejor día: " + mejor);
    }

}


