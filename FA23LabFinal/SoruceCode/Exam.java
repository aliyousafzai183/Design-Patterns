public class Exam {
    private ExamStrategy strategy;

    public Exam(ExamStrategy strategy) {
        this.strategy = strategy;
    }

    public void performExam() {
        strategy.performExam();
    }
}
