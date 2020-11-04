package BE.services;

import BE.domain.Question;
import BE.domain.Alternative;
import BE.domain.Answer;
import java.util.ArrayList;
import java.util.List;

public class QuestionService {

  List<Question> questions = new ArrayList<>();
  List<Alternative> alternatives = new ArrayList<>();
  List<Answer> answers = new ArrayList<>();

  public Question createQuestion(Integer id, String idTeacher, String question, Boolean deleted) {
    Question question1 = new Question(id, idTeacher, question, deleted);
    questions.add(question1);
    return question1;
  }

  public Alternative createAlternative(int id, Question question, String alternative, boolean accepted, boolean deleted) {
    Alternative tempAlternative = new Alternative(id, question, alternative, accepted, deleted);
    alternatives.add(tempAlternative);
    return tempAlternative;
  }

  public Answer createAnswer(/*Student student, */Alternative alternative) {
    Answer tempAnswer = new Answer(/*student, */alternative);
    answers.add(tempAnswer);
    return tempAnswer;
  }
}