abstract class Bank {

    abstract void interestRate();

    void bankName() {
        System.out.println("This is ABC Bank");
    }

    public static void main(String[] args) {

        SBI s = new SBI();

        s.bankName();
        s.interestRate();
    }
}

class SBI extends Bank {

    @Override
    void interestRate() {
        System.out.println("Interest Rate: 7%");
    }
}