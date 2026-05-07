package checker;

import java.util.LinkedHashSet;
import java.util.Set;
import tables.VarTable;
import typing.Type;

import parser.EZLangBaseVisitor;
import parser.EZLangParser;

public class SemanticChecker extends EZLangBaseVisitor<Void> {
	private Set<String> strings = new LinkedHashSet<>();
	private VarTable var = new VarTable();
	public void printStrings()
	{
		System.out.println("Strings table:");
		int i=0;
		for(String s : strings)
			System.out.printf("Entry %d -- \"%s\"\n", i++, s);
	}

	@Override 
	public Void visitVar_decl(EZLangParser.Var_declContext ctx) { 
		String id=ctx.ID().getSymbol().getText();
		int type=ctx.type_spec().start.getType();
		int line=ctx.type_spec().start.getLine();

		int r = var.lookupVar(id);
		if (r == -1) var.addVar(id, line, Type.BOOL_TYPE);
		else System.out.printf("SEMANTIC ERROR (%d): variable '%s' already declared at line %d\n", line, id, r);

		System.out.printf("Linha %d, incluir var %s de tipo %d na tabela de símbolos.\n", line, id, type);
		return visitChildren(ctx); 
	}

	@Override 
	public Void visitRead_stmt(EZLangParser.Read_stmtContext ctx) {
        System.out.printf("Linha %d, checar var %s na tabela de símbolos.\n", 
			ctx.ID().getSymbol().getLine(),
			ctx.ID().getSymbol().getText());
		return null;
	}

	@Override 
	public Void visitAssign_stmt(EZLangParser.Assign_stmtContext ctx) {
        System.out.printf("Linha %d, checar var %s na tabela de símbolos.\n", 
			ctx.ID().getSymbol().getLine(),
			ctx.ID().getSymbol().getText());
		return visitChildren(ctx); 
	}
	
	@Override 
	public Void visitExprId(EZLangParser.ExprIdContext ctx) {
        System.out.printf("Linha %d, checar var %s na tabela de símbolos.\n", 
			ctx.ID().getSymbol().getLine(),
			ctx.ID().getSymbol().getText());
        return null;
	}

	@Override
	public Void visitExprStrVal(EZLangParser.ExprStrValContext ctx)
	{
		String strVal=ctx.STR_VAL().getText();
		strings.add(strVal.substring(1,strVal.length()-1));
		return null;
	}
}
