package entities;

import java.text.SimpleDateFormat;
import java.util.*;

public class DataUtil {
    // Static - siginifica que pode ser usado sem precisar instanciar uma classe.
    // Muito util para fazer formatações pois não armazena valor

    public static String converterDate(Date data) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY HH:mm");
        return formatador.format(data);

    }

}
