public class Util {

    Util(AnswerResponse answerResponse) {
        this.answerResponse = answerResponse;
    }

    private AnswerResponse answerResponse;

    void checkAnswer(QuestionModel model, int selected) {
        if (model.getAnswer() == selected)
            answerResponse.onRight();
        else
            answerResponse.onWrong(model.getOptions().get(model.getAnswer()));
    }
}
