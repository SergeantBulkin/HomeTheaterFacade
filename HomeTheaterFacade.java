public class HomeTheaterFacade
{
    Amplifier amp;
    DVDPlayer dvd;
    Projector projector;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, Projector projector, Screen screen, PopcornPopper popper)
    {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie)
    {
        popper.on();
        popper.pop();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd();
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
        System.out.println("\n");
    }

    public void endMovie()
    {
        popper.off();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.off();
    }
}