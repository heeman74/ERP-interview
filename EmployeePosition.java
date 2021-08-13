public class EmployeePosition {
    Boolean managerFlag;
    Boolean partimeFlag;

    public void setIsManager(Boolean isManager) {
        this.managerFlag = isManager;
    }

    public void setPartimer(Boolean partimeFlag) {
        this.partimeFlag = partimeFlag;
    }

    public Boolean isManager() {
        return managerFlag;
    }

    public Boolean isPartime() {
        return partimeFlag;

    }
}