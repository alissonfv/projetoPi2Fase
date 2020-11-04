package BE.domain;

public class Answer {
    private Alternative alternative;
    // private Duel duel;

    public Answer(Alternative alternative/*, Duel duel*/) {
        this.alternative = alternative;
    }

    public Alternative getAnswer() {
        return this.alternative;
    }
}
