package com.jrsimo.di;

public class DiscoTest {

    public static void main(String[] args) {
        ListaMultimedia lista = new ListaMultimedia(20);
        Disco disco;
        
        lista.add(new Disco("A Night At The Opera", "Queen", Formato.MP3, 4411, Genero.ROCK));
        lista.add(new Disco("Rolling Stones", "Aftermath", Formato.DVD, 4231, Genero.ROCK));

        lista.add(new Disco("L�grimas de amor", "Camela", Formato.CDAUDIO, 50, Genero.FLAMENCO));
        System.out.println(lista.toString());
        disco = new Disco("As� Me Gusta A M�", "Chimo Bayo", null, 0, null);

    }

}