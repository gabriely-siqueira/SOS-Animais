package DTO;

/**
 * 
 * @author Gabriely
 */
public class UserDTO {
    private int id_admin;
    private String admin, password;

    // Default constructor
    public UserDTO() {
    }

    // Parameterized constructor
    public UserDTO(int id_admin, String admin, String password) {
        this.id_admin = id_admin;
        this.admin = admin;
        this.password = password;
    }

    // Getter and Setter methods

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    // Securely get the password
    public char[] getPassword() {
        return password.toCharArray();
    }

    // Set the password securely
    public void setPassword(String password) {
        this.password = password;
    }

    // Override toString for a human-readable representation
    @Override
    public String toString() {
        return "UserDTO{" +
                "id_admin=" + id_admin +
                ", admin='" + admin + '\'' +
                ", password='" + "********" + '\'' + // Masking the password for security
                '}';
    }
}
