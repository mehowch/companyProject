package com.rent.company.Service;

import com.rent.company.Domain.RentCompany;

public interface RentCompanyService {

    RentCompany createNewCompany();

    RentCompany addDepartmentToCompany();

    RentCompany removeDepartmentFromCompany();
}
