package com.jrsimo.di;

public class ListaMultimediaTest {

    public static void main(String[] args) {

        ListaMultimedia lista = new ListaMultimedia(10);
        Pelicula pelicula;
        int posicion;
        
        lista.add(new Pelicula("Star Wars IV: Una nueva esperanza", "George Lucas", Formato.AVI, 121, "Mark Hamill",
                "Carrie Fisher"));
        lista.add(new Pelicula("Blader Runner", "Ridley Scott", Formato.AVI, 117, "Harrison Ford", "Sean Young"));
        lista.add(new Pelicula("Gattaca", "Andrew Niccol", Formato.AVI, 106, "Ethan Hawke", null));

        System.out.println(lista.toString());

    }

}