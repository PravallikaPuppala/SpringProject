package skytech.bank.rest.airLines;

import skytech.bank.model.AirLines;

import java.util.List;

public interface AirLinesRest {
    /**
     *
     * @return
     */
    public List<AirLines> airLines();
    public AirLines airLinesById(int id);
}
