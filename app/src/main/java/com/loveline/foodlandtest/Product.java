package com.loveline.foodlandtest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    //Cathegorie Class
    public class CategorieCarre {

        @SerializedName("id_categorie_caree")
        @Expose
        private String idCategorieCaree;
        @SerializedName("nom_categorie_caree")
        @Expose
        private String nomCategorieCaree;
        @SerializedName("image_categorie_caree")
        @Expose
        private String imageCategorieCaree;
        @SerializedName("icon_categorie_caree")
        @Expose
        private String iconCategorieCaree;
        @SerializedName("description_categorie_caree")
        @Expose
        private String descriptionCategorieCaree;
        @SerializedName("id_caree")
        @Expose
        private String idCaree;
        @SerializedName("perc_commission")
        @Expose
        private String percCommission;

    }


    /* @SerializedName  est pour dire a GSON de mapper ou lier l'attribut id avec l'element id du fichier Json*/
    @SerializedName("id_produit")
    @Expose
    private String idProduit;

    @SerializedName("nom_produit")
    @Expose
    private String nomProduit;

    @SerializedName("description_produit")
    @Expose
    private String descriptionProduit;

    @SerializedName("image_produit")
    @Expose
    private String imageProduit;

    @SerializedName("prix_produit_classic")
    @Expose
    private String prixProduitClassic;


    @SerializedName("nom_etablissement")
    @Expose
    private String nomEtablissement;

    @SerializedName("prix_produit_elegance")
    @Expose
    private String prixProduitElegance;

    @SerializedName("prix_produit_prestige")
    @Expose
    private String prixProduitPrestige;

    @SerializedName("etat_produit")
    @Expose
    private String etatProduit;

    @SerializedName("condition_produit")
    @Expose
    private String conditionProduit;

    @SerializedName("date_creation_produit")
    @Expose
    private String dateCreationProduit;

    @SerializedName("date_update_produit")
    @Expose
    private String dateUpdateProduit;

    @SerializedName("is_deleted_produit")
    @Expose
    private String isDeletedProduit;

    @SerializedName("nombre_demande_produit")
    @Expose
    private String nombreDemandeProduit;

    @SerializedName("nombre_minimum_commande")
    @Expose
    private String nombreMinimumCommande;

    @SerializedName("code_produit")
    @Expose
    private Object codeProduit;

    @SerializedName("matricule_produit")
    @Expose
    private String matriculeProduit;

    @SerializedName("couverture_produit_1")
    @Expose
    private String couvertureProduit1;

    @SerializedName("couverture_produit_2")
    @Expose
    private String couvertureProduit2;

    @SerializedName("couverture_produit_3")
    @Expose
    private String couvertureProduit3;

    @SerializedName("couverture_produit_4")
    @Expose
    private String couvertureProduit4;

    @SerializedName("quantite_en_stock")
    @Expose
    private String quantiteEnStock;

    @SerializedName("quantite_en_stock_reel")
    @Expose
    private String quantiteEnStockReel;

    @SerializedName("seuil_stock")
    @Expose
    private String seuilStock;

    @SerializedName("for_kitchen")
    @Expose
    private String forKitchen;

    @SerializedName("deep_link")
    @Expose
    private String deepLink;

    @SerializedName("miniature_image_produit")
    @Expose
    private String miniatureImageProduit;

    @SerializedName("sp_couverture_produit")
    @Expose
    private String spCouvertureProduit;

    @SerializedName("details_description")
    @Expose
    private String detailsDescription;

    public void setNombreMinimumCommande(String nombreMinimumCommande) {
        this.nombreMinimumCommande = nombreMinimumCommande;
    }

    public void setMatriculeProduit(String matriculeProduit) {
        this.matriculeProduit = matriculeProduit;
    }

    public String getCouvertureProduit3() {
        return couvertureProduit3;
    }

    public void setCouvertureProduit3(String couvertureProduit3) {
        this.couvertureProduit3 = couvertureProduit3;
    }

    public String getCouvertureProduit4() {
        return couvertureProduit4;
    }

    public void setCouvertureProduit4(String couvertureProduit4) {
        this.couvertureProduit4 = couvertureProduit4;
    }

    public String getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public void setQuantiteEnStock(String quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }

    public String getQuantiteEnStockReel() {
        return quantiteEnStockReel;
    }

    public void setQuantiteEnStockReel(String quantiteEnStockReel) {
        this.quantiteEnStockReel = quantiteEnStockReel;
    }

    public String getSeuilStock() {
        return seuilStock;
    }

    public void setSeuilStock(String seuilStock) {
        this.seuilStock = seuilStock;
    }

    public String getForKitchen() {
        return forKitchen;
    }

    public void setForKitchen(String forKitchen) {
        this.forKitchen = forKitchen;
    }

    public String getDeepLink() {
        return deepLink;
    }

    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

    public String getMiniatureImageProduit() {
        return miniatureImageProduit;
    }

    public void setMiniatureImageProduit(String miniatureImageProduit) {
        this.miniatureImageProduit = miniatureImageProduit;
    }

    public String getSpCouvertureProduit() {
        return spCouvertureProduit;
    }

    public void setSpCouvertureProduit(String spCouvertureProduit) {
        this.spCouvertureProduit = spCouvertureProduit;
    }

    public String getDetailsDescription() {
        return detailsDescription;
    }

    public void setDetailsDescription(String detailsDescription) {
        this.detailsDescription = detailsDescription;
    }

    public String getCanBeReserved() {
        return canBeReserved;
    }

    public String getCanBeDelivered() {
        return canBeDelivered;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getIdMarque() {
        return idMarque;
    }

    public void setIdMarque(String idMarque) {
        this.idMarque = idMarque;
    }

    public String getIdEtablissement() {
        return idEtablissement;
    }

    public void setIdEtablissement(String idEtablissement) {
        this.idEtablissement = idEtablissement;
    }

    public String getIdCaree() {
        return idCaree;
    }

    public void setIdCaree(String idCaree) {
        this.idCaree = idCaree;
    }

    public String getIdSousCaree() {
        return idSousCaree;
    }

    public void setIdSousCaree(String idSousCaree) {
        this.idSousCaree = idSousCaree;
    }

    public void setIdCategorieCaree(String idCategorieCaree) {
        this.idCategorieCaree = idCategorieCaree;
    }

    public String getNomCaree() {
        return nomCaree;
    }

    public void setNomCaree(String nomCaree) {
        this.nomCaree = nomCaree;
    }

    public String getNomSousCaree() {
        return nomSousCaree;
    }

    public void setNomSousCaree(String nomSousCaree) {
        this.nomSousCaree = nomSousCaree;
    }

    public String getNomCategorieCaree() {
        return nomCategorieCaree;
    }

    public void setNomCategorieCaree(String nomCategorieCaree) {
        this.nomCategorieCaree = nomCategorieCaree;
    }

    public String getCanVisibleOnMarketplace() {
        return canVisibleOnMarketplace;
    }

    public String getIsLocalProduct() {
        return isLocalProduct;
    }

    public void setIsLocalProduct(String isLocalProduct) {
        this.isLocalProduct = isLocalProduct;
    }

    public String getDateDebutPromo() {
        return dateDebutPromo;
    }

    public void setDateDebutPromo(String dateDebutPromo) {
        this.dateDebutPromo = dateDebutPromo;
    }

    public String getDateFinPromo() {
        return dateFinPromo;
    }

    public void setDateFinPromo(String dateFinPromo) {
        this.dateFinPromo = dateFinPromo;
    }

    public String getPercReducPromo() {
        return percReducPromo;
    }

    public void setPercReducPromo(String percReducPromo) {
        this.percReducPromo = percReducPromo;
    }

    public String getPrixPromo() {
        return prixPromo;
    }

    public void setPrixPromo(String prixPromo) {
        this.prixPromo = prixPromo;
    }

    public String getIsInPromo() {
        return isInPromo;
    }

    public void setIsInPromo(String isInPromo) {
        this.isInPromo = isInPromo;
    }

    public String getQuantiteInitialPromo() {
        return quantiteInitialPromo;
    }

    public void setQuantiteInitialPromo(String quantiteInitialPromo) {
        this.quantiteInitialPromo = quantiteInitialPromo;
    }

    public String getQuantiteFinPromo() {
        return quantiteFinPromo;
    }

    public void setQuantiteFinPromo(String quantiteFinPromo) {
        this.quantiteFinPromo = quantiteFinPromo;
    }

    public String getNoteProduit() {
        return noteProduit;
    }

    public void setNoteProduit(String noteProduit) {
        this.noteProduit = noteProduit;
    }

    public String getNombreVotes() {
        return nombreVotes;
    }

    public void setNombreVotes(String nombreVotes) {
        this.nombreVotes = nombreVotes;
    }

    public String getTotalNotes() {
        return totalNotes;
    }

    public void setTotalNotes(String totalNotes) {
        this.totalNotes = totalNotes;
    }

    public String getNombreVues() {
        return nombreVues;
    }

    public void setNombreVues(String nombreVues) {
        this.nombreVues = nombreVues;
    }

    public String getNombreClickContact() {
        return nombreClickContact;
    }

    public void setNombreClickContact(String nombreClickContact) {
        this.nombreClickContact = nombreClickContact;
    }

    public String getClickBtnWhatsapp() {
        return clickBtnWhatsapp;
    }

    public void setClickBtnWhatsapp(String clickBtnWhatsapp) {
        this.clickBtnWhatsapp = clickBtnWhatsapp;
    }

    public String getClickBtnTelegram() {
        return clickBtnTelegram;
    }

    public void setClickBtnTelegram(String clickBtnTelegram) {
        this.clickBtnTelegram = clickBtnTelegram;
    }

    public String getClickBtnPanier() {
        return clickBtnPanier;
    }

    public void setClickBtnPanier(String clickBtnPanier) {
        this.clickBtnPanier = clickBtnPanier;
    }

    public String getIsSoldInBulk() {
        return isSoldInBulk;
    }

    public void setIsSoldInBulk(String isSoldInBulk) {
        this.isSoldInBulk = isSoldInBulk;
    }

    public String getIsPackage() {
        return isPackage;
    }

    public void setIsPackage(String isPackage) {
        this.isPackage = isPackage;
    }

    @SerializedName("can_be_reserved")
    @Expose
    private String canBeReserved;

    @SerializedName("can_be_delivered")
    @Expose
    private String canBeDelivered;

    @SerializedName("marque")
    @Expose
    private String marque;

    @SerializedName("id_marque")
    @Expose
    private String idMarque;

    @SerializedName("id_etablissement")
    @Expose
    private String idEtablissement;

    @SerializedName("id_caree")
    @Expose
    private String idCaree;

    @SerializedName("id_sous_caree")
    @Expose
    private String idSousCaree;

    @SerializedName("id_categorie_caree")
    @Expose
    private String idCategorieCaree;

    @SerializedName("nom_caree")
    @Expose
    private String nomCaree;

    @SerializedName("nom_sous_caree")
    @Expose
    private String nomSousCaree;

    @SerializedName("nom_categorie_caree")
    @Expose
    private String nomCategorieCaree;

    @SerializedName("can_visible_on_marketplace")
    @Expose
    private String canVisibleOnMarketplace;

    @SerializedName("is_local_product")
    @Expose
    private String isLocalProduct;

    @SerializedName("date_debut_promo")
    @Expose
    private String dateDebutPromo;

    @SerializedName("date_fin_promo")
    @Expose
    private String dateFinPromo;

    @SerializedName("perc_reduc_promo")
    @Expose
    private String percReducPromo;

    @SerializedName("prix_promo")
    @Expose
    private String prixPromo;

    @SerializedName("is_in_promo")
    @Expose
    private String isInPromo;

    @SerializedName("quantite_initial_promo")
    @Expose
    private String quantiteInitialPromo;

    @SerializedName("quantite_fin_promo")
    @Expose
    private String quantiteFinPromo;

    @SerializedName("note_produit")
    @Expose
    private String noteProduit;

    @SerializedName("nombre_votes")
    @Expose
    private String nombreVotes;

    @SerializedName("total_notes")
    @Expose
    private String totalNotes;

    @SerializedName("nombre_vues")
    @Expose
    private String nombreVues;

    @SerializedName("nombre_click_contact")
    @Expose
    private String nombreClickContact;

    @SerializedName("click_btn_whatsapp")
    @Expose
    private String clickBtnWhatsapp;

    @SerializedName("click_btn_telegram")
    @Expose
    private String clickBtnTelegram;

    @SerializedName("click_btn_panier")
    @Expose
    private String clickBtnPanier;

    @SerializedName("is_sold_in_bulk")
    @Expose
    private String isSoldInBulk;

    @SerializedName("is_package")
    @Expose
    private String isPackage;

    /*  public Product(String idProduit, String nomProduit, String descriptionProduit, String imageProduit, String prixProduitClassic, String nomEtablissement, String prixProduitElegance, String prixProduitPrestige, String etatProduit, String conditionProduit, String dateCreationProduit, String dateUpdateProduit, String isDeletedProduit, String nombreDemandeProduit, String nombreMinimumCommande, Object codeProduit, String matriculeProduit, String couvertureProduit1, String couvertureProduit2, String couvertureProduit3, String couvertureProduit4, String quantiteEnStock, String quantiteEnStockReel, String seuilStock, String forKitchen, String deepLink, String miniatureImageProduit, String spCouvertureProduit, String detailsDescription, String canBeReserved, String canBeDelivered, String marque, String idMarque, String idEtablissement, String idCaree, String idSousCaree, String idCategorieCaree, String nomCaree, String nomSousCaree, String nomCategorieCaree, String canVisibleOnMarketplace, String isLocalProduct, String dateDebutPromo, String dateFinPromo, String percReducPromo, String prixPromo, String isInPromo, String quantiteInitialPromo, String quantiteFinPromo, String noteProduit, String nombreVotes, String totalNotes, String nombreVues, String nombreClickContact, String clickBtnWhatsapp, String clickBtnTelegram, String clickBtnPanier, String isSoldInBulk, String isPackage, CategorieCarre categorieCarre) {
        this.idProduit = idProduit;
        this.nomProduit = nomProduit;
        this.descriptionProduit = descriptionProduit;
        this.imageProduit = imageProduit;
        this.prixProduitClassic = prixProduitClassic;
        this.nomEtablissement = nomEtablissement;
        this.prixProduitElegance = prixProduitElegance;
        this.prixProduitPrestige = prixProduitPrestige;
        this.etatProduit = etatProduit;
        this.conditionProduit = conditionProduit;
        this.dateCreationProduit = dateCreationProduit;
        this.dateUpdateProduit = dateUpdateProduit;
        this.isDeletedProduit = isDeletedProduit;
        this.nombreDemandeProduit = nombreDemandeProduit;
        this.nombreMinimumCommande = nombreMinimumCommande;
        this.codeProduit = codeProduit;
        this.matriculeProduit = matriculeProduit;
        this.couvertureProduit1 = couvertureProduit1;
        this.couvertureProduit2 = couvertureProduit2;
        this.couvertureProduit3 = couvertureProduit3;
        this.couvertureProduit4 = couvertureProduit4;
        this.quantiteEnStock = quantiteEnStock;
        this.quantiteEnStockReel = quantiteEnStockReel;
        this.seuilStock = seuilStock;
        this.forKitchen = forKitchen;
        this.deepLink = deepLink;
        this.miniatureImageProduit = miniatureImageProduit;
        this.spCouvertureProduit = spCouvertureProduit;
        this.detailsDescription = detailsDescription;
        this.canBeReserved = canBeReserved;
        this.canBeDelivered = canBeDelivered;
        this.marque = marque;
        this.idMarque = idMarque;
        this.idEtablissement = idEtablissement;
        this.idCaree = idCaree;
        this.idSousCaree = idSousCaree;
        this.idCategorieCaree = idCategorieCaree;
        this.nomCaree = nomCaree;
        this.nomSousCaree = nomSousCaree;
        this.nomCategorieCaree = nomCategorieCaree;
        this.canVisibleOnMarketplace = canVisibleOnMarketplace;
        this.isLocalProduct = isLocalProduct;
        this.dateDebutPromo = dateDebutPromo;
        this.dateFinPromo = dateFinPromo;
        this.percReducPromo = percReducPromo;
        this.prixPromo = prixPromo;
        this.isInPromo = isInPromo;
        this.quantiteInitialPromo = quantiteInitialPromo;
        this.quantiteFinPromo = quantiteFinPromo;
        this.noteProduit = noteProduit;
        this.nombreVotes = nombreVotes;
        this.totalNotes = totalNotes;
        this.nombreVues = nombreVues;
        this.nombreClickContact = nombreClickContact;
        this.clickBtnWhatsapp = clickBtnWhatsapp;
        this.clickBtnTelegram = clickBtnTelegram;
        this.clickBtnPanier = clickBtnPanier;
        this.isSoldInBulk = isSoldInBulk;
        this.isPackage = isPackage;
        this.categorieCarre = categorieCarre;
    } */

    @SerializedName("categorie_carre")
    @Expose
    private CategorieCarre categorieCarre;





   /* public Product( String idProduit , String nomProduit , String descriptionProduit , String imageProduit , String prixProduitClassic , String nomEtablissement)
    {
        this.idProduit = idProduit;
        this.descriptionProduit = descriptionProduit ;
        this.imageProduit = imageProduit;
        this.prixProduitClassic = prixProduitClassic;
        this.nomEtablissement = nomEtablissement;
    }*/


    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getNomEtablissement() {
        return nomEtablissement;
    }

    public void setNomEtablissement(String nomEtablissement) {
        this.nomEtablissement = nomEtablissement;
    }

    public String getImageProduit() {
        return imageProduit;
    }

    public void setImageProduit(String imageProduit) {
        this.imageProduit = imageProduit;
    }


    public String getPrixProduitClassic() {
        return prixProduitClassic;
    }

    public void setPrixProduitClassic(String prixProduitClassic) {
        this.prixProduitClassic = prixProduitClassic;
    }

    public Object getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(Object codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getDescriptionProduit() {
        return descriptionProduit;
    }

    public void setDescriptionProduit(String descriptionProduit) {
        this.descriptionProduit = descriptionProduit;
    }

    public String getPrixProduitElegance() {
        return prixProduitElegance;
    }

    public void setPrixProduitElegance(String prixProduitElegance) {
        this.prixProduitElegance = prixProduitElegance;
    }

    public String getConditionProduit() {
        return conditionProduit;
    }

    public void setConditionProduit(String conditionProduit) {
        this.conditionProduit = conditionProduit;
    }

    public String getPrixProduitPrestige() {
        return prixProduitPrestige;
    }

    public void setPrixProduitPrestige(String prixProduitPrestige) {
        this.prixProduitPrestige = prixProduitPrestige;
    }

    public String getDateCreationProduit() {
        return dateCreationProduit;
    }

    public void setDateCreationProduit(String dateCreationProduit) {
        this.dateCreationProduit = dateCreationProduit;
    }

    public String getEtatProduit() {
        return etatProduit;
    }

    public void setCanBeDelivered(String canBeDelivered) {
        this.canBeDelivered = canBeDelivered;
    }

    public String getDateUpdateProduit() {
        return dateUpdateProduit;
    }

    public void setDateUpdateProduit(String dateUpdateProduit) {
        this.dateUpdateProduit = dateUpdateProduit;
    }

    public String getCouvertureProduit1() {
        return couvertureProduit1;
    }

    public void setEtatProduit(String etatProduit) {
        this.etatProduit = etatProduit;
    }

    public String getIsDeletedProduit() {
        return isDeletedProduit;
    }

    public void setIsDeletedProduit(String isDeletedProduit) {
        this.isDeletedProduit = isDeletedProduit;
    }

    public String getMatriculeProduit() {
        return matriculeProduit;
    }

    public void setNombreDemandeProduit(String nombreDemandeProduit) {
        this.nombreDemandeProduit = nombreDemandeProduit;
    }

    public CategorieCarre getCategorieCarre() {
        return categorieCarre;
    }

    public void setCanBeReserved(String canBeReserved) {
        this.canBeReserved = canBeReserved;
    }

    public String getCouvertureProduit2() {
        return couvertureProduit2;
    }

    public void setCouvertureProduit1(String couvertureProduit1) {
        this.couvertureProduit1 = couvertureProduit1;
    }

    public String getNombreDemandeProduit() {
        return nombreDemandeProduit;
    }

    public void setCanVisibleOnMarketplace(String canVisibleOnMarketplace) {
        this.canVisibleOnMarketplace = canVisibleOnMarketplace;
    }

    public String getNombreMinimumCommande() {
        return nombreMinimumCommande;
    }

    public void setCouvertureProduit2(String couvertureProduit2) {
        this.couvertureProduit2 = couvertureProduit2;
    }


    public void setCategorieCarre(CategorieCarre categorieCarre) {
        this.categorieCarre = categorieCarre;
    }

    public String getIdCategorieCaree() {
        return idCategorieCaree;
    }


}
