package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher abdo = new Teacher(1,"abdo",500);
        Teacher mounir = new Teacher(2,"mounir",700);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(abdo);
        teacherList.add(mounir);

        Student walid = new Student(1,"walid",5);
        Student oussama = new Student(2,"oussama",8);

        List<Student> studentList = new ArrayList<>();
        studentList.add(walid);
        studentList.add(oussama);

        School ntic = new School(teacherList,studentList);

        walid.payFees(700);
        oussama.payFees(900);
        System.out.println("ntic has earned "+ntic.getTotalMoneyEarned()+"$");

        System.out.println("---------------- Making NTIC pay teachers salary");

        mounir.receiveSalary(mounir.getSalary());

        System.out.println("NTIC has spent for salary to "+ mounir.getName()+
                " and now has "+ntic.getTotalMoneyEarned()+"$");

        System.out.println(mounir);

    }
}
