package school.management.system;
/*
this class will keep tracking of students fee,name,grade and fees paid
*

*/
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     *
     * @param grade Used to update the students grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     *
     * @param fees the fees the students pays
     * Keep adding the fees to feesPaid Field.
     *             add the fees to the feesPaid
     *             The school is going to recieve funds
     */
    public void updateFeesPaid(int fees){
        feesPaid = feesPaid + fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * pays the selected amount as fees to the school
     * @param fees
     */
     public void payFees(int fees){
        feesPaid +=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }


    public int getRemainingFees(){
        return feesTotal -feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name :"+name+"Total fees paid so far "+feesPaid+"$";
    }
}

