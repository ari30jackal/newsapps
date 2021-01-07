package com.prepare.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.prepare.Adapter.AdapterOnItemClickListener;
import com.prepare.Adapter.NewsAdapter;
import com.prepare.Adapter.NewsBySourceIdAdapter;
import com.prepare.Model.ArticlesItem;
import com.prepare.Model.CategorySourceResponse;
import com.prepare.Model.NewsBySourceIdResponse;
import com.prepare.Model.SourcesItem;
import com.prepare.R;
import com.prepare.apiHelper.BaseApiService;
import com.prepare.apiHelper.UtilsApi;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListbySource extends AppCompatActivity {
    BaseApiService mApiService;
    NewsBySourceIdAdapter onlineAdapter;
    String source;
    RecyclerView rvWishlist;
    Button business,entertainment,technology,sports,health,science;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_category);
        mApiService = UtilsApi.getAPIService();

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(ListbySource.this);
        rvWishlist = findViewById(R.id.rvWishlist);









        
source = getIntent().getExtras().getString("tes");
        rvWishlist.setHasFixedSize(true);
        //rvWishlist.setLayoutManager(mLayoutManager);
        layoutManager = new GridLayoutManager(ListbySource.this, 1);
        rvWishlist.setLayoutManager(layoutManager);
        getbysource();
    }

    private void getbysource() {



        mApiService.getbysource("everything?sources="+source+"&apiKey=f73ac613cfe4436cb9a035fa9df9df2d").enqueue(new Callback<NewsBySourceIdResponse>() {
            @Override
            public void onResponse(@NonNull Call<NewsBySourceIdResponse> call, @NonNull Response<NewsBySourceIdResponse> response) {
                if (response.isSuccessful()) {

                    //Log.d("logggDetailCourRes", "" + response.body());


                        //Log.d("logggN",""+response.body());
                        List<ArticlesItem> dataItemList = response.body().getArticles();
                        //Toast.makeText(context, ""+androidItemList, Toast.LENGTH_SHORT).show();
                        onlineAdapter = new NewsBySourceIdAdapter(ListbySource.this, dataItemList,genProductAdapterListener());
                        rvWishlist.setAdapter(onlineAdapter);
                        onlineAdapter.notifyDataSetChanged();





                } else {
               }
            }


            @Override
            public void onFailure(Call<NewsBySourceIdResponse> call, Throwable t) {
          }
        });

    }


    private AdapterOnItemClickListener genProductAdapterListener() {
        return new AdapterOnItemClickListener() {
            @Override
            public void onClick(View view, int position) {

            }
        };
    }
}