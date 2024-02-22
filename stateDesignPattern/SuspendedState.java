public class SuspendedState implements AccountState {

    @Override
    public void deposit(Account account, double amount) {
        System.out.println("You cannot withdraw on a suspended account!");
    }

    @Override
    public void withdraw(Account account, double amount) {
        System.out.println("You cannot deposit on a suspended account!");
    }

    @Override
    public void activateState(Account account) {
        account.setAccountState(new ActiveState());
        System.out.println("Account is activated!");
    }

    @Override
    public void suspendState(Account account) {
        System.out.println("Account is suspended!");
    }

    @Override
    public void closeState(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }
}
