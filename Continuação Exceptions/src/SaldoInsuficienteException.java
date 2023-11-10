public class SaldoInsuficienteException extends Exception // exception e checked, RUntimeException é unchecked
{
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
