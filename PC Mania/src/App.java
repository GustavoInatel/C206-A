import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Computador[] computador =  new Computador[5]; 
        Computador computadores = new Computador();

        Cliente cliente = new Cliente();
        cliente.nome = "Gustavo";
        cliente.cpf = 123456789L;

        Scanner in = new Scanner(System.in);

        int opcao;
        boolean flag = true;

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Bem-vindo ao menu. Para prosseguir, siga as informações abaixo: ");
        System.out.println("Digite 1 para comprar da promoção 1");
        System.out.println("Digite 2 para comprar da promoção 2");
        System.out.println("Digite 3 para comprar da promoção 3");
        System.out.println("Digite 4 para mostrar as informações do cliente, dos PC's comprados e o total de sua compra");
        System.out.println("Digite 5 para sair do menu");
        System.out.println("------------------------------------------------------------------------");
        opcao = in.nextInt();

        while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5)
        {
            System.out.println("Por favor, digite um valor válido!");
            opcao = in.nextInt();
        }

        int i = 0;
        while(flag)
        {
            switch(opcao) 
            {
                case 1:
                    //computador
                    cliente.computador[i] = new Computador(); //criando um novo objeto e atribuindo ao array, usando associação 
                    cliente.computador[i].marca = "Positivo";
                    cliente.computador[i].preco = 2300.00f;

                    //hardware
                    cliente.computador[i].hardwarebasico.nome = "Pentium Core i3 (2200 Mhz)";
                    cliente.computador[i].hardwarebasico.capacidaderam = 8;
                    cliente.computador[i].hardwarebasico.capacidadehd = 500;

                    //sistema operacional
                    cliente.computador[i].sistemaoperacional.nome = "Linux Ubuntu";
                    cliente.computador[i].sistemaoperacional.tipo = 32;

                    //memória USB
                    MemoriaUSB memoria = new MemoriaUSB();//instanciando um objeto para memória usb
                    cliente.computador[i].memoriausb = memoria;  //agregação
                    cliente.computador[i].memoriausb.nome = "Pen-drive";
                    cliente.computador[i].memoriausb.capacidade = 16;
                    cliente.computador[i].addMemoriaUSB(memoria);    
                    
                    System.out.println("Compra da promoção 1 efetuada com sucesso!");
                    i++;
                    break;

                case 2:
                    //computador
                    cliente.computador[i] = computadores;
                    cliente.computador[i].marca = "Acer";
                    cliente.computador[i].preco = 5800.00f;

                    //hardware
                    cliente.computador[i].hardwarebasico.nome = "Pentium Core i5 (3370 Mhz)";
                    cliente.computador[i].hardwarebasico.capacidaderam = 16;
                    cliente.computador[i].hardwarebasico.capacidadehd = 1000; //1Tb = 1000 GB

                    //sistema operacional
                    cliente.computador[i].sistemaoperacional.nome = "Windows 8";
                    cliente.computador[i].sistemaoperacional.tipo = 64;

                    //memória USB
                    MemoriaUSB memoria2 = new MemoriaUSB();//instanciando um objeto para memória usb
                    cliente.computador[i].memoriausb = memoria2;  //agregação
                    cliente.computador[i].memoriausb.nome = "Pen-drive";
                    cliente.computador[i].memoriausb.capacidade = 32;
                    cliente.computador[i].addMemoriaUSB(memoria2);

                    System.out.println("Compra da promoção 2 efetuada com sucesso!");
                    i++;
                    break;

                case 3:
                    
                    //computador
                    cliente.computador[i] = computadores;
                    cliente.computador[i].marca = "Vaio";
                    cliente.computador[i].preco = 1800.00f;

                    //hardware
                    cliente.computador[i].hardwarebasico.nome = "Pentium Core i7 (4500Mhz)";
                    cliente.computador[i].hardwarebasico.capacidaderam = 32;
                    cliente.computador[i].hardwarebasico.capacidadehd = 2000; //sim, 2Tb de HD

                    //sistema operacional
                    cliente.computador[i].sistemaoperacional.nome = "Windows 10";
                    cliente.computador[i].sistemaoperacional.tipo = 64;

                    //memória USB
                    MemoriaUSB memoria3 = new MemoriaUSB();//instanciando um objeto para memória usb
                    cliente.computador[i].memoriausb = memoria3;  //agregação
                    cliente.computador[i].memoriausb.nome = "HD Externo";
                    cliente.computador[i].memoriausb.capacidade = 1000;
                    cliente.computador[i].addMemoriaUSB(memoria3);

                    System.out.println("Compra da promoção 3 efetuada com sucesso!");
                    i++;
                    break;

                case 4:

                    System.out.println("--------------------------------------------");
                    System.out.println("Mostrando as informações do cliente: ");
                    System.out.println();

                    System.out.println("Nome do cliente: " + cliente.nome);
                    System.out.println("CPF do cliente: " + cliente.cpf);

                    
                    for (int j = 0; j < cliente.computador.length; j++) 
                    {
                        if(cliente.computador[j] != null)
                        {
                            System.out.println("--------------------------------------------");
                            System.out.println("Informações do computador: ");
                            System.out.println();
                            cliente.computador[j].mostraPCConfigs();
                            System.out.println("--------------------------------------------");

                            System.out.println("Informações do Hardware: ");
                            System.out.println();
                            System.out.println("Processador: " + cliente.computador[j].hardwarebasico.nome);
                            System.out.println("Memória ram: " + cliente.computador[j].hardwarebasico.capacidaderam + "GB");
                            System.out.println("Memória do HD: " + cliente.computador[j].hardwarebasico.capacidadehd + "GB");
                            System.out.println("--------------------------------------------");

                            System.out.println("Informações do Sistema Operacional: ");
                            System.out.println();
                            System.out.println("Sistema Operacional: " + cliente.computador[j].sistemaoperacional.nome + " (" + cliente.computador[j].sistemaoperacional.tipo + ")");
                            System.out.println("--------------------------------------------");

                            System.out.println("Informações da Memória USB: ");
                            System.out.println();
                            System.out.println("Acompanha " + cliente.computador[j].memoriausb.nome + " de " + cliente.computador[j].memoriausb.capacidade + "GB");
                            System.out.println("--------------------------------------------");
                        }    
                    }

                    System.out.println("O total da compra foi de R$" + cliente.calculaTotalCompra());
                    i++;

                    break;

                case 5:
                    
                    flag = false;
                    System.out.println("Saindo do menu...");
                    System.out.println("--------------------------------------------");
                    i++;
                    break;
            
                default:

                    System.out.println("Digite um valor válido!");
                    opcao = in.nextInt();
                    i++;
                    break;
            }

            if(flag == true)
            {
                System.out.println("Digite 1 para comprar da promoção 1");
                System.out.println("Digite 2 para comprar da promoção 2");
                System.out.println("Digite 3 para comprar da promoção 3");
                System.out.println("Digite 4 para mostrar as informações do cliente, dos PC's comprados e o total de sua compra");
                System.out.println("Digite 5 para sair do menu");
                System.out.println("------------------------------------------------------------------------");
                opcao = in.nextInt();
            }
        }
        
    }
}
