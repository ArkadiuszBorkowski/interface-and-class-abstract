package ex1;

class FullTimeEmployee extends Employee{

    public static final double YEARLY_BONUS = 0.05;
    private double baseSalary;

    public FullTimeEmployee(String firstName, String lastName, double baseSalary) {
        super(firstName, lastName);
        this.baseSalary = baseSalary;
    }



    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    double getMonthlySalary() {
        return baseSalary;
    }

    @Override
    double getYearlySalary() {
        double yearlyBaseSalary = baseSalary * NO_OF_MONTH;
        double bonus = yearlyBaseSalary * YEARLY_BONUS;
        return yearlyBaseSalary + bonus;
    }
}
