package skytech.bank.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import skytech.bank.model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import skytech.bank.rest.bank.impl.BankRestImpl;
import skytech.bank.validation.BankValidation;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.security.Principal;
import java.util.List;


@Controller
public class BankEntryController {

    @Autowired
    BankRestImpl bankRest;

   @Autowired
   private BankValidation bankValidation;



    @GetMapping("/login")
    public String getApplicationForm(){

        return "loginLogin";

    }
    @GetMapping("/loginError")
    public String error(Model model){
        model.addAttribute("message","wrong user credentails");
        return  "loginLogin";

    }

   @RequestMapping(value = "/register")
    public String getApplicationFor(Model model){
       model.addAttribute("bank",new Bank());
        return "register";
    }

    @PostMapping("/success")
    public String getSuccessForm(@Valid @ModelAttribute Bank bank, BindingResult result) {

        bankValidation.validate(bank,result);
        if (result.hasErrors())
        {
            return "register";
        }
        bank.setRole("ROLE_USER");
        String password= bankRest.encryptPassword(bank.getPassword());
        bank.setPassword(password);
        bankRest.insert(bank);
        return "successFull";
    }

    @GetMapping("/readAll")
    public ModelAndView verify(ModelAndView modelAndView,HttpServletRequest request) {
        HttpSession session=request.getSession();
        session.setAttribute("name","Pravallika");
        System.out.println(session.getId());

            List<Bank> customerList = bankRest.getAll();
            modelAndView.addObject("customerList", customerList);
            modelAndView.setViewName("getDetails");
            return modelAndView;

    }
    @GetMapping("/customer")
    public ModelAndView customerDetails(Principal principal, ModelAndView modelAndView){

        String email=principal.getName();

        Bank bank = bankRest.getByEmail(email);
        modelAndView.addObject("cust",bank);
        modelAndView.setViewName("customerById");
        return modelAndView;


    }

    @GetMapping(value = "/findCustomerById/{customerId}")
    public ModelAndView getCustomerById(@PathVariable int customerId, ModelAndView modelAndView,HttpServletRequest request)
    {
      HttpSession session=request.getSession();
      String name= (String) session.getAttribute("name");
        System.out.println(name);
        System.out.println(session.getId());

        Bank bank=bankRest.getById(customerId);
        modelAndView.addObject("cust",bank);
        modelAndView.setViewName("customerById");
        return modelAndView;
    }

    @GetMapping(value = "/editBank/{customerId}")
    public ModelAndView update(@PathVariable int customerId, ModelAndView modelAndView)
    {
       Bank bank=bankRest.getById(customerId);
        modelAndView.addObject("bank",bank);
        modelAndView.setViewName("update");
        return modelAndView;
    }

    @PostMapping("/editBank/updateCustomerDetails")
    public ModelAndView updateDetails(@ModelAttribute Bank bank,ModelAndView modelAndView,HttpServletRequest request){
        HttpSession session=request.getSession();
        bankRest.update(bank);
        modelAndView.setViewName("updateSuccess");
        return modelAndView;
    }

    @GetMapping(value = "/deleteBank/{customerId}")
    public ModelAndView getById(@PathVariable int customerId, ModelAndView modelAndView)
    {
        int bank=bankRest. delete(customerId);
        modelAndView.addObject(bank);
        modelAndView.setViewName("delete");
        return modelAndView;
    }
}


















































// if(session.getAttribute("name").equals("Pravallika")){
//            modelAndView.setViewName("redirect:/readAll");
//            return modelAndView;
//        }
//
//    String password= bankRest.encryptPassword(bank.getPassword());
//        bank.setPassword(password);