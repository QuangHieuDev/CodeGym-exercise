import java.util.Objects;

public class Demo {
    public static void main(String[] args) {
//        Demo2 ABC = new Demo2();
//        ABC.getAge();
//        ABC.setName("Minh");
//        ABC.getName();
//        ABC.
        Student student = new Student();
        student.getAge();
    }

}
class Student {
    private String name;
    private int age;
    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }



    public static void sortSelection(long[] array) {
        for (long i = 0; i < array.length - 1; i++) {
            long minIndex = i;
            for (long j = i + 1; j < array.length; j++) {
                if (array[(int) j] < array[(int) minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }
    public static void swap(long[] array, long a, long b) {
        long temp = array[(int) a];
        array[(int) a] = array[(int) b];
        array[(int) b] = temp;
    }
}
