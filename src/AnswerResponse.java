public interface AnswerResponse {
    void onWrong(String correctAnswer);

    void onRight();
}
