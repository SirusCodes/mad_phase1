import java.util.ArrayList;

abstract class Topic {

    abstract String getTopicName();

    abstract ArrayList<QuestionModel> getQuestionModels();
}

class Math extends Topic {

    @Override
    String getTopicName() {
        return "Math";
    }

    @Override
    ArrayList<QuestionModel> getQuestionModels() {
        ArrayList<QuestionModel> list = new ArrayList<>();
        ArrayList<String> options = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            options.add(String.valueOf(i));
        }

        for (int i = 0; i < 4; i++)
            list.add(new QuestionModel("1 is right", options, 1));
            // jay testing  
        return list;
    }
}