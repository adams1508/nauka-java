package main.lessons.returningObjectsHowBad;

public class ErrorInfo {
    public String[] mgsm = {
            "Błąd wejśćia",
            "Błąd wyjśćia",
            "Dysk pełny",
            "Indeks spoza dozwolonego zakresu"
    };

    public int[] howBad = {3, 3, 2, 4};

    public Err getErrorInfo(int i){
        if (i>=0 & i< mgsm.length){
            return new Err(mgsm[i], howBad[i]);
        }else return new Err("Niepoprawny kod błędu", 0);
    }
}
