package bank;

import java.util.Scanner;

public class ATM {
    public static void main(String[] Args){

        Bank javaBank = new Bank();
        Scanner console = new Scanner(System.in);
        String action;

            do {
                System.out.print("Vuoi prelevare, depositare, o vedere il saldo (preleva-deposita-saldo-esci)?: ");
                action = console.nextLine();

                if (action.equalsIgnoreCase("preleva")) {
                    javaBank.take();
                    System.out.println("\n");

                } else if (action.equalsIgnoreCase("deposita")) {
                    javaBank.deposit();
                    System.out.println("\n");

                } else if (action.equalsIgnoreCase("saldo")) {
                    System.out.println(javaBank.toString()+"\n");

                } else if (action.equalsIgnoreCase("esci")){
                    System.out.println("Grazie per aver scelto Java Bank!");
                } else {
                    System.out.println("COMANDO NON RICONOSCIUTO \n");
                }

            } while (!action.equalsIgnoreCase("esci"));

    }
}
