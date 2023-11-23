import java.util.Scanner;

import Exceptions.NomeRepetidoException;
import Exceptions.NotaInsuficienteException;

public class App {

    public static void main(String[] args) throws Exception {

        Fetin fetin = new Fetin();
        Scanner in = new Scanner(System.in);
        boolean sair = true; // flag para sair do looping

        while (sair) {

            try {

                System.out.println("Digite o nome do projeto ou 'continuar' para sair: ");
                String nomedoProjeto = in.nextLine();

                if (nomedoProjeto.equalsIgnoreCase("sair")) {
                    sair = false;
                    continue; // pula pro próximo looping
                }

                System.out.println("Digite a nota do projeto: ");
                Double nota = in.nextDouble();
                in.nextLine(); // aqui precisa gerenciar a quebra de linha para que eu possa fazer a entrada de
                               // dados da String

                fetin.adicionaProjeto(nomedoProjeto, nota); // método que adiciona o projeto no HashMap

                System.out.println(); // pula uma linha
            }

            catch (NotaInsuficienteException e) {
                System.out.println(e.getMessage());
                System.out.println();
            } catch (NomeRepetidoException e) {
                System.out.println(e.getMessage());
                System.out.println();
            }

        }

        fetin.mostraInfo();

    }
}
