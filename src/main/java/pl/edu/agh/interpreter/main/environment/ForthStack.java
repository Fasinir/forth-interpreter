package pl.edu.agh.interpreter.main.environment;

import pl.edu.agh.interpreter.main.environment.forthexceptions.StackUnderflowException;

import java.util.Deque;

/**
 * @author Filip Piwosz
 */
class ForthStack {
    private final Deque<Integer> stack;

    ForthStack(Deque<Integer> stack) {
        this.stack = stack;
    }

    void push(Integer i) {
        stack.addFirst(i);
    }

    Integer pop() throws StackUnderflowException {
        if (stack.isEmpty()) {
            throw new StackUnderflowException();
        }
        return stack.pop();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        stack.forEach(num -> builder.append(num).append("\n"));
        if (!stack.isEmpty()) {
            builder.delete(builder.length() - 1, builder.length());
        }
        return builder.toString();
    }
}
