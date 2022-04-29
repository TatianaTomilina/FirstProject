public class Worker extends Person {

    private int salary;

    public Worker(String name, int age, char gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getName() {
        if (getGender() == 'M') {
            return  "Mr. " + super.getName();
        } else {
            return  "Mrs. " + super.getName();
        }
    }
}

