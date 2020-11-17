package FE;
import BE.domain.Question;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class QuestionTableModel extends AbstractTableModel {
    private List<Question> questions = new ArrayList<>();
    private String[] columns = new String[] {"Id", "Id do Professor", "Questão"};

    public QuestionTableModel(List<Question> list) {
        this.questions = list;
    }

    @Override
    public String getColumnName(int column) {
        String columnName = null;

        if (column >= 0 && column <= columns.length) {
            columnName = columns[column];
        }

        return columnName;
    }

    @Override
    public int getRowCount() {
        return questions.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }


    // implementado apenzas porque é obrigatório, mas não iremos usar por enquanto
    @Override
    public Object getValueAt(int arg0, int arg1) {
        return null;
    }
}
