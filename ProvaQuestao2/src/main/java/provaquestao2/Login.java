
package provaquestao2;

import java.util.Scanner;

public class Login {
    
    public void run() {

        String logId = "admin";
        String passId = "admin";

        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("Insira o ID");
        String inpUser = keyboard.nextLine();
        System.out.println("Insira a senha");
        String inpPass = keyboard.nextLine();

        if (inpUser.equals(logId) && inpPass.equals(passId)) {
            System.out.print("Logado");
        } else {
            System.out.print("Aqui não vacilão");
        }
    }
}