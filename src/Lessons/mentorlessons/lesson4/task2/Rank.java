package Lessons.mentorlessons.lesson4.task2;

public enum Rank {
    SIX("шесть"),
    SEVEN("семь"),
    EIGHT("восемь"),
    NINE("девять"),
    TEN("десять"),
    JACK("валет"),
    QUEEN("дама"),
    KING("король"),
    ACE("туз");

    private String translation;


    Rank(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }


    @Override
    public String toString() {
        return "переклад = " + translation;
    }

}
