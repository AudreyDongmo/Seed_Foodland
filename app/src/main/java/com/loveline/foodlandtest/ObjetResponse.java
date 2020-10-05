package com.loveline.foodlandtest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ObjetResponse {

    @SerializedName("body")
    @Expose
    public List<Product> produits;

    @SerializedName("code")
    @Expose
    String code ;

    @SerializedName("status")
    @Expose
    String status;

    @SerializedName("message")
    @Expose
    String message;

    //the constructor

    public ObjetResponse(List<Product> produits, String code , String status, String message)
    {
        this.produits = produits;
        this.code = code;
        this.status = status;
        this.message = message;
    }

    public List<Product> getProduits() {
        return produits;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

}
