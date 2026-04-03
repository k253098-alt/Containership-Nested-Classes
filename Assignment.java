//task 10
interface Assignments {
    void doAssignment();
}

interface Quizzes {
    void takeQuiz();
}

abstract class Course {
    abstract void startCourse();
}

class UniversityCourse extends Course implements Assignments, Quizzes {

    @Override
    void startCourse() {
        System.out.println("Course started.");
    }

    @Override
    public void doAssignment() {
        System.out.println("Assignment submitted.");
    }

    @Override
    public void takeQuiz() {
        System.out.println("Quiz completed.");
    }

    public static void main(String[] args) {
        UniversityCourse course = new UniversityCourse();
        course.startCourse();
        course.doAssignment();
        course.takeQuiz();

        Course guestInstructor = new Course() {
            void startCourse() {
                System.out.println("Guest instructor started special course.");
            }
        };

        guestInstructor.startCourse();
    }
}