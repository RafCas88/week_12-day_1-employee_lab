package staff.management;

public class Director extends Manager {

    private Double budget;

    public Director(String deptName, Double budget){
        super(deptName, budget);
        this.budget = budget;
    }
}
