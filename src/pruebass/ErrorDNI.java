package pruebass;

public class ErrorDNI extends RuntimeException{
    
    public ErrorDNI(String dni) {
        super("El DNI " + dni + " introducido es incorrecto");
    }
}
