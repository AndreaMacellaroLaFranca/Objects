package bank;

import java.util.Scanner;

public class Bank {

    public int balance;
    public int amount;

    public void take(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto vuoi prelevare?: ");
        amount = sc.nextInt();
        if (amount>balance){
            System.out.printf("Non puoi prelevare $%d, hai $%d sul tuo conto.",amount,balance);
        } else {
            balance -= amount;
        }
    }

    public void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto vuoi depositare?: ");
        amount = sc.nextInt();
        balance += amount;
    }

    public String toString(){
        return String.format("Il tuo saldo è di: $%d", balance);
    }
}
