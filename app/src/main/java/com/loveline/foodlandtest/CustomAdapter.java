package com.loveline.foodlandtest;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;


import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private List<Product> dataList;
    private Context context;

    public CustomAdapter(Context context , List<Product> dataList)
    {
        this.context = context;
        this.dataList = dataList ;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_row , parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        try
        {

            holder.nomProduit.setText(dataList.get(position).getNomProduit());
            holder.prixProduit.setText(dataList.get(position).getPrixProduitClassic());
            holder.nomEtablissement.setText(dataList.get(position).getNomEtablissement());
            String imageUrl = (dataList.get(position)).getImageProduit();
            System.out.println("L'url de votre fichier image");
            System.out.println(imageUrl);
            Picasso.with(context)
                    .load(imageUrl)
                    .into(holder.imagePoduit);


        }
        catch ( Exception e)
        {
            System.out.println(" MAl vu miss");
        }


    }

    @Override
    public int getItemCount() {
        if (dataList == null)
        {
            System.out.println("0");
            return 0;
        }
        else
        {
            System.out.println(dataList.size());
            return dataList.size();
        }

    }

    class CustomViewHolder extends RecyclerView.ViewHolder{
        public View mView;
        private TextView nomProduit ;
        private TextView prixProduit;
        private TextView nomEtablissement;
        private ImageView imagePoduit;

        CustomViewHolder(View itemView){
            super(itemView);
            mView = itemView;
            nomProduit = mView.findViewById(R.id.nom_produit);
            prixProduit = mView.findViewById(R.id.prix_produit);
            nomEtablissement = mView.findViewById(R.id.nom_etablissement);
            imagePoduit = mView.findViewById(R.id.image_product);
        }


    }
}
