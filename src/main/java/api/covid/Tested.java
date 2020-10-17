
package api.covid;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Tested {

    private String dailyrtpcrsamplescollectedicmrapplication;
    private String individualstestedperconfirmedcase;
    private String positivecasesfromsamplesreported;
    private String samplereportedtoday;
    private String source;
    private String source1;
    private String source3;
    private String testedasof;
    private String testpositivityrate;
    private String testsconductedbyprivatelabs;
    private String testsperconfirmedcase;
    private String testspermillion;
    private String totalindividualstested;
    private String totalpositivecases;
    private String totalrtpcrsamplescollectedicmrapplication;
    private String totalsamplestested;
    private String updatetimestamp;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Tested() {
    }

    /**
     * 
     * @param totalsamplestested
     * @param source3
     * @param positivecasesfromsamplesreported
     * @param samplereportedtoday
     * @param source1
     * @param source
     * @param totalrtpcrsamplescollectedicmrapplication
     * @param testsperconfirmedcase
     * @param individualstestedperconfirmedcase
     * @param testpositivityrate
     * @param testsconductedbyprivatelabs
     * @param testedasof
     * @param testspermillion
     * @param dailyrtpcrsamplescollectedicmrapplication
     * @param updatetimestamp
     * @param totalindividualstested
     * @param totalpositivecases
     */
    public Tested(String dailyrtpcrsamplescollectedicmrapplication, String individualstestedperconfirmedcase, String positivecasesfromsamplesreported, String samplereportedtoday, String source, String source1, String source3, String testedasof, String testpositivityrate, String testsconductedbyprivatelabs, String testsperconfirmedcase, String testspermillion, String totalindividualstested, String totalpositivecases, String totalrtpcrsamplescollectedicmrapplication, String totalsamplestested, String updatetimestamp) {
        super();
        this.dailyrtpcrsamplescollectedicmrapplication = dailyrtpcrsamplescollectedicmrapplication;
        this.individualstestedperconfirmedcase = individualstestedperconfirmedcase;
        this.positivecasesfromsamplesreported = positivecasesfromsamplesreported;
        this.samplereportedtoday = samplereportedtoday;
        this.source = source;
        this.source1 = source1;
        this.source3 = source3;
        this.testedasof = testedasof;
        this.testpositivityrate = testpositivityrate;
        this.testsconductedbyprivatelabs = testsconductedbyprivatelabs;
        this.testsperconfirmedcase = testsperconfirmedcase;
        this.testspermillion = testspermillion;
        this.totalindividualstested = totalindividualstested;
        this.totalpositivecases = totalpositivecases;
        this.totalrtpcrsamplescollectedicmrapplication = totalrtpcrsamplescollectedicmrapplication;
        this.totalsamplestested = totalsamplestested;
        this.updatetimestamp = updatetimestamp;
    }

    public String getDailyrtpcrsamplescollectedicmrapplication() {
        return dailyrtpcrsamplescollectedicmrapplication;
    }

    public void setDailyrtpcrsamplescollectedicmrapplication(String dailyrtpcrsamplescollectedicmrapplication) {
        this.dailyrtpcrsamplescollectedicmrapplication = dailyrtpcrsamplescollectedicmrapplication;
    }

    public String getIndividualstestedperconfirmedcase() {
        return individualstestedperconfirmedcase;
    }

    public void setIndividualstestedperconfirmedcase(String individualstestedperconfirmedcase) {
        this.individualstestedperconfirmedcase = individualstestedperconfirmedcase;
    }

    public String getPositivecasesfromsamplesreported() {
        return positivecasesfromsamplesreported;
    }

    public void setPositivecasesfromsamplesreported(String positivecasesfromsamplesreported) {
        this.positivecasesfromsamplesreported = positivecasesfromsamplesreported;
    }

    public String getSamplereportedtoday() {
        return samplereportedtoday;
    }

    public void setSamplereportedtoday(String samplereportedtoday) {
        this.samplereportedtoday = samplereportedtoday;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource1() {
        return source1;
    }

    public void setSource1(String source1) {
        this.source1 = source1;
    }

    public String getSource3() {
        return source3;
    }

    public void setSource3(String source3) {
        this.source3 = source3;
    }

    public String getTestedasof() {
        return testedasof;
    }

    public void setTestedasof(String testedasof) {
        this.testedasof = testedasof;
    }

    public String getTestpositivityrate() {
        return testpositivityrate;
    }

    public void setTestpositivityrate(String testpositivityrate) {
        this.testpositivityrate = testpositivityrate;
    }

    public String getTestsconductedbyprivatelabs() {
        return testsconductedbyprivatelabs;
    }

    public void setTestsconductedbyprivatelabs(String testsconductedbyprivatelabs) {
        this.testsconductedbyprivatelabs = testsconductedbyprivatelabs;
    }

    public String getTestsperconfirmedcase() {
        return testsperconfirmedcase;
    }

    public void setTestsperconfirmedcase(String testsperconfirmedcase) {
        this.testsperconfirmedcase = testsperconfirmedcase;
    }

    public String getTestspermillion() {
        return testspermillion;
    }

    public void setTestspermillion(String testspermillion) {
        this.testspermillion = testspermillion;
    }

    public String getTotalindividualstested() {
        return totalindividualstested;
    }

    public void setTotalindividualstested(String totalindividualstested) {
        this.totalindividualstested = totalindividualstested;
    }

    public String getTotalpositivecases() {
        return totalpositivecases;
    }

    public void setTotalpositivecases(String totalpositivecases) {
        this.totalpositivecases = totalpositivecases;
    }

    public String getTotalrtpcrsamplescollectedicmrapplication() {
        return totalrtpcrsamplescollectedicmrapplication;
    }

    public void setTotalrtpcrsamplescollectedicmrapplication(String totalrtpcrsamplescollectedicmrapplication) {
        this.totalrtpcrsamplescollectedicmrapplication = totalrtpcrsamplescollectedicmrapplication;
    }

    public String getTotalsamplestested() {
        return totalsamplestested;
    }

    public void setTotalsamplestested(String totalsamplestested) {
        this.totalsamplestested = totalsamplestested;
    }

    public String getUpdatetimestamp() {
        return updatetimestamp;
    }

    public void setUpdatetimestamp(String updatetimestamp) {
        this.updatetimestamp = updatetimestamp;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dailyrtpcrsamplescollectedicmrapplication", dailyrtpcrsamplescollectedicmrapplication).append("individualstestedperconfirmedcase", individualstestedperconfirmedcase).append("positivecasesfromsamplesreported", positivecasesfromsamplesreported).append("samplereportedtoday", samplereportedtoday).append("source", source).append("source1", source1).append("source3", source3).append("testedasof", testedasof).append("testpositivityrate", testpositivityrate).append("testsconductedbyprivatelabs", testsconductedbyprivatelabs).append("testsperconfirmedcase", testsperconfirmedcase).append("testspermillion", testspermillion).append("totalindividualstested", totalindividualstested).append("totalpositivecases", totalpositivecases).append("totalrtpcrsamplescollectedicmrapplication", totalrtpcrsamplescollectedicmrapplication).append("totalsamplestested", totalsamplestested).append("updatetimestamp", updatetimestamp).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalsamplestested).append(source3).append(positivecasesfromsamplesreported).append(samplereportedtoday).append(source1).append(source).append(totalrtpcrsamplescollectedicmrapplication).append(testsperconfirmedcase).append(individualstestedperconfirmedcase).append(testpositivityrate).append(testsconductedbyprivatelabs).append(testedasof).append(testspermillion).append(dailyrtpcrsamplescollectedicmrapplication).append(additionalProperties).append(updatetimestamp).append(totalindividualstested).append(totalpositivecases).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tested) == false) {
            return false;
        }
        Tested rhs = ((Tested) other);
        return new EqualsBuilder().append(totalsamplestested, rhs.totalsamplestested).append(source3, rhs.source3).append(positivecasesfromsamplesreported, rhs.positivecasesfromsamplesreported).append(samplereportedtoday, rhs.samplereportedtoday).append(source1, rhs.source1).append(source, rhs.source).append(totalrtpcrsamplescollectedicmrapplication, rhs.totalrtpcrsamplescollectedicmrapplication).append(testsperconfirmedcase, rhs.testsperconfirmedcase).append(individualstestedperconfirmedcase, rhs.individualstestedperconfirmedcase).append(testpositivityrate, rhs.testpositivityrate).append(testsconductedbyprivatelabs, rhs.testsconductedbyprivatelabs).append(testedasof, rhs.testedasof).append(testspermillion, rhs.testspermillion).append(dailyrtpcrsamplescollectedicmrapplication, rhs.dailyrtpcrsamplescollectedicmrapplication).append(additionalProperties, rhs.additionalProperties).append(updatetimestamp, rhs.updatetimestamp).append(totalindividualstested, rhs.totalindividualstested).append(totalpositivecases, rhs.totalpositivecases).isEquals();
    }

}
