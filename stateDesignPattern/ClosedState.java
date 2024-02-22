public class ClosedState implements AccountState {

    @Override
    public void deposit(Account account, double amount) {
        System.out.println("You cannot deposit on a closed account!");
    }

    @Override
    public void withdraw(Account account, double amount) {
        System.out.println("You cannot withdraw on a closed account!");
    }

    @Override
    public void activateState(Account account) {
        System.out.println("You cannot activate a closed account");
    }

    @Override
    public void suspendState(Account account) {
        System.out.println("You cannot suspend a closed account");
    }

    @Override
    public void closeState(Account account) {
        System.out.println("Account is closed!");
    }
}
