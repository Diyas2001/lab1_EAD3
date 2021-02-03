package org.example;

import java.util.ArrayList;
import java.util.List;

public class AccountList {
    List<Accounts> accountList;
    public AccountList() {
        accountList = new ArrayList<Accounts>();
    }
    public void Add(Accounts accounts) {
        accountList.add(accounts);
    }
    public void Remove(Accounts accounts) {
        accountList.remove(accounts);
    }
    public List<Accounts> getAccountList() {
        return accountList;
    }
}
