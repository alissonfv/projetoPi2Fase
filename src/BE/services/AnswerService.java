package BE.services;
import BE.domain.Alternative;
import BE.domain.Answer;
import java.util.ArrayList;
import java.util.List;

public class AnswerService {
    List<Answer> answers = new ArrayList<>();

    public Answer createAnswer(/*Student student, */Alternative alternative) {
        Answer tempAnswer = new Answer(/*student, */alternative);
        answers.add(tempAnswer);
        return tempAnswer;
      }
}
