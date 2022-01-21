package pl.edu.agh.interpreter.main.statements;

/**
 * @author Filip Piwosz
 */
class ArithmeticExecutioner {
    private ArithmeticExecutioner() {
    }

    static Integer calculateArithmetic(String operation, Integer first, Integer second) {
        return switch (operation) {
            case "+" -> second + first;
            case "-" -> second - first;
            case "*" -> second * first;
            case "/" -> second / first;
            case "mod" -> second % first;
            default -> throw new IllegalArgumentException();
        };
    }
}
