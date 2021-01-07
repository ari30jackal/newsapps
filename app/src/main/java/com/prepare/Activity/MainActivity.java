package com.prepare.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.prepare.Adapter.AdapterOnItemClickListener;
import com.prepare.Adapter.NewsAdapter;
import com.prepare.Model.ArticlesItem;
import com.prepare.Model.CategorySourceResponse;
import com.prepare.Model.SourcesItem;
import com.prepare.R;
import com.prepare.apiHelper.BaseApiService;
import com.prepare.apiHelper.UtilsApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    BaseApiService mApiService;
    NewsAdapter onlineAdapter;
    RecyclerView rvWishlist;
    Button business,entertainment,technology,sports,health,science;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mApiService = UtilsApi.getAPIService();
business = findViewById(R.id.btn_business);
entertainment = findViewById(R.id.btn_entertainment);
technology = findViewById(R.id.btn_technology);
sports = findViewById(R.id.btn_sports);
health = findViewById(R.id.btn_health);
science = findViewById(R.id.btn_science);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this);
        rvWishlist = findViewById(R.id.rvWishlist);


        rvWishlist.setHasFixedSize(true);
        //rvWishlist.setLayoutManager(mLayoutManager);
        layoutManager = new GridLayoutManager(MainActivity.this, 1);
        rvWishlist.setLayoutManager(layoutManager);
      catbusiness();


business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<SourcesItem> dataItemList = null;
                onlineAdapter = new NewsAdapter(MainActivity.this, dataItemList,genProductAdapterListener());
                rvWishlist.setAdapter(onlineAdapter);
                onlineAdapter.notifyDataSetChanged();
catbusiness();
            }
        });

       health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<SourcesItem> dataItemList = null;
                onlineAdapter = new NewsAdapter(MainActivity.this, dataItemList,genProductAdapterListener());
                rvWishlist.setAdapter(onlineAdapter);
                onlineAdapter.notifyDataSetChanged();

                cathealth();
            }
        });

        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<SourcesItem> dataItemList = null;
                onlineAdapter = new NewsAdapter(MainActivity.this, dataItemList,genProductAdapterListener());
                rvWishlist.setAdapter(onlineAdapter);
                onlineAdapter.notifyDataSetChanged();

                catscience();
            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<SourcesItem> dataItemList = null;
                onlineAdapter = new NewsAdapter(MainActivity.this, dataItemList,genProductAdapterListener());
                rvWishlist.setAdapter(onlineAdapter);
                onlineAdapter.notifyDataSetChanged();

                catsports();
            }
        });
     technology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<SourcesItem> dataItemList = null;
                onlineAdapter = new NewsAdapter(MainActivity.this, dataItemList,genProductAdapterListener());
                rvWishlist.setAdapter(onlineAdapter);
                onlineAdapter.notifyDataSetChanged();

                cattechnology();
            }
        });
        entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<SourcesItem> dataItemList = null;
                onlineAdapter = new NewsAdapter(MainActivity.this, dataItemList,genProductAdapterListener());
                rvWishlist.setAdapter(onlineAdapter);
                onlineAdapter.notifyDataSetChanged();

                catentertainment();
            }
        });


    }

    private void catbusiness() {
        mApiService.getNewsbusiness().enqueue(new Callback<CategorySourceResponse>() {

            @Override
            public void onResponse(@NonNull Call<CategorySourceResponse> call, @NonNull Response<CategorySourceResponse> response) {
                if (response.isSuccessful()) {

                    //Log.d("logggN",""+response.body());
                    List<SourcesItem> dataItemList = response.body().getSources();
                    //Toast.makeText(context, ""+androidItemList, Toast.LENGTH_SHORT).show();
                    onlineAdapter = new NewsAdapter(MainActivity.this, dataItemList,genProductAdapterListener());
                    rvWishlist.setAdapter(onlineAdapter);
                    onlineAdapter.notifyDataSetChanged();

                } else {
                }
            }

            @Override
            public void onFailure(Call<CategorySourceResponse>  call, Throwable t) {

                //Toast.makeText(getActivity(), "Koneksi Internet Bermasalah", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void cattechnology() {
        mApiService.getNewstechnology().enqueue(new Callback<CategorySourceResponse>() {

            @Override
            public void onResponse(@NonNull Call<CategorySourceResponse> call, @NonNull Response<CategorySourceResponse> response) {
                if (response.isSuccessful()) {

                    //Log.d("logggN",""+response.body());
                    List<SourcesItem> dataItemList = response.body().getSources();
                    //Toast.makeText(context, ""+androidItemList, Toast.LENGTH_SHORT).show();
                    onlineAdapter = new NewsAdapter(MainActivity.this, dataItemList,genProductAdapterListener());
                    rvWishlist.setAdapter(onlineAdapter);
                    onlineAdapter.notifyDataSetChanged();

                } else {
                }
            }

            @Override
            public void onFailure(Call<CategorySourceResponse> call, Throwable t) {

                //Toast.makeText(getActivity(), "Koneksi Internet Bermasalah", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void catentertainment() {
        mApiService.getNewsentertainment().enqueue(new Callback<CategorySourceResponse>() {

            @Override
            public void onResponse(@NonNull Call<CategorySourceResponse> call, @NonNull Response<CategorySourceResponse> response) {
                if (response.isSuccessful()) {

                    //Log.d("logggN",""+response.body());
                    List<SourcesItem> dataItemList = response.body().getSources();
                    //Toast.makeText(context, ""+androidItemList, Toast.LENGTH_SHORT).show();
                    onlineAdapter = new NewsAdapter(MainActivity.this, dataItemList,genProductAdapterListener());
                    rvWishlist.setAdapter(onlineAdapter);
                    onlineAdapter.notifyDataSetChanged();

                } else {
                }
            }

            @Override
            public void onFailure(Call<CategorySourceResponse> call, Throwable t) {

                //Toast.makeText(getActivity(), "Koneksi Internet Bermasalah", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void catsports() {
        mApiService.getNewssports().enqueue(new Callback<CategorySourceResponse>() {

            @Override
            public void onResponse(@NonNull Call<CategorySourceResponse> call, @NonNull Response<CategorySourceResponse> response) {
                if (response.isSuccessful()) {

                    //Log.d("logggN",""+response.body());
                    List<SourcesItem> dataItemList = response.body().getSources();
                    //Toast.makeText(context, ""+androidItemList, Toast.LENGTH_SHORT).show();
                    onlineAdapter = new NewsAdapter(MainActivity.this, dataItemList,genProductAdapterListener());
                    rvWishlist.setAdapter(onlineAdapter);
                    onlineAdapter.notifyDataSetChanged();

                } else {
                }
            }

            @Override
            public void onFailure(Call<CategorySourceResponse> call, Throwable t) {

                //Toast.makeText(getActivity(), "Koneksi Internet Bermasalah", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void catscience(){
        mApiService.getNewsscience().enqueue(new Callback<CategorySourceResponse>() {

            @Override
            public void onResponse(@NonNull Call<CategorySourceResponse> call, @NonNull Response<CategorySourceResponse> response) {
                if (response.isSuccessful()) {

                    //Log.d("logggN",""+response.body());
                    List<SourcesItem> dataItemList = response.body().getSources();
                    //Toast.makeText(context, ""+androidItemList, Toast.LENGTH_SHORT).show();
                    onlineAdapter = new NewsAdapter(MainActivity.this, dataItemList,genProductAdapterListener());
                    rvWishlist.setAdapter(onlineAdapter);
                    onlineAdapter.notifyDataSetChanged();

                } else {
                }
            }

            @Override
            public void onFailure(Call<CategorySourceResponse> call, Throwable t) {

                //Toast.makeText(getActivity(), "Koneksi Internet Bermasalah", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void cathealth() {
        mApiService.getNewshealth().enqueue(new Callback<CategorySourceResponse>() {

            @Override
            public void onResponse(@NonNull Call<CategorySourceResponse> call, @NonNull Response<CategorySourceResponse> response) {
                if (response.isSuccessful()) {

                    //Log.d("logggN",""+response.body());
                    List<SourcesItem> dataItemList = response.body().getSources();
                    //Toast.makeText(context, ""+androidItemList, Toast.LENGTH_SHORT).show();
                    onlineAdapter = new NewsAdapter(MainActivity.this, dataItemList,genProductAdapterListener());
                    rvWishlist.setAdapter(onlineAdapter);
                    onlineAdapter.notifyDataSetChanged();

                } else {
                }
            }

            @Override
            public void onFailure(Call<CategorySourceResponse> call, Throwable t) {

                //Toast.makeText(getActivity(), "Koneksi Internet Bermasalah", Toast.LENGTH_SHORT).show();
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