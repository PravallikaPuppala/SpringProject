package skytech.bank.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import skytech.bank.model.AirLines;
import skytech.bank.rest.airLines.AirLinesRest;

import java.util.List;

@Controller
public class AirLinesRestController {
    @Autowired
    AirLinesRest airLines;

    @ResponseBody
    @GetMapping("/getAirLines")
    public List<AirLines> getAllDetails() {
        List<AirLines> airLinesList = airLines.airLines();

        return airLinesList;
    }

    @ResponseBody
    @GetMapping("/getAirLines/{id}")
    public AirLines getAllDetailsById(@PathVariable int id) {
        AirLines airLinesList = airLines.airLinesById(id);

        return airLinesList;
    }

}
