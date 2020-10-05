package com.loveline.foodlandtest;

import retrofit2.Call;
import retrofit2.http.GET;


public interface GetDataService {

    @GET("forward_products/") // pour preciser que nous souhaitons faire un requete de type GET au endpoint /posts ou complement d'Url /posts

    Call<ObjetResponse> getAllPhotos(); //pour preciser le type retourné par le requete Get

}
