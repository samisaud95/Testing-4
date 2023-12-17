//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console -Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data1= OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String date1String = data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        System.out.println("Data1 :"  +" "+ date1String);

    }
    public static String formatoFull(ZonedDateTime date){
        return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

    }
}