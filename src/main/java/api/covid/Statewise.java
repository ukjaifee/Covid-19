
package api.covid;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Statewise {

    private String active;
    private String confirmed;
    private String deaths;
    private String deltaconfirmed;
    private String deltadeaths;
    private String deltarecovered;
    private String lastupdatedtime;
    private String migratedother;
    private String recovered;
    private String state;
    private String statecode;
    private String statenotes;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Statewise() {
    }

    /**
     * 
     * @param statenotes
     * @param recovered
     * @param deltadeaths
     * @param migratedother
     * @param deltarecovered
     * @param active
     * @param deltaconfirmed
     * @param state
     * @param statecode
     * @param confirmed
     * @param deaths
     * @param lastupdatedtime
     */
    public Statewise(String active, String confirmed, String deaths, String deltaconfirmed, String deltadeaths, String deltarecovered, String lastupdatedtime, String migratedother, String recovered, String state, String statecode, String statenotes) {
        super();
        this.active = active;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.deltaconfirmed = deltaconfirmed;
        this.deltadeaths = deltadeaths;
        this.deltarecovered = deltarecovered;
        this.lastupdatedtime = lastupdatedtime;
        this.migratedother = migratedother;
        this.recovered = recovered;
        this.state = state;
        this.statecode = statecode;
        this.statenotes = statenotes;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getDeltaconfirmed() {
        return deltaconfirmed;
    }

    public void setDeltaconfirmed(String deltaconfirmed) {
        this.deltaconfirmed = deltaconfirmed;
    }

    public String getDeltadeaths() {
        return deltadeaths;
    }

    public void setDeltadeaths(String deltadeaths) {
        this.deltadeaths = deltadeaths;
    }

    public String getDeltarecovered() {
        return deltarecovered;
    }

    public void setDeltarecovered(String deltarecovered) {
        this.deltarecovered = deltarecovered;
    }

    public String getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(String lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public String getMigratedother() {
        return migratedother;
    }

    public void setMigratedother(String migratedother) {
        this.migratedother = migratedother;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatecode() {
        return statecode;
    }

    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    public String getStatenotes() {
        return statenotes;
    }

    public void setStatenotes(String statenotes) {
        this.statenotes = statenotes;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("active", active).append("confirmed", confirmed).append("deaths", deaths).append("deltaconfirmed", deltaconfirmed).append("deltadeaths", deltadeaths).append("deltarecovered", deltarecovered).append("lastupdatedtime", lastupdatedtime).append("migratedother", migratedother).append("recovered", recovered).append("state", state).append("statecode", statecode).append("statenotes", statenotes).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deltadeaths).append(deltarecovered).append(active).append(deltaconfirmed).append(statecode).append(confirmed).append(statenotes).append(recovered).append(migratedother).append(state).append(additionalProperties).append(deaths).append(lastupdatedtime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Statewise) == false) {
            return false;
        }
        Statewise rhs = ((Statewise) other);
        return new EqualsBuilder().append(deltadeaths, rhs.deltadeaths).append(deltarecovered, rhs.deltarecovered).append(active, rhs.active).append(deltaconfirmed, rhs.deltaconfirmed).append(statecode, rhs.statecode).append(confirmed, rhs.confirmed).append(statenotes, rhs.statenotes).append(recovered, rhs.recovered).append(migratedother, rhs.migratedother).append(state, rhs.state).append(additionalProperties, rhs.additionalProperties).append(deaths, rhs.deaths).append(lastupdatedtime, rhs.lastupdatedtime).isEquals();
    }

}
