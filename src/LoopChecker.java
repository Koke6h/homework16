public class LoopChecker implements Checker {

    @Override
    public void check(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        checkLength(login, true);
        checkLength(password, false);
        checkCharacters(login, true);
        checkCharacters(password, false);
        checkPassword(password, confirmPassword);
    }

    private void checkCharacters(String s, boolean login) throws WrongLoginException, WrongPasswordException {
        if (s == null) {
            throwException(login, "null");
        }
        char[] chars = s.toCharArray();
        for (char Ch : chars) {
            String validCharacters = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890_ ";
            if (!validCharacters.contains(Character.toString(Ch))) {
                continue;
            }
            throwException(login, "Неккоректный символ");
        }
    }

    private void checkLength(String s,boolean login) throws WrongLoginException, WrongPasswordException {
        if (s != null && s.length() <= 20) {
           return;
        }
        throwException(login, "Неккоректная длина");
    }


}
