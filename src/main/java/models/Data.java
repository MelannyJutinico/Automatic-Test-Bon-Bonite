package models;

public class Data {
    private String  cedula;
    private String email;
    private String password;

    public Data(String cedula, String email, String password) {
        this.cedula = cedula;
        this.email = email;
        this.password = password;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
