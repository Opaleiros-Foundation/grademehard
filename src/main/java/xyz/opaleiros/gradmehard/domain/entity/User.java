package xyz.opaleiros.gradmehard.domain.entity;

public class User {

    private String id;
    private String name;
    private String email;
    private String password;

    public User(
            String id,
            String name,
            String email,
            String password
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public boolean isValidEmail() {
        return email.contains("@");
    }
}