package pl.edu.agh.interpreter.main.statements;

/**
 * @author Filip Piwosz
 */
class ComparisonExecutioner {
    private ComparisonExecutioner() {
    }

    static boolean calculateComparison(String operation, Integer first, Integer second) {
        return switch (operation) {
            case "=" -> second.compareTo(first) == 0;
            case ">" -> second.compareTo(first) > 0;
            case "<" -> second.compareTo(first) < 0;
            case ">=" -> second.compareTo(first) >= 0;
            case "<=" -> second.compareTo(first) <= 0;
            default -> throw new IllegalArgumentException();
        };
    }
}
