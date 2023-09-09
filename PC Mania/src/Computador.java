public class Computador {
    String marca;
    float preco;
    MemoriaUSB memoriausb; //associação
    SistemaOperacional sistemaoperacional; //associação
    HardwareBasico hardwarebasico;//associação

    public void mostraPCConfigs()
    {
        System.out.println("Marca do computador: " + marca);
        System.out.println("Preço do computador: R$" + preco);
    }

    public void addMemoriaUSB(MemoriaUSB musb) //adicionando memória usb no array
    {
        memoriausb = musb; //adicionando memória usb
    }

    public Computador()
    {
        sistemaoperacional = new SistemaOperacional(); //composição
        hardwarebasico = new HardwareBasico(); //composição
    }
}
