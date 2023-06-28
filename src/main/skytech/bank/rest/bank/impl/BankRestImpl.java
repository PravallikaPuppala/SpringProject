package skytech.bank.rest.bank.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import skytech.bank.model.Bank;
import skytech.bank.rest.bank.BankRest;

import java.util.List;

@Component
public class BankRestImpl implements BankRest {

    public final String url="http://localhost:8080/SpringMvcBindingResult_war";



    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<Bank> getAll() {
        return restTemplate.getForObject(url+"/getAll",List.class);
    }

    @Override
    public Bank getByEmail(String email){
        return restTemplate.getForObject(url+"/get/"+email,Bank.class);
    }

    @Override
    public int update(Bank bank){
        try{
            System.out.println(bank);
            restTemplate.put(url+"/update",bank);
            return 1;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insert(Bank bank){
        return restTemplate.postForObject(url+"/insert",bank,Integer.class);
    }

    @Override
    public int delete(int id){
        try{
            restTemplate.delete(url+"/delete/"+id);
            return 1;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
    @Override
    public String encryptPassword(String password){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashPassword= passwordEncoder.encode(password);
        return hashPassword;
    }

    @Override
    public Bank getById(int id){
        return restTemplate.getForObject(url+"/getById/"+id,Bank.class);
    }

}
