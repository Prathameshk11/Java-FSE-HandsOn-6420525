public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.setStudentName("Prathamesh");
        controller.setStudentId("S101");
        controller.setStudentGrade("A");

        controller.updateView();

        controller.setStudentGrade("A+");
        controller.updateView();
    }
}
