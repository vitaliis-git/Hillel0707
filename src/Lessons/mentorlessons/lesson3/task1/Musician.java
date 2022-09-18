package Lessons.mentorlessons.lesson3.task1;

public class Musician {

    protected String musicianName;

    public void play() {
        System.out.println(this.musicianName + " Play on any instrument");
    }

    public Musician(String musicianName) {
        this.musicianName = musicianName;
    }
}
