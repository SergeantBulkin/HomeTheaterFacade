public class HomeTheaterTestDrive
{
    public static void main(String[] args) 
    {
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, screen, popper);
        homeTheater.watchMovie("Edge of tommorow");
        homeTheater.endMovie();
    }
}