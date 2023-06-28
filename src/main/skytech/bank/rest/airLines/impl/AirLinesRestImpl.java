package skytech.bank.rest.airLines.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import skytech.bank.model.AirLines;
import skytech.bank.rest.airLines.AirLinesRest;

import java.util.List;

public class AirLinesRestImpl implements AirLinesRest {
    @Autowired
    private RestTemplate restTemplate;

    private static final String getDetails="https://api.instantwebtools.net/v1/airlines";
    @Override
    public List<AirLines> airLines() {
        List<AirLines> airLines=getRestTemplate().getForObject(getDetails,List.class);
        return airLines;
    }

    @Override
    public AirLines airLinesById(int id) {
        AirLines airLines=getRestTemplate().getForObject(getDetails+"/"+id,AirLines.class);
        return airLines;
    }
    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


}
