package Classwork_17.Classwork_17.BankAccount.model;

public class BankAppl {




        public static void main(String[] args) {

            BankAccount account001 = new BankAccount(101L, "John Smith", "Bank#1", 1, 100);
            account001.display();

// to string
            System.out.println(account001);

            BankAccount account002= new BankAccount(102l, "Pit Brosnan","Bank1",1);
            account002.display();

            BankAccount account003 = new BankAccount(103l,"Bank1",1,30000000);
            account003.display();

            account001.deposit(500);
            account001.display();
            account002.deposit(300);
            account002.display();
            System.out.println("----------------------------");
            account001.withdraw(500);
            account001.display();
            account001.withdraw(200);
            account001.display();
        }





    }
