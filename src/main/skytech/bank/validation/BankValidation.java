package skytech.bank.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import skytech.bank.model.Bank;

public class BankValidation implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Bank.class.isAssignableFrom(clazz);
   }

    @Override
    public void validate(Object object, Errors errors) {
        Bank bank = (Bank) object;
        ValidationUtils.rejectIfEmpty(errors, "accountType", "Bank.accountName.empty", "Account type should be fill");
//        ValidationUtils.rejectIfEmpty(errors, "PhoneNo", "Bank.PhoneNo.empty");
        ValidationUtils.rejectIfEmpty(errors, "address", "Bank.address.empty", "enter the address");
//        ValidationUtils.rejectIfEmpty(errors, "aadhaarNo", "Bank.aadhaarNo.matches");
        String PhoneNo = bank.getPhoneNo();
        if (!PhoneNo.matches("^[0-9]{10}$")) {
            errors.rejectValue("PhoneNo", "Bank.PhoneNo.matches");
        }
        String aadhaarNo  = bank.getAadhaarNo();
        if (!aadhaarNo.matches("^[0-9]{12}$")) {
            errors.rejectValue("aadhaarNo", "Bank.aadhaarNo.matches");
        }
    }
}
