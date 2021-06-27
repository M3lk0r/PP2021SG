package pp2021sg;

public class Main {

    public static void main(String[] args) {
        Login login = Login.getInstance();
        System.out.println(login);
        Login login2 = Login.getInstance();
        System.out.println(login2);
    }
}
