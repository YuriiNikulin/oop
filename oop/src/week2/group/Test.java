package week2.group;

/**
 * Created by yurii on 21.09.2016.
 */
public class Test {

    public static void main(String[] args) {
        MyDate myDate = new MyDate(1995,04,11);
        Address address = new Address("UA","Kiev","peremogy sqr",34);

        Student student1 = new Student("Kolya",myDate,address,new Contact("099702123",null));
        Student student2 = new Student("Misha",myDate,new Address("UA","odesa","sdfasdf",34),new Contact("098765434",null));

        Group group =new Group("group1");

        group.addSudent(student1);
        group.addSudent(student2);


        System.out.println((group.getSize()==2)+" addStudent");

        Student found = group.findById(student1.getIdNum());
        System.out.println((found!=null)+" findById");

        Student[] res = group.findByCity("odesa");
        System.out.println((res!=null&&res.length==1)+" findByCity");

        Student[] byName = group.findByName("Misha");
        System.out.println((byName!=null&&byName.length==1)+" findByName");

        group.dellLastStudent();
        System.out.println((group.getSize()==1)+" dellLastStudent");

        group.addSudent(student2);

        System.out.println(group.allStudents());
    }
}
