package week2.group;

/**
 * Created by yurii on 21.09.2016.
 */
public class Group {

    private String groupName;
    private int count = 0;
    private Student[] students = new Student[20];

    public Group(String groupName) {
        this.groupName = groupName;
    }


    public void addSudent(Student greenStudent) {
        students[count] = greenStudent;
        count++;
    }

    public void dellLastStudent() {
        count--;
        students[count] = null;
    }

    public Student findById(String id) {

        for (int i = 0; i < count; i++) {
            if (students[i].getIdNum() == id) {
                return students[i];
            }
        }
        return null;
    }

    public Student[] findByName(String name) {

        int j = 0;

        for (int i = 0; i < count; i++) {
            if (students[i].getName().equals(name)) {
                j++;
            }
        }

        Student[] res = new Student[j];
        for (int i = 0; i < j; i++) {
            if (students[i].getName().equals(name)) {
                res[j] = students[i];
            }
        }

        return res;
    }

    public Student[] findByCity(String city) {

        int j = 0;

        for (int i = 0; i < count; i++) {
            if (students[i].getAddress().getCity().equals(city)) {
                j++;
            }
        }
        Student[] res = new Student[j];
        for (int i = 0; i < j; i++) {
            if (students[i].getAddress().getCity().equals(city)) {
                res[j] = students[i];
            }
        }
        return res;
    }

    public String allStudents() {
        String res = "";

        for (int i = 0; i < count; i++) {
            res += students[i].studentToString()+"\n";
        }
        return res;
    }


    public int getSize() {
        return count;
    }

    public String getGroupName() {
        return groupName;
    }
}
