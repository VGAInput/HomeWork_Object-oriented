package HomeWork_1;

import javax.security.auth.login.FailedLoginException;

public class User {

    public static void checkLogin(String login) throws FailedLoginException {
        if (!login.matches("\\w+") || login.length() < 1 || login.length() > 20){
            throw   new FailedLoginException();
        };
    };
    public static void checkPassword(String password,String confirmPassword) throws FailedLoginException {
        if (!password.matches("\\w+") || password.length() < 1 || password.length() > 20
         || !password.equals(confirmPassword)){
            throw   new FailedLoginException();
        };
    }

    public void checkLoginAndPassword(String login,String password, String confirmPassword)  {
            try {
                checkLogin(login);
                checkPassword(password,confirmPassword);
            } catch (FailedLoginException e) {
                System.out.println("Nepoladka!");
            }
        }
    }




