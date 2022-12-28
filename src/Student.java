import java.util.Objects;

public class Student {

    private String name;
    private  int age;

    @Override
    public int hashCode(){
        return Objects.hash(age, name);
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age && Objects.equals(name, student.name);
    }

}
