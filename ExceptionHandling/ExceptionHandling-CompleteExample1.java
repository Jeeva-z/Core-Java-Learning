package org.java;

public class Main {
    static long balance = 10000;
        public static void main(String[] args) {
        try {
           transferFunds(20000);
        }
        catch(Exception e){
            System.out.println("Unknown Exception");
        }
        finally{
            System.out.println("Close Bank Services");
        }
    }

    static void transferFunds(int funds){
            try {
                if(funds > balance) {
                    InsufficientFunds();
                    throw new TransferException("Transfer Failed due to insufficient funds");
                }
                else{
                    balance -= funds;
                    System.out.println("Funds Transferred Successfully");
                }
            } catch (InsufficientException | TransferException e) {
                System.out.println("Transfer Exception : " + e.getMessage());
            }
    }

    static void InsufficientFunds() throws InsufficientException{
        try {
            throw new InsufficientException();
        }
        catch (InsufficientException e){
            System.out.println("Insufficient Exception : Insufficient Funds");
        }

    }
}

