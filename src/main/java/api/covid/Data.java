
package api.covid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

    private List<CasesTimeSeries> casesTimeSeries = new ArrayList<CasesTimeSeries>();
    private List<Statewise> statewise = new ArrayList<Statewise>();
    private List<Tested> tested = new ArrayList<Tested>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param tested
     * @param statewise
     * @param casesTimeSeries
     */
    public Data(List<CasesTimeSeries> casesTimeSeries, List<Statewise> statewise, List<Tested> tested) {
        super();
        this.casesTimeSeries = casesTimeSeries;
        this.statewise = statewise;
        this.tested = tested;
    }

    public List<CasesTimeSeries> getCasesTimeSeries() {
        return casesTimeSeries;
    }

    public void setCasesTimeSeries(List<CasesTimeSeries> casesTimeSeries) {
        this.casesTimeSeries = casesTimeSeries;
    }

    public List<Statewise> getStatewise() {
        return statewise;
    }

    public void setStatewise(List<Statewise> statewise) {
        this.statewise = statewise;
    }

    public List<Tested> getTested() {
        return tested;
    }

    public void setTested(List<Tested> tested) {
        this.tested = tested;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("casesTimeSeries", casesTimeSeries).append("statewise", statewise).append("tested", tested).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(statewise).append(tested).append(casesTimeSeries).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(statewise, rhs.statewise).append(tested, rhs.tested).append(casesTimeSeries, rhs.casesTimeSeries).isEquals();
    }

}
