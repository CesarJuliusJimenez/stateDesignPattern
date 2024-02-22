public class ActiveState implements AccountState{

    @Override
    public void deposit(Account account, double depositAmount) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("Amount of " + depositAmount + " has been deposited. Current Balance is " + account.getBalance());
    }

    @Override
    public void withdraw(Account account, double withdrawAmount) {
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println("Withdrawing " + withdrawAmount + ". Current Balance is " + account.getBalance());
    }

    @Override
    public void activateState(Account account) {
        account.setAccountState(new ActiveState());
        System.out.println("Account is already activated!");
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
