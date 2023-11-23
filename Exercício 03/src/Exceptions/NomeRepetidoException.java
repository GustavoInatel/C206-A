package Exceptions;

public class NomeRepetidoException extends RuntimeException // unchecked
{
    public NomeRepetidoException(String message) {
        super(message);
    }
}