
package com.jyoti.emp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CompanyModel {

    @SerializedName("companyName")
    @Expose
    private String companyName;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("establishment_year")
    @Expose
    private String establishment_year;
    @SerializedName("isoCertified")
    @Expose
    private String isoCertified;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public String getEstablishment_year() {
		return establishment_year;
	}

	public void setEstablishment_year(String establishment_year) {
		this.establishment_year = establishment_year;
	}

	public String getIsoCertified() {
        return isoCertified;
    }

    public void setIsoCertified(String isoCertified) {
        this.isoCertified = isoCertified;
    }

}
