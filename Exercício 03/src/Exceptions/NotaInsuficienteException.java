package Exceptions;

public class NotaInsuficienteException extends Exception // checked
{
    public NotaInsuficienteException(String message) {
        super(message);
    }
}
