package BE.domain;

public class Question {

  private Integer id;
  private String idTeacher;
  private String question;
  private Boolean deleted;

  public Question(Integer id,String idTeacher, String question, Boolean deleted) {
    this.id = id;
    this.idTeacher = idTeacher;
    this.question = question;
    this.deleted = deleted;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public String getIdTeacher() {
    return idTeacher;
  }

  public void setIdTeacher(String idTeacher) {
    this.idTeacher = idTeacher;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}