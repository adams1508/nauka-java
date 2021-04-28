package main.tasks;

public class Z019email {
    public static void main(String[] args) {
        String email = "jack.strong@motleycrue.com";
        String ch = "chuj123";
        String email2 = "adam.s1508@op.pl";

        System.out.println(cenzure(email));
        System.out.println(cenzure(email2));
        System.out.println("aaa " + cenzureJarka(email));
        System.out.println(cenzureJarka(ch));
    }


    public static String cenzure(String username) {
        char[] usernameArray = username.toCharArray();
        for (int i = 1; i < usernameArray.length; i++) {
            if (usernameArray[i] == '.') {
                usernameArray[i] = '.';
            } else if (usernameArray[i - 1] == '.') {
                usernameArray[i] = usernameArray[i];
            } else if (usernameArray[i] == '@') {
                usernameArray[i] = '@';
                break;
            } else usernameArray[i] = '*';
        }
        return new String(usernameArray);
    }

    public static String cenzureJarka(String username) {
        if(!username.contains("@")) {
            return username;
        }

        char[] usernameArray = username.toCharArray();
        for (int i = 1; i < usernameArray.length; i++) {
            boolean isCurrentCharacterADot = usernameArray[i] == '.';
            boolean isPreviousCharacterADot = usernameArray[i-1] == '.';
            if(!isCurrentCharacterADot && !isPreviousCharacterADot) {
                usernameArray[i] = '*';
            }
        }

        return new String(usernameArray);
    }
}
