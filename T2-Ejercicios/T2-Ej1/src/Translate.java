import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Translate {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        FileOutputStream f = new FileOutputStream("T2-Ejercicios/T2-Ej1/VowelOut.txt");
        System.setOut(new PrintStream(f));
        CharStream input = CharStreams.fromFileName("T2-Ejercicios/T2-Ej1/Vowel.txt");
        // create a lexer that feeds off of input CharStream
        VowelLexer lexer = new VowelLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        VowelParser parser = new VowelParser(tokens);
        parser.r();
        //System.out.println(); // print a \n after translation
    }
}
