package quiz;

public class CheckBox extends Question {

    public CheckBox(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        return "\nCHOOSE ONE OR MORE:\n" +
                super.getQuestion() +
                super.getFormattedChoices();
    }
}
