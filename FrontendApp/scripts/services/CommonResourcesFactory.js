'use strict';

hrApp.factory('CommonResourcesFactory', function() {
        var baseUrl = "http://localhost:8090/app/mvc/";
        return {
            findAllDepartmentsUrl: baseUrl + "departments/all",
            findAllEmployeesUrl: baseUrl + "employees/all",
            findAllJobsUrl: baseUrl + "jobs/all",
            findAllLocationsUrl: baseUrl + "locations/all",
            findOneDepartmentUrl: baseUrl + "departments/one",
            findOneEmployeeUrl: baseUrl + "employees/one",
            findOneJobUrl: baseUrl + "jobs/one",
            findOneLocationUrl: baseUrl + "locations/one",
            deleteDepartmentUrl: baseUrl + "departments/delete",
            deleteEmployeeUrl: baseUrl + "employees/delete",
            deleteJobUrl: baseUrl + "jobs/delete",
            deleteLocationUrl: baseUrl + "locations/delete",
            addDepartmentUrl: baseUrl + "departments/create",
            addEmployeeUrl: baseUrl + "employees/create",
            addJobUrl: baseUrl + "jobs/create",
            addLocationUrl: baseUrl + "locations/create",
            editDepartmentUrl: baseUrl + "departments/edit",
            editEmployeeUrl: baseUrl + "employees/edit",
            editJobUrl: baseUrl + "jobs/edit",
            editLocationUrl: baseUrl + "locations/edit"
        };
    }
);