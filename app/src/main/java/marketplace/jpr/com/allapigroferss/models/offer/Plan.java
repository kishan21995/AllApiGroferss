
package marketplace.jpr.com.allapigroferss.models.offer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Plan {

    @SerializedName("plan_id")
    @Expose
    private String planId;
    @SerializedName("plan_months")
    @Expose
    private String planMonths;
    @SerializedName("plan_price")
    @Expose
    private String planPrice;
    @SerializedName("plan_discount_price")
    @Expose
    private String planDiscountPrice;
    @SerializedName("plan_free")
    @Expose
    private String planFree;

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPlanMonths() {
        return planMonths;
    }

    public void setPlanMonths(String planMonths) {
        this.planMonths = planMonths;
    }

    public String getPlanPrice() {
        return planPrice;
    }

    public void setPlanPrice(String planPrice) {
        this.planPrice = planPrice;
    }

    public String getPlanDiscountPrice() {
        return planDiscountPrice;
    }

    public void setPlanDiscountPrice(String planDiscountPrice) {
        this.planDiscountPrice = planDiscountPrice;
    }

    public String getPlanFree() {
        return planFree;
    }

    public void setPlanFree(String planFree) {
        this.planFree = planFree;
    }

}
