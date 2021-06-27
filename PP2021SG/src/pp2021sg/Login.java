package pp2021sg;

public class Login {

    private static Login login;

    private Login() {
    }

    public static synchronized Login getInstance() {
        if (login == null) {
            return new Login();
        }

        return login;
    }
}
