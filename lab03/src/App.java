import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import checker.*;
import parser.*;

public class App {

	public static void main(String[] args) throws IOException {

		if (args.length==0) { System.err.println("usage: java App <file.ez>"); System.exit(1); }
		// create a CharStream that reads from standard input
		// CharStream input = CharStreams.fromStream(System.in);
		CharStream input = CharStreams.fromFileName(args[0]);
		// create a lexer that feeds off of input CharStream
		EZLangLexer lexer = new EZLangLexer(input);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer
		EZLangParser parser = new EZLangParser(tokens);
		ParseTree tree = parser.program(); // begin parsing at init rule
		// System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		if (parser.getNumberOfSyntaxErrors()==0)
		{
			// visita
			SemanticChecker v = new SemanticChecker();
			v.visit(tree);

			System.out.println("PARSE SUCCESSFUL!\n\n");
			v.printStrings();
			System.out.println("\n");
			// v.printSymbols();
			// System.out.println("\n");
		}
    }
}
