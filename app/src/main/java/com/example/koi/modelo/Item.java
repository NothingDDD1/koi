package com.example.koi.modelo;

public class Item {

        private String nombre;
        private int precio;
        private int cantidad;
        private boolean disponibilidad;
        private static final boolean DISPONIBLE=true;


    public static final Item[] items={
            new Item("Ocean Bomb White Grape", 1500,10 ),
            new Item("Ocean Bomb Cucumber", 1500, 15),
            new Item("Ocean Bomb Orange", 1500, 8),
            new Item("Ocean Bomb Peach", 1500, 5),
            new Item("Cherry Blossom", 1300, 30),
            new Item("Chupa Chups Frutilla", 1200, 5),
            new Item("Chupa Chups Uva", 1200, 7),
            new Item("Chupa Chups Naranja", 1200, 10 ),
            new Item("Samyang Queso Picante", 2500, 5),
            new Item("Samyang Carbonara Picante", 2500, 20),
            new Item("Jjajang Ramen", 2350, 3),
            new Item("Ramen de verduras", 2000, 7),
            new Item("Ramen de verduras Picante", 2350, 0),
            new Item("Ramen de Mariscos Picante", 2500, 15)

    };

    public Item(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.disponibilidad = DISPONIBLE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
        public String toString() {

            String agotado;
            if(disponibilidad) agotado="Disponible";
            else agotado="Agotado";
            return nombre + ": " + agotado;
        }
}
