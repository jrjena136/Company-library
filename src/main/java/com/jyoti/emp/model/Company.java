
package com.jyoti.emp.model;

import com.google.gson.annotations.Expose;

public class Company {

    @Expose
    private CompanyModel details;

    public CompanyModel getCompany() {
        return details;
    }

    public void setCompany(CompanyModel company) {
        this.details = company;
    }

}
