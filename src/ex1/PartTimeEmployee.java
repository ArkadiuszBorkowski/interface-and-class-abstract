package ex1;

class PartTimeEmployee extends Employee {

    private double hourlyWage;
    private int hours;

    public PartTimeEmployee(String firstName, String lastName, double hourlyWage, int hours) {
        super(firstName, lastName);
        this.hourlyWage = hourlyWage;
        this.hours = hours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    double getMonthlySalary() {
        return hours * hourlyWage;
    }

    @Override
    double getYearlySalary() {
        return getMonthlySalary() * NO_OF_MONTH;
    }

}
