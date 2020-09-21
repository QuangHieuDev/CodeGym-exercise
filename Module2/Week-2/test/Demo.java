public class Demo  implements Comparable<Demo>{
    private	int age;
    private	String name;
    public	Demo (int age, String name)	{
        this.age = age;
        this.name = name;
    }
    @Override
    public	int	compareTo(Demo	o)	{
        return	this.age - o.age;
    }
}
class Test{
    public static void main(String[] args) {
        Demo o1 = new Demo(15, "Z");
        Demo o2 = new Demo
        System.out.println(o1.compareTo());
    }
}
