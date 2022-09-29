import textio.TextIO;

public class SimpleParser2 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n\nEnter a fully parenthesized expression,");
            System.out.println("or press return to end.");
            System.out.print("\n?  ");
            TextIO.skipBlanks();
            if ( TextIO.peek() == '\n' )
                break;
            try {
                double val = expressionValue();
                TextIO.skipBlanks();
                if ( TextIO.peek() != '\n' )
                    throw new ParseError("Extra data after end of expression.");
                TextIO.getln();
                System.out.println("\nValue is " + val);
            }
            catch (ParseError e) {
                System.out.println("\n*** Error in input:    " + e.getMessage());
                System.out.println("*** Discarding input:  " + TextIO.getln());
            }return;
        }

        System.out.println("\n\nDone.");
    }

    private static class ParseError extends Exception {
        ParseError(String message) {
            super(message);
        }
    }
    /**
     * Read an expression from the current line of input and return its value.
     * @throws ParseError if the input contains a syntax error
     */
    private static double expressionValue() throws ParseError {
        TextIO.skipBlanks();
        boolean negative;  // True if there is a leading minus sign.
        negative = false;
        if (TextIO.peek() == '-') {
            TextIO.getAnyChar();  // Read the minus sign.
            negative = true;
        }
        double val;  // Value of the expression.
        val = termValue();  // Read and evaluate the first term.
        if (negative)
            val = -val;  // Apply the leading minus sign to the first term.
        TextIO.skipBlanks();
        while ( TextIO.peek() == '+' || TextIO.peek() == '-' ) {
            // Read the next term and add it to or subtract it from
            // the value of previous terms in the expression.
            char op = TextIO.getAnyChar();  // Read the operator.
            double nextVal = termValue();    // Read and evaluate the next term.
            if (op == '+')
                val += nextVal;
            else
                val -= nextVal;
            TextIO.skipBlanks();
        }
        return val;
    } // end expressionValue()

    /**
     * Read a term from the current line of input and return its value.
     * @throws ParseError if the input contains a syntax error
     */
    private static double termValue() throws ParseError {
        TextIO.skipBlanks();
        double val;
        val = factorValue();
        TextIO.skipBlanks();
        while ( TextIO.peek() == '*' || TextIO.peek() == '/' ) {
            // Read the next factor, and multiply or divide
            // the value-so-far by the value of this factor.
            char op = TextIO.getAnyChar();
            double nextVal = factorValue();
            if (op == '*')
                val *= nextVal;
            else
                val /= nextVal;
            TextIO.skipBlanks();
        }
        return val;
    } // end termValue()


    /**
     * Read a factor from the current line of input and return its value.
     * @throws ParseError if the input contains a syntax error
     */
    private static double factorValue() throws ParseError {
        TextIO.skipBlanks();
        char ch = TextIO.peek();
        if ( Character.isDigit(ch) ) {
            // The factor is a number.
            return TextIO.getDouble();
        }
        else if ( ch == '(' ) {
            // The factor is an expression in parentheses.
            TextIO.getAnyChar();  // Read the "("
            double val = expressionValue();
            TextIO.skipBlanks();
            if ( TextIO.peek() != ')' )
                throw new ParseError("Missing right parenthesis.");
            TextIO.getAnyChar();  // Read the ")"
            return val;
        }
        else if ( ch == '\n' )
            throw new ParseError("End-of-line encountered in the middle of an expression.");
        else if ( ch == ')' )
            throw new ParseError("Extra right parenthesis.");
        else if ( ch == '+' || ch == '-' || ch == '*' || ch == '/' )
            throw new ParseError("Misplaced operator.");
        else
            throw new ParseError("Unexpected character \"" + ch + "\" encountered.");
    } // end factorValue()
}
