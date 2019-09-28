package cgLib;

public class ProxyTest {
    public static void main(String[] args) {
        CgLibProxy cgLibProxy = new CgLibProxy();

        PlayGame playGame= (PlayGame) cgLibProxy.newInstall(new PlayGame());
        playGame.play();
    }
}
