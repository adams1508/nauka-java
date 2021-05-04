package main.lessons.returningObjects;

public class ErrorMsg {
    String[] msgs = {
            "Błąd wejśćia",
            "Błąd wyjśćia",
            "Dysk pełny",
            "Indeks spoza dozwolonego  zakresu"
    };

    public String getErrorMsg(int i) {
        if (i >= 0 & i < msgs.length) {
            return msgs[i];
        } else return "Niepoprawny kod błędu";
    }
}
