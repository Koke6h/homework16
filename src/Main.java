public class Main {
    public static void main(String[] args) {
        String login = "serzhanovd";
        String password = "Daniil1234";
        String confirmPassword = "Daniil1234";
        AuthService.validate(login, password, confirmPassword );
        boolean success = AuthService.validate(login, password, confirmPassword);
        if (success) {
            System.out.println("Проверка пройдена успешно");
        } else {
            System.out.println("Проверка не пройдена");
        }
    }
}