/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital1;

/**
 *
 * @author Gabriely
 *
 */
public class Data {
   public boolean userValidation(String user, String password) {
    System.out.println("Usuario: " + user + ", Senha: " + password);
    boolean isValid = user.equals("admin") && password.trim().equals("123");
    System.out.println("Validação: " + isValid);
    return isValid;
}}
