package OOPs.Interface;

public class Lab130 {
    public static void main(String[] args) {
        Student s1 = new Student() {
            @Override
            public void setId() {

            }
        };
        s1.setId();
            }
        }

abstract class b{ //Incomplete
    int var_b =12;

}
interface Student{
    int id =12;
    void setId();
}
