package BE.domain;

public class Alternative {
    private int id;
    private Question question;
    private String alternative;
    private boolean accepted; // proponho alterar para rigthAlternative (alternativa certa)
    private boolean deleted;

    public Alternative(int id, Question question, String alternative, boolean accepted, boolean deleted) {
        this.id = id;
        this.question = question;
        setAlternative(alternative);
        setAccepted(accepted);
        setDeleted(deleted);
    }

    public int getId() {
        return this.id;
    }

    public int getAlternativeQuestionId() {
        return this.question.getId();
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    public String getAlternative() {
        return this.alternative;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public boolean getAccepted() {
        return this.accepted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean getDeleted() {
        return this.deleted;
    }

    public Question getAlternativeQuestion() {
        return this.question;
    }

    @Override
    public String toString() {
        return String.format("Resposta à questão '%s': '%s'\n", 
                            getAlternativeQuestion().getQuestion(), 
                            getAlternative());
    }
    

}
