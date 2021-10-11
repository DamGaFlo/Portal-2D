package co.edu.escuelaing.arsw.portal2d.service;

public class MapaNotFoundException extends Exception{

    public MapaNotFoundException(String message) {
        super(message);
    }

    public MapaNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public MapaNotFoundException() {

    }
}