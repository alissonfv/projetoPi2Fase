package BE.services;

import BE.domain.Question;
import java.util.ArrayList;
import java.util.List;

public class QuestionService {

  List<Question> questions = new ArrayList<>();

  public Question createQuestion(Integer id, String idTeacher, String question, Boolean deleted) {
    Question question1 = new Question(id, idTeacher, question, deleted);
    questions.add(question1);
    return question1;
  }

  public List<Question> getQuestions(){
    return questions;
  }

  public void deleteQuestionById(Question question){
    questions.removeIf(x -> x.getId().equals(question.getId())); // nao vai funcionar, devemos implementar equals. n funciona pq ele vai verificar se a claasse é igual. se for ele da como true.
    System.out.println("Questão removida , Id = " + question.getId());
  }
}