package com.prepare.apiHelper;



import com.prepare.Model.CategorySourceResponse;
import com.prepare.Model.NewsBySourceIdResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;

import retrofit2.http.GET;
import retrofit2.http.Url;


public interface BaseApiService {

    @GET
    Call<NewsBySourceIdResponse> getbysource(@Url String url);
    @GET("sources?&category=business&apiKey=f3aa09e2f1d7494e9fded68f30d4e4c1")
    Call<CategorySourceResponse>  getNewsbusiness();
    @GET("sources?&category=entertainment&apiKey=f3aa09e2f1d7494e9fded68f30d4e4c1")
    Call<CategorySourceResponse>  getNewsentertainment();
    @GET("sources?&category=health&apiKey=f3aa09e2f1d7494e9fded68f30d4e4c1")
    Call<CategorySourceResponse> getNewshealth();
    @GET("sources?&category=science&apiKey=f3aa09e2f1d7494e9fded68f30d4e4c1")
    Call<CategorySourceResponse> getNewsscience();
    @GET("sources?&category=technology&apiKey=f3aa09e2f1d7494e9fded68f30d4e4c1")
    Call<CategorySourceResponse>  getNewstechnology();
    @GET("sources?&category=sports&apiKey=f3aa09e2f1d7494e9fded68f30d4e4c1")
    Call<CategorySourceResponse>  getNewssports();
}
