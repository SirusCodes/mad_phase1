import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        ArrayList<Topic> topics = new ArrayList<>();
        topics.add(new Math());

        AnswerResponse answerResponse = new AnswerResponse() {
            @Override
            public void onWrong(String correctAnswer) {
                print(correctAnswer);
            }

            @Override
            public void onRight() {
                print("Congo");
            }
        };

        Util util = new Util(answerResponse);

        for (Topic topic : topics) {
            print(topic.getTopicName());
        }

        Scanner sc = new Scanner(System.in);

        int topicIndex = sc.nextInt();
        Topic userSelectedTopic = topics.get(topicIndex);
        ArrayList<QuestionModel> qModels = userSelectedTopic.getQuestionModels();

        for (QuestionModel questionModel : qModels) {
            print(questionModel.getQuestion());
            for (String option : questionModel.getOptions()) {
                print(option);
            }

            int userOption = sc.nextInt();
            util.checkAnswer(questionModel, userOption);
        }

        sc.close();
    }

    static void print(String value) {
        System.out.println(value);
    }
}
