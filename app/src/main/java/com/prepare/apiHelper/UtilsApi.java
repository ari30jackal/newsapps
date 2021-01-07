package com.prepare.apiHelper;

public class UtilsApi {
    // http://52.40.55.251/ellaundry/APIv2/index.php/auth

    public static final String BASE_URL_API = "https://newsapi.org/v2/";

    // Mendeklarasikan Interface BaseApiService
    public static BaseApiService getAPIService() {
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
