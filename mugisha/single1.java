class Student extends Library {
    String name;

    Student(int id, String name) {
        super(id);
        this.name = name;
    }

    public static void main(String[] args) {
        Student student = new Student(1, "Pintu");
        System.out.println("Id = " + student.id + " Student Name = " + student.name);

    }
}
class Library 
{
    int id;

    Library(int id) {
        this.id = id;
    }
}

