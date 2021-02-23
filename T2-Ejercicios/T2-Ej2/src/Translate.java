import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Translate {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        CharStream input = CharStreams.fromFileName("T2-Ejercicios/T2-Ej2/Multiplo.txt");
        FileOutputStream f = new FileOutputStream("T2-Ejercicios/T2-Ej2/MultiploOut.txt");
        System.setOut(new PrintStream(f));
        // create a lexer that feeds off of input CharStream
        MultiploLexer lexer = new MultiploLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        MultiploParser parser = new MultiploParser(tokens);
        parser.r();
        System.out.println(); // print a \n after translation
    }
}
