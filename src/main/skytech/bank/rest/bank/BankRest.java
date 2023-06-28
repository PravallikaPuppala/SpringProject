package skytech.bank.rest.bank;

import skytech.bank.model.Bank;

import java.util.List;

public interface BankRest {


    public List<Bank> getAll();
    public Bank getById(int id);
    public Bank getByEmail(String email);
    public int update(Bank bank);
    public int insert(Bank bank);
    public int delete(int id);
    public String encryptPassword(String password);

}
