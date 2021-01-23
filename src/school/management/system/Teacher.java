package school.management.system;

/**
 * this class is responsible for keeping the track of teachers name , id , salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;
    /**
     * this constructur Creates a new teacher object
     * @param id
     * @param name
     * @param salary
     */

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned =0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * adds to the salaryEarned
     * removes from the total money earned by ntic
     * @param salary
     */
    public void receiveSalary(int salary){
    salaryEarned +=salary;
    School.updateTotalMoneySpent(salary);
    }
    @Override
    public String toString() {
        return "teacher's name :"+name+" Total salary earned so far "+salaryEarned+"$";
    }

}
