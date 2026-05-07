package typing;
// Enumeração dos tipos primitivos que podem existir em EZLang.

import parser.EZLangLexer;

public enum EZLangType {
	INT_TYPE,
    REAL_TYPE,
    BOOL_TYPE,
    STR_TYPE;

    public static EZLangType getVarType(int lexerTokenType)
    {
		switch(lexerTokenType) {
			case EZLangLexer.INT:	return INT_TYPE;
			case EZLangLexer.REAL:  return REAL_TYPE;
			case EZLangLexer.BOOL:  return BOOL_TYPE;
			case EZLangLexer.STRING: return STR_TYPE;
		}
        return null;
    }

	public String toString() {
		switch(this) {
			case INT_TYPE:	return "int";
			case REAL_TYPE: return "real";
			case BOOL_TYPE: return "bool";
			case STR_TYPE: 	return "string";
		}
        return null;
	}
}