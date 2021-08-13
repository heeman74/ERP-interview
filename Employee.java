import java.util.Date;

// I wanted to minimize changing code as much as possible and extendable.
// So I added a EmployeePosition to add the position to the Employee.
// I first think about just adding the isPartime property but that will make the Employee class
// not extendable.  And having a inherient class for Manager and PartTime need break the code 
// for code the already using Employee class.
public class Employee {
    String name;
    Integer id;
    Date dateHired = new Date();
    EmployeePosition employeePosition = new EmployeePosition();

    Employee(String name, Integer id, Date dateHired, Boolean isManager, Boolean isPartime) {
        this.name = name;
        this.id = id;
        this.dateHired = dateHired;
        this.employeePosition.setIsManager(isManager);
        this.employeePosition.setPartimer(isPartime);
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

}
