package lt.kucinskas.demobackend.model.employee;

public enum EmployeeRoles {

    USER ("User"),
    SQUAD_LEAD ("Squad Lead"),
    GROUP_LEAD ("Group Lead"),
    ADMINISTRATOR ("Administrator");

    private final String employeeRoleName;

    EmployeeRoles(String employeeRoleName) {
        this.employeeRoleName = employeeRoleName;
    }

    public String getEmployeeRoleName() {
        return employeeRoleName;
    }

}
