package com.loveline.foodlandtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.app.ProgressDialog;
import android.os.Bundle;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import android.widget.Toast;

public class GridViewone extends AppCompatActivity {

    private RecyclerView myRecyclerview;
    private CustomAdapter myAdapter;
    private ProgressDialog progressDoalog ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_viewone);
        System.out.println("Phase 1");

        progressDoalog =  new ProgressDialog(this);
        progressDoalog.setMessage(" Loading ...");
        progressDoalog.show();
        System.out.println("Phase 2");

        /* Create handle for the RetrofitInstance interface */
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class); // etablir la connexion avec l'endpoint en question
        Call<ObjetResponse> call = service.getAllPhotos();

        System.out.println("Body");
        System.out.println(service.getAllPhotos());


        call.enqueue(new Callback<ObjetResponse>() {

            @Override
            public void onResponse(Call<ObjetResponse> call, Response<ObjetResponse> response) {
                System.out.println("Phase 3");

                progressDoalog.dismiss();
                System.out.println(response.code());
                generateDataList(response.body());

            }

            @Override
            public void onFailure(Call<ObjetResponse> call, Throwable t) {
                System.out.println("Phase 5");

                progressDoalog.dismiss();
                Toast.makeText(GridViewone.this , " SOmething went wong ... please tru=y later", Toast.LENGTH_LONG).show();


            }
        });
    }


    /*Methode to generate List of data using RecyclerView with custom adapter */
    private void generateDataList(ObjetResponse objetResponse)
    {
        try {

            myRecyclerview = (RecyclerView) findViewById(R.id.customRecyclerView);

            myAdapter = new CustomAdapter(this,objetResponse.produits);

            RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);

            myRecyclerview.setLayoutManager(layoutManager);

            myRecyclerview.setAdapter(myAdapter);

        }
        catch (Exception e)
        {
            System.out.println("Mal vu Petite");
        }

    }
}