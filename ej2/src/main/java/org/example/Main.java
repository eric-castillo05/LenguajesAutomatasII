package org.example;

import org.antlr.v4.runtime.*;
import org.example.calc.calcLexer;
import org.example.calc.calcParser;

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
                calcLexer lexer = new calcLexer(CharStreams.fromString(input));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                calcParser parser = new calcParser(tokens);

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

                parser.p(); // Regla inicial

                System.out.println("Expresión válida según la gramática.\n");

            } catch (Exception e) {
                System.out.println("Error: la expresión no es válida.\n");
            }
        }
        scanner.close();
    }
}