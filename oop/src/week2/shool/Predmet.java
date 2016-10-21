package week2.shool;

/**
 * Created by yurii on 23.09.2016.
 */
public class Predmet {
    private String name;
    private int hoursInSemester;
    private int hoursStudentWorked;
    private int studentMark;
    private int freePlace=0;

    public Predmet(String name, int hoursInSemester) {
        this.name = name;
        this.hoursInSemester = hoursInSemester;
        freePlace++;
    }

    public double Exam(){
        if (hoursInSemester==hoursStudentWorked){
            return studentMark;
        }
        return 0;
    }

    public String ToString(){
        return String.format("%s %s \n",name, hoursInSemester);
    }



    public int getFreePlace() {
        return freePlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursInSemester() {
        return hoursInSemester;
    }

    public void setHoursInSemester(int hoursInSemester) {
        this.hoursInSemester = hoursInSemester;
    }

    public int getHoursStudentWorked() {
        return hoursStudentWorked;
    }

    public void setHoursStudentWorked(int hoursStudentWorked) {
        this.hoursStudentWorked = hoursStudentWorked;
    }

    public int getStudentMark() {
        return studentMark;
    }

    public void setStudentMark(int studentMark) {
        this.studentMark = studentMark;
    }
}
