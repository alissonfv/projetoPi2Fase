package BE.services;

import BE.domain.Question;
import java.util.ArrayList;
import java.util.List;

public class QuestionService {

  private static List<Question> questions = new ArrayList<>();

  public Question createQuestion(Integer id, String idTeacher, String question, Boolean deleted) {
    Question question1 = new Question(id, idTeacher, question, deleted);
    questions.add(question1);
    return question1;
  }

  public List<Question> getQuestions() {
    return questions;
  }

  public void updateQuestion(Question question) {
    int index = questions.indexOf(question);
    if (index >= 0) {
      questions.set(index, question);
    }
  }

  public void deleteQuestion(Question question) {
    questions.removeIf(x -> x.getId().equals(question.getId()));
    System.out.println("Questão removida , Id = " + question.getId());
  }

  public List<Question> List() {
    return questions;
  }
}