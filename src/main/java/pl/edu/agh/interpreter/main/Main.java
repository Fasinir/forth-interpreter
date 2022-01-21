package pl.edu.agh.interpreter.main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pl.edu.agh.interpreter.antlr.ForthLexer;
import pl.edu.agh.interpreter.antlr.ForthParser;
import pl.edu.agh.interpreter.main.environment.ForthEnvironment;
import pl.edu.agh.interpreter.main.environment.ForthEnvironmentBuilder;
import pl.edu.agh.interpreter.main.statements.ListOfStatements;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Filip Piwosz
 */
public class Main {
    public static void main(String[] args) {
        ForthEnvironment environment = new ForthEnvironmentBuilder()
                .withMemoryMap(new HashMap<>(), 1000)
                .withDefaultNameMap()
                .withStack(new ArrayDeque<>())
                .get();

        if (args.length == 0) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            while (!input.equalsIgnoreCase("exit")) {
                performWalkWithUserInput(input, environment);
                input = scanner.nextLine();
            }
        } else if (args.length <= 2) {
            if (args.length == 2) {
                performWalkWithUserInput(args[1], environment);
            }
            try {
                performWalkFromFile(Path.of(args[0]), environment);
            } catch (IOException e) {
                System.err.println(e.getMessage());
                return;
            }

        } else {
            System.err.println("Invalid number of arguments!");
        }
    }

    private static void performWalkWithUserInput(String input, ForthEnvironment environment) {
        ForthLexer forthLexer = new ForthLexer(CharStreams.fromString(input));
        performWalk(forthLexer, environment);
        System.out.println("================");
        environment.printStack();
        System.out.println("================");
    }

    private static void performWalkFromFile(Path pathToFile, ForthEnvironment environment) throws IOException {
        ForthLexer forthLexer = new ForthLexer(CharStreams.fromPath(pathToFile));
        performWalk(forthLexer, environment);
    }

    private static void performWalk(ForthLexer forthLexer, ForthEnvironment environment) {
        CommonTokenStream tokenStream = new CommonTokenStream(forthLexer);
        ForthParser forthParser = new ForthParser(tokenStream);
        ParseTree tree = forthParser.forth();
        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener listener = new MyListener();
        walker.walk(listener, tree);
        ListOfStatements statements = listener.getTopList();
        statements.execute(environment);
        /*statements.stream()
                .forEach(System.out::println);*/
    }


}
