package quiz;

public class QuizRunner {
    private static final Quiz quiz = new Quiz();
    public static void main(String[] args) {

        String q1 = "How many main ingredients make beer?";
        Choice[] q1Choices = new Choice[] {
                new Choice("10"),
                new Choice("4", true),
                new Choice("18"),
                new Choice("50")
        };
        MultipleChoice question1 = new MultipleChoice(q1, q1Choices);

        String q2 = "Lagers are more difficult to brew than ales. ";
        Choice[] q2Choices = new Choice[] {
                new Choice("True", true),
                new Choice("False")
        };
        TrueFalse question2 = new TrueFalse(q2, q2Choices);

        quiz.addQuestions(new Question[] {question1, question2});

        quiz.runQuiz();

        System.out.println("\nYou answered " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thank you for playing!\n"
        );
    }
}