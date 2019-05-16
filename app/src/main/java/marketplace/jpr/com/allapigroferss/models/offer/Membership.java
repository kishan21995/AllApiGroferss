
package marketplace.jpr.com.allapigroferss.models.offer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Membership {

    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("Smart Bachat Club")
    @Expose
    private List<SmartBachatClub> smartBachatClub = null;
    @SerializedName("Save Beyond Grocery")
    @Expose
    private List<SaveBeyondGrocery> saveBeyondGrocery = null;
    @SerializedName("Plans")
    @Expose
    private List<Plan> plans = null;
    @SerializedName("Budget")
    @Expose
    private List<Budget> budget = null;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<SmartBachatClub> getSmartBachatClub() {
        return smartBachatClub;
    }

    public void setSmartBachatClub(List<SmartBachatClub> smartBachatClub) {
        this.smartBachatClub = smartBachatClub;
    }

    public List<SaveBeyondGrocery> getSaveBeyondGrocery() {
        return saveBeyondGrocery;
    }

    public void setSaveBeyondGrocery(List<SaveBeyondGrocery> saveBeyondGrocery) {
        this.saveBeyondGrocery = saveBeyondGrocery;
    }

    public List<Plan> getPlans() {
        return plans;
    }

    public void setPlans(List<Plan> plans) {
        this.plans = plans;
    }

    public List<Budget> getBudget() {
        return budget;
    }

    public void setBudget(List<Budget> budget) {
        this.budget = budget;
    }

}
