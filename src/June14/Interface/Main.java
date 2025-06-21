package June14.Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one of the options : ");
        System.out.println("Press 1 for Audio Players ");
        System.out.println("Press 2 for video players");
        int choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Choose one of the options :");
            System.out.println("1. Spotify");
            System.out.println("2. Youtube Music");
            System.out.println("3. MxPlayer");
            System.out.println("4. VlC Media" );
            int choice2 = scanner.nextInt();
            if (choice2 == 1){
                MediaPlayer media = new Spotify();
                media.play();
                media.forward();
                media.pause();
                media.rewind();
                media.stop();
                media.speed();
            }
            else if (choice2 == 2){
                MediaPlayer media = new YoutubeMusic();
                media.play();
                media.forward();
                media.pause();
                media.rewind();
                media.stop();
                media.speed();
            }
            else if (choice2 == 3){
                MediaPlayer media = new MxPlayer();
                media.play();
                media.forward();
                media.pause();
                media.rewind();
                media.stop();
                media.speed();
            } else if (choice2==3) {
                MediaPlayer media = new VlcMediaPlayer();
                media.play();
                media.forward();
                media.pause();
                media.rewind();
                media.stop();
                media.speed();

            }
        }
    }
}
