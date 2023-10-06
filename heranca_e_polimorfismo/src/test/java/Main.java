public class Main 
{
    public static void main(String[] args) 
    {
        Brownie bc = new BrownieCafe("Brownie de Café", 10, "Café");
        Brownie bn = new BrownieNutella("Brownie de Nutella", 15, "Nutella");
        Brownie bdl = new BrownieDocedeLeite("Brownie de DOce de Leite", 7, "Doce de leite");

        bn.addCarrinhodeCompras(bn);
        bc.addCarrinhodeCompras(bc);
        bdl.addCarrinhodeCompras(bdl);
    }   
}
