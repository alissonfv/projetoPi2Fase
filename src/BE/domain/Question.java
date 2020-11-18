package BE.domain;

public class Question {

  private Integer id;
  private String idTeacher;
  private String question;
  private Boolean deleted;

  public Question(Integer id, String idTeacher, String question) {
    this.id = id;
    this.idTeacher = idTeacher;
    this.question = question;
    this.deleted = false;
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

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null) {
      return false;
    }

    if (this.getClass() != obj.getClass()) {
      return false;
    }

    Question question = (Question) obj;
    return this.id == question.id;

  }
}