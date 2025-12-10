package playMp3;

import javazoom.jl.player.Player;
import java.io.FileInputStream;

public class PlayMP3 {
    public static void main(String[] args) {
        try {

            FileInputStream file = new FileInputStream("C://Users//rafar//Desktop" +
                    "//meusProjetos//arquivosDeAudio//no-copyright-music-382074.mp3");

            // Cria o player e toca
            Player player = new Player(file);
            System.out.println("Tocando música...");
            player.play();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
