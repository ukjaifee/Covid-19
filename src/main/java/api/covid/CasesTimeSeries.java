
package api.covid;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CasesTimeSeries {

    private String dailyconfirmed;
    private String dailydeceased;
    private String dailyrecovered;
    private String date;
    private String totalconfirmed;
    private String totaldeceased;
    private String totalrecovered;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CasesTimeSeries() {
    }

    /**
     * 
     * @param date
     * @param dailyrecovered
     * @param totalconfirmed
     * @param totaldeceased
     * @param dailydeceased
     * @param totalrecovered
     * @param dailyconfirmed
     */
    public CasesTimeSeries(String dailyconfirmed, String dailydeceased, String dailyrecovered, String date, String totalconfirmed, String totaldeceased, String totalrecovered) {
        super();
        this.dailyconfirmed = dailyconfirmed;
        this.dailydeceased = dailydeceased;
        this.dailyrecovered = dailyrecovered;
        this.date = date;
        this.totalconfirmed = totalconfirmed;
        this.totaldeceased = totaldeceased;
        this.totalrecovered = totalrecovered;
    }

    public String getDailyconfirmed() {
        return dailyconfirmed;
    }

    public void setDailyconfirmed(String dailyconfirmed) {
        this.dailyconfirmed = dailyconfirmed;
    }

    public String getDailydeceased() {
        return dailydeceased;
    }

    public void setDailydeceased(String dailydeceased) {
        this.dailydeceased = dailydeceased;
    }

    public String getDailyrecovered() {
        return dailyrecovered;
    }

    public void setDailyrecovered(String dailyrecovered) {
        this.dailyrecovered = dailyrecovered;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotalconfirmed() {
        return totalconfirmed;
    }

    public void setTotalconfirmed(String totalconfirmed) {
        this.totalconfirmed = totalconfirmed;
    }

    public String getTotaldeceased() {
        return totaldeceased;
    }

    public void setTotaldeceased(String totaldeceased) {
        this.totaldeceased = totaldeceased;
    }

    public String getTotalrecovered() {
        return totalrecovered;
    }

    public void setTotalrecovered(String totalrecovered) {
        this.totalrecovered = totalrecovered;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dailyconfirmed", dailyconfirmed).append("dailydeceased", dailydeceased).append("dailyrecovered", dailyrecovered).append("date", date).append("totalconfirmed", totalconfirmed).append("totaldeceased", totaldeceased).append("totalrecovered", totalrecovered).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(date).append(dailyrecovered).append(totalconfirmed).append(totaldeceased).append(dailydeceased).append(additionalProperties).append(totalrecovered).append(dailyconfirmed).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CasesTimeSeries) == false) {
            return false;
        }
        CasesTimeSeries rhs = ((CasesTimeSeries) other);
        return new EqualsBuilder().append(date, rhs.date).append(dailyrecovered, rhs.dailyrecovered).append(totalconfirmed, rhs.totalconfirmed).append(totaldeceased, rhs.totaldeceased).append(dailydeceased, rhs.dailydeceased).append(additionalProperties, rhs.additionalProperties).append(totalrecovered, rhs.totalrecovered).append(dailyconfirmed, rhs.dailyconfirmed).isEquals();
    }

}
