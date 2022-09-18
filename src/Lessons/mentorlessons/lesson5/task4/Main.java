package Lessons.mentorlessons.lesson5.task4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final String regex = "(\\d{2}+.){2}+\\d{4}";
        final String string = "ЖИЗНЬ\\nВ Днепре хотят перекрыть движение транспорта на косе на Красном Камне\\nСоздано 03.04.2021\\n\\n\" +\n"
                + "                \"В Днепре планируют перекрыть движение по косе в Новокодакском районе города, на жилмассиве Красный Камень. \" +\n"
                + "                \"Для ограничения движения там хотят установить шлагбаум.\\n\\nЗапретить собираются движение транспорта на \" +\n"
                + "                \"рекреационной территории косы в направлении острова Горелого на основании письма инспекции по вопросам \" +\n"
                + "                \"благоустройства горсовета от 18 марта 2021 года.";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}