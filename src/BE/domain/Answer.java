package BE.domain;

public class Answer {
    private Alternative alternative;
    // private Duel duel;

    public Answer(Alternative alternative/*, Duel duel*/) {
        setAlternativeAnswer(alternative);
    }

    public Alternative getAnswer() {
        return this.alternative;
    }

    public void setAlternativeAnswer(Alternative alternative) {
        this.alternative = alternative;
    }

    public Alternative getAlternativeAnswer() {
        return this.alternative; 
    }
}
