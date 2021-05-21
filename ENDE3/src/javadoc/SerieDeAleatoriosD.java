package javadoc;

import java.util.ArrayList;

import java.util.Random;

 
public class SerieDeAleatoriosD {

 

    //Campos de la clase

    private ArrayList<Integer> serieAleatoria;



    public SerieDeAleatoriosD (int numeroItems) {

        serieAleatoria = new ArrayList<Integer> ();

        for (int i=0; i<numeroItems; i++) {  serieAleatoria.add(0);  }

        System.out.println ("Serie inicializada. El número de elementos en la serie es: " + getNumeroItems() );

    } //Cierre del constructor



    public int getNumeroItems() { return serieAleatoria.size(); }



    public void generarSerieDeAleatorios () {

        Random numAleatorio;

        numAleatorio = new Random ();

        for (int i=0; i < serieAleatoria.size(); i++) { serieAleatoria.set(i, numAleatorio.nextInt(1000) ); }

        System.out.print ("Serie generada! ");

    } //Cierre del método

} //Cierre de la clase y del ejemplo aprenderaprogramar.com