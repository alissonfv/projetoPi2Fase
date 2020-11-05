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

  
}