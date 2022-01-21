package pl.edu.agh.interpreter.main.statements;

import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.forthexceptions.ForthException;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Filip Piwosz
 */
public class ListOfStatements implements ForthStatement {
    private final List<ForthStatement> statements;

    public ListOfStatements(List<ForthStatement> statements) {
        this.statements = statements;
    }

    public void addStatement(ForthStatement statement) {
        this.statements.add(statement);
    }

    @Override
    public void execute(ForthEnvironment environment) {
        statements.forEach(forthStatement -> {
            try {
                forthStatement.execute(environment);
            } catch (ForthException e) {
                System.err.println(e.getMessage());
            }
        });
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("(");
        statements.forEach(stm -> builder.append(stm.toString()).append(", "));
        if (!statements.isEmpty()) {
            builder.delete(builder.length() - 2, builder.length());
        }
        builder.append(")");
        return builder.toString();
    }

    public Stream<ForthStatement> stream() {
        return statements.stream();
    }
}
