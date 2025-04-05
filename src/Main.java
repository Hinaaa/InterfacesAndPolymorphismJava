//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();
        MediaCOntroller mediaCOntroller = new MediaCOntroller();
        mediaCOntroller.playMedia(musicPlayer);
        mediaCOntroller.playMedia(videoPlayer); //passing musiuc and video player object in playmedia function by media controller

    }
}