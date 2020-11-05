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
    
    // retrieve
    // public void retrieveAnswer(Answer answer) {
    //     código para modificar a resposta da lista
    // }

    // delete
    public void deleteAnswer(Answer answer) {
        answers.remove(answer);
        System.out.printf("Questão removida: %s\n", answer.toString());
    }
}
