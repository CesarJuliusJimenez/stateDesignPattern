public interface AccountState {

    void deposit(Account account, double depositAmount);
    void withdraw(Account account, double withdrawAmount);
    void activateState(Account account);
    void suspendState(Account account);
    void closeState(Account account);


}
