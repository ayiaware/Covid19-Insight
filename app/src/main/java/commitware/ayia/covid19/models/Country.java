package commitware.ayia.covid19.models;
import com.google.gson.annotations.SerializedName;

public class Country {

    @SerializedName("cases")
    private String cases;

    @SerializedName("todayCases")
    private String todayCases;

    @SerializedName("recovered")
    private String recovered;

    @SerializedName("deaths")
    private String deaths;

    @SerializedName("todayDeaths")
    private String todayDeaths;

    @SerializedName("critical")
    private String critical;

    @SerializedName("active")
    private String active;

    @SerializedName("tests")
    private String tested;

    @SerializedName("country")
    private String name;

    @SerializedName("updated")
    private long updated;


    public String getCases() {
        return cases;
    }

    public String getTodayCases() {
        return todayCases;
    }

    public String getRecovered() {
        return recovered;
    }

    public String getDeaths() {
        return deaths;
    }

    public String getTodayDeaths() {
        return todayDeaths;
    }

    public String getCritical() {
        return critical;
    }

    public String getActive() {
        return active;
    }

    public String getTested() {
        return tested;
    }

    public String getName() {
        return name;
    }

    public long getUpdated() {
        return updated;
    }
}
