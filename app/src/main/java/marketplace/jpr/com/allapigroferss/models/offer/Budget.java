
package marketplace.jpr.com.allapigroferss.models.offer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Budget {

    @SerializedName("b_id")
    @Expose
    private String bId;
    @SerializedName("b_monthly_budget")
    @Expose
    private String bMonthlyBudget;
    @SerializedName("b_non_club_saving")
    @Expose
    private String bNonClubSaving;
    @SerializedName("b_club_saving")
    @Expose
    private String bClubSaving;

    public String getBId() {
        return bId;
    }

    public void setBId(String bId) {
        this.bId = bId;
    }

    public String getBMonthlyBudget() {
        return bMonthlyBudget;
    }

    public void setBMonthlyBudget(String bMonthlyBudget) {
        this.bMonthlyBudget = bMonthlyBudget;
    }

    public String getBNonClubSaving() {
        return bNonClubSaving;
    }

    public void setBNonClubSaving(String bNonClubSaving) {
        this.bNonClubSaving = bNonClubSaving;
    }

    public String getBClubSaving() {
        return bClubSaving;
    }

    public void setBClubSaving(String bClubSaving) {
        this.bClubSaving = bClubSaving;
    }

}
