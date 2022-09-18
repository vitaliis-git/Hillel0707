package Lessons.mentorlessons.lesson3.task1;

class Guitarist extends Musician{
    public Guitarist(String musicianName) {
        super(musicianName);
    }
    @Override
    public void play() {
        System.out.println(this.musicianName + " Play on Guitar");
    }
}
