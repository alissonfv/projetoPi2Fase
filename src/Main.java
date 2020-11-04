import BE.domain.Question;
import BE.services.QuestionService;

public class Main {

  public static void main(String[] args) {
    QuestionService questionService = new QuestionService();

    Question question = questionService.createQuestion(1,"1", "xxxx", false);

    System.out.println(question.toString());

  }
}
