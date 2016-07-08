package ro.teamnet.zth.appl.domain;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;

/**
 * Created by user on 7/8/2016.
 */
@Table(name="departments")
public class Department {
    @Id(name = "location_id")
    private Long id;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "location")
    private String location;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Department)
            if(id == ((Department)obj).getId())
                return true;
        return false;
    }

    @Override
    public String toString() {
        return "id: " + id + "; "+ "departmentName: " + departmentName + "; "+ "location: " + location  + "; ";
    }
}
