import BE.domain.*;
import BE.services.QuestionService;
import BE.domain.Alternative;

public class Main {

  public static void main(String[] args) {
    QuestionService questionService = new QuestionService();

    Question question = questionService.createQuestion(1,"1", "Quanto é 2 + 2", false);
    Alternative alternative1 = questionService.createAlternative(1, question, "4", true, false);
    Alternative alternative2 = questionService.createAlternative(1, question, "3", false, false);
    Alternative alternative3 = questionService.createAlternative(1, question, "2", false, false);
    Alternative alternative4 = questionService.createAlternative(1, question, "5", false, false);


    System.out.println(question.toString());

    System.out.println(alternative1);
    System.out.println(alternative2);
    System.out.println(alternative3);
    System.out.println(alternative4);


    //createAnswer

    Answer answer = questionService.createAnswer(/*student,*/alternative1);
    System.out.println(answer);
  }
}
