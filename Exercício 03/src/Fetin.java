import java.util.HashMap;
import java.util.Map;

import Exceptions.NomeRepetidoException;
import Exceptions.NotaInsuficienteException;

public class Fetin {
    Map<String, Double> projetos = new HashMap<>();

    public void adicionaProjeto(String nome, double nota) throws NotaInsuficienteException {

        String nomeNormalizado = nome.trim();
        if (projetos.containsKey(nomeNormalizado)) {
            throw new NomeRepetidoException("Nome repetido!");
        }
        if (nota < 60) {
            throw new NotaInsuficienteException("Nota insuficiente!");
        }
        projetos.put(nome, nota);

        System.out.println("Projeto cadastrado com sucesso!");
    }

    public Fetin() {
        this.projetos = new HashMap<>();
    }

    public void mostraInfo() {
        projetos.forEach((chave, valor) -> {
            System.out.println("Nome do projeto: " + chave);
            System.out.println("Nota do projeto: " + valor);
            System.out.println();
        });
    }

}
