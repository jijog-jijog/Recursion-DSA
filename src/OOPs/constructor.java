package OOPs;

//public class constructor {
//    public static void main(String[] args) {
//
//        Students student1 = new Students();
//        Students student2 = new Students();
//
//        System.out.println(student1.name);
//        System.out.println(student2.name);
//
//    }
//}
//class Students{
//    int rollno = 10;
//    String name = "Jijo";
//    int mark = 17;
//
//    Students(){
//        this.rollno = 12;
//        this.name = "Ajay";
//        this.mark = 100;
//    }
//
//}

public class constructor {
    public static void main(String[] args) {

        Students student1 = new Students(11,"Ajin", 35);
        Students student2 = new Students();

        System.out.println(student1.name);
        System.out.println(student2.name);

    }
}
class Students{
    int rollno = 10;
    String name = "Jijo";
    int mark = 17;

    Students(){
        this(13, "alex", 22);
    }

    Students(int rolno, String name, int mark){
        this.rollno = rolno;
        this.name = name;
        this.mark = mark;
    }

}
