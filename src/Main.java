import BE.domain.*;
import BE.services.*;

public class Main {

  public static void main(String[] args) {
    QuestionService questionService = new QuestionService();
    AnswerService answerService = new AnswerService();
    AlternativeService alternativeService = new AlternativeService();

    Question question = questionService.createQuestion(1,"1", "Quanto é 2 + 2", false);
    Alternative alternative1 = alternativeService.createAlternative(1, question, "4", true, false);
    Alternative alternative2 = alternativeService.createAlternative(1, question, "3", false, false);
    Alternative alternative3 = alternativeService.createAlternative(1, question, "2", false, false);
    Alternative alternative4 = alternativeService.createAlternative(1, question, "5", false, false);

    alternativeService.deleteAlternative(alternative4);


    System.out.println(question.toString());

    System.out.println(alternative1);
    System.out.println(alternative2);
    System.out.println(alternative3);
    System.out.println(alternative4);


    // createAnswer

    Answer answer = answerService.createAnswer(/*student,*/alternative1);
    System.out.println(answer);
    
    // updateAnswer
    answer.setAlternativeAnswer(alternative4);
    System.out.println(alternative4);
    System.out.println(answer.getAlternativeAnswer());

    // deleteAnswer
    answerService.deleteAnswer(answer);
  }
}
