public class App {
    public static void main(String[] args) throws Exception {
        
        Banda banda = new Banda("Linkin Park", "Rock");
        Empresario empresario = new Empresario("Roberto", 2112312421421L);

        //instanciando os membros da banda
        Membro membro1 = new Membro("Mike Shinoda", "vocalista");
        Membro membro2 = new Membro("Brad Delson", "guitarrista principal");
        Membro membro3 = new Membro("Rob Bourdon", "baterista");
        Membro membro4 = new Membro("Dave Phoenix Farrell", "baixista");
        Membro membro5 = new Membro("Joe Hahnull", "DJ");
        Membro membro6 = new Membro("Chester Bennington", "vocalista principal");

        //instanciando músicas da banda
        Musica musicas1 = new Musica("In the end", 3.36);
        Musica musicas2 = new Musica("Numb", 3.05);
        Musica musicas3 = new Musica("What I've done", 3.25);
        Musica musicas4 = new Musica("Faint", 2.42);
        Musica musicas5 = new Musica("One Step Closer", 2.37);
        Musica musicas6 = new Musica("Lost", 3.19);

        banda.addnovoMembro(membro1);
        banda.addnovoMembro(membro2);
        banda.addnovoMembro(membro3);
        banda.addnovoMembro(membro4);
        banda.addnovoMembro(membro5);
        banda.addnovoMembro(membro6);

        System.out.println();
        banda.addMusica(musicas1);
        banda.addMusica(musicas2);
        banda.addMusica(musicas3);
        banda.addMusica(musicas4);
        banda.addMusica(musicas5);
        banda.addMusica(musicas6);

        System.out.println();
        banda.mostraInfo();

    }
}
