public class App {
    public static void main(String[] args) throws Exception 
    {
        RedeSocial[] socialmedia = new RedeSocial[10];

        Usuário usuário = new Usuário("Gustavo", "gustavo.gr697.gm@gmail.com");
        
        Facebook facebook = new Facebook("12345", 2000);
        GooglePlus googlePlus = new GooglePlus("3245", 209);
        Twitter twitter = new Twitter("2910*", 500);
        Instagram instagram = new Instagram("9875", 149);

        socialmedia[0] = facebook;
        socialmedia[1] = googlePlus;
        socialmedia[2] = twitter;
        socialmedia[3] = instagram;
        usuário.Usuario(socialmedia);
    }
}