public class App {
    public static void main(String[] args) throws Exception {
        
        Cachorro cachorro = new Cachorro("Tobby", 100);
        Lontra lontra = new Lontra("Amélia", 50);
        Boi boi = new Boi("Roberto", 200);

        cachorro.emitirSom();
        cachorro.mostraInfo();

        System.out.println();

        lontra.emitirSom();
        lontra.nadar();
        lontra.mostraInfo();

        System.out.println();

        boi.emitirSom();
        boi.mostraInfo();
    }
}
