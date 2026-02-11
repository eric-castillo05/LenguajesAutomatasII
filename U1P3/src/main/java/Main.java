
import g4.mainLexer;
import g4.mainParser;
import g4.myVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Ingrese una expresión matemática (o 'exit' para salir):");

        while (true) {
            System.out.print("> ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) break;

            try {
                // Crear lexer y parser
                mainLexer lexer = new mainLexer(CharStreams.fromString(input));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                mainParser parser = new mainParser(tokens);

                // Imprimir tokens
                tokens.fill();
                for (Token t : tokens.getTokens()) {
                    if (t.getType() != Token.EOF) {
                        String tokenName = lexer.getVocabulary().getSymbolicName(t.getType());
                        System.out.println("Token: " + tokenName + " -> " + t.getText());
                    }
                }

                // Intentar analizar según la regla principal "p"
                parser.removeErrorListeners();
                parser.addErrorListener(new DiagnosticErrorListener());

                parser.s(); // Regla inicial

                System.out.println("Expresión válida según la gramática.\n");

                tokens.seek(0);
                ParseTree tree = parser.s();
                myVisitor eval = new myVisitor();
                Integer ans = eval.visit(tree);
                System.out.println("Ans: " + ans);

            } catch (Exception e) {
                System.out.println("Error: la expresión no es válida.\n");
            }
        }
        scanner.close();
    }
}