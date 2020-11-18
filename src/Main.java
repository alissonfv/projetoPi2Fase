import BE.domain.Alternative;
import BE.domain.Answer;
import BE.domain.Question;
import BE.services.AlternativeService;
import BE.services.AnswerService;
import BE.services.QuestionService;
import FE.CreatQuestFront;
import FE.FrontQuest;
import FE.HomeFrame;
import javax.swing.JFrame;

public class Main {

  public static void main(String[] args) {

    QuestionService questionService = new QuestionService();
    AnswerService answerService = new AnswerService();
    AlternativeService alternativeService = new AlternativeService();

    Question question = questionService.createQuestion("1", "1");
    Alternative alternative1 = alternativeService.createAlternative(1, question, "4", true, false);
    Alternative alternative2 = alternativeService.createAlternative(1, question, "3", false, false);
    Alternative alternative3 = alternativeService.createAlternative(1, question, "2", false, false);
    Alternative alternative4 = alternativeService.createAlternative(1, question, "5", false, false);

    Question question1 = questionService.createQuestion("1", "1");

    System.out.println(question.toString());

    System.out.println(questionService.getQuestions().get(0));

    System.out.println(questionService.getQuestions().size());

    questionService.deleteQuestion(question);

    System.out.println(questionService.getQuestions().size());

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

//   PARTE VICTOR FRONT END
    JFrame frame = null;
   // frame = new HomeFrame();
    frame = new CreatQuestFront();
    frame.setVisible(true);

  }
}
