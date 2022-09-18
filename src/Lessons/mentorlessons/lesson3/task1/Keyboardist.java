package Lessons.mentorlessons.lesson3.task1;

class Keyboardist extends Musician{
    public Keyboardist(String musicianName) {
        super(musicianName);
    }
    @Override
    public void play() {
        System.out.println(this.musicianName + " Play on Keyboard");
    }
}
