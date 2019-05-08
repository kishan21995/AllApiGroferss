package marketplace.jpr.com.allapigroferss.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponse {

@SerializedName("status")
@Expose
private String status;
@SerializedName("message")
@Expose
private String message;
@SerializedName("id")
@Expose
private String id;
@SerializedName("Name")
@Expose
private String name;
@SerializedName("Email")
@Expose
private String email;
@SerializedName("Mobile")
@Expose
private String mobile;
@SerializedName("Country")
@Expose
private String country;

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public String getMessage() {
return message;
}

public void setMessage(String message) {
this.message = message;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getMobile() {
return mobile;
}

public void setMobile(String mobile) {
this.mobile = mobile;
}

public String getCountry() {
return country;
}

public void setCountry(String country) {
this.country = country;
}

}