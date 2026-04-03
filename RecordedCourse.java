//task2
interface RecordedCourse {
    void playVideo();
}

interface LiveCourse {
    void playVideo();
}

abstract class Course {
    abstract void startCourse();
}

class HybridCourse extends Course implements RecordedCourse, LiveCourse {

    @Override
    public void startCourse() {
        System.out.println("Hybrid course session started.");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing recorded and live session video.");
    }

    public static void main(String[] args) {
        HybridCourse course = new HybridCourse();
        course.startCourse();
        course.playVideo();
    }
}