//import java.util.*;
//
//import static jdk.vm.ci.sparc.SPARC.o2;
//
//class Student implements Comparator<Student>{
//    private	int age;
//    private	String name;
//
//    public Student(){
//
//    }
//
//    public	Student (int age, String name)	{
//        this.age = age;
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public int compare(Student o1, Student o2) {
//        int comp =o1.getAge() - o2.getAge() ;
//        if (comp != 0) return comp;
//        return o1.getName().compareTo(o2.getName()) ;
//    }
//}
//
//class test {
//    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(10, "Nam"));
//        students.add(new Student(20, "Long"));
//        students.add(new Student(20, "Linh"));
//        students.add(new Student(20, "An"));
//        //students.add(new Student(40, "Tung"));
//
//        for (Student i : students){
//            System.out.println(i.getName()+" "+i.getAge());
//        }
//
//        System.out.println("//");
//
//        Collections.sort(students, new Student());
////        Collections.sort(students, new Comparator<Student>() {
////            @Override
////            public int compare(Student o1, Student o2) {
////                int comp =o1.getAge() - o2.getAge() ;
////                if (comp != 0) return comp;
////                return o1.getName().compareTo(o2.getName()) ;
////            }
////        });
//        for (Student i : students){
//            System.out.println(i.getName()+" "+i.getAge());
//        }
//
////        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
////        list = list.stream().map(x -> 2*x)
//
////        students.sort(((o1-o2) -> (o1.getAge-o2.getAge)-o2.getAge()));
//
////        Collections.sort(students,
////                Comparator.comparing(Student::getAge).thenComparing(Student::getName));
////        students.stream().map(x -> x.getName()).forEach(System.out::println);
////    }
//}
//}
