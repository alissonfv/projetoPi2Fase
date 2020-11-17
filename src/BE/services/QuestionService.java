package BE.services;

import BE.domain.Question;
import java.util.ArrayList;
import java.util.List;

public class QuestionService {

  private static List<Question> questions = new ArrayList<>();

  public static Question createQuestion(Integer id, String idTeacher, String question, Boolean deleted) {
    Question question1 = new Question(id, idTeacher, question, deleted);
    questions.add(question1);
    return question1;
  }

  public static List<Question> getQuestions() {
    return questions;
  }

  public static void updateQuestion(Question question) {
    int index = questions.indexOf(question);
    if (index >= 0) {
      questions.set(index, question);
    }
  }

  public static void deleteQuestion(Question question) {
    questions.removeIf(x -> x.getId().equals(question.getId()));
    System.out.println("Questão removida , Id = " + question.getId());
  }

  public static List<Question> list() {
    return questions;
  }
}