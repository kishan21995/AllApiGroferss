package marketplace.jpr.com.allapigroferss.retrofit;



import java.util.List;

import marketplace.jpr.com.allapigroferss.models.dashboard.CategoryResponse;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {
/*
    //login
    @Multipart
    @POST("cat_api/test_api.php?action=login")
    //@Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<LoginResponse>  login(@Part("u_email") RequestBody u_email,
                               @Part("u_password") RequestBody u_password);*/

  /*  //Registration
    @Multipart
    @POST("cat_api/test_api.php?action=reg")
   //@Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<RegistrationResponse> register(@Part("u_name") RequestBody name,
                                        @Part("u_email") RequestBody email,
                                        @Part("u_mobile") RequestBody mobile,
                                        @Part("u_country") RequestBody country,
                                        @Part("u_password") RequestBody password);*/

/*
    //Catagory

    @POST("cat_api/test_api.php?action=fetch_all")
    Call <List<CatagoryResponse>> getCourse();*/


    @POST("grofer_api/list")
    Call <CategoryResponse> getAllItem();





}
