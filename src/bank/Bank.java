package bank;

import java.util.Scanner;

public class Bank {

    public int balance;

    public void take(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto vuoi prelevare?: ");
        int amount = sc.nextInt();
        if (amount>balance){
            System.out.printf("Non puoi prelevare $%d, hai $%d sul tuo conto.",amount,balance);
        } else {
            balance -= amount;
        }
    }

    public void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto vuoi depositare?: ");
        int amount = sc.nextInt();
        balance += amount;
    }

    public String toString(){
        return String.format("Il tuo saldo è di: $%d", balance);
    }
}
