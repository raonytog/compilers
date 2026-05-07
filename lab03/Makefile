# Comando do compilador Java
JAVAC=javac
# Comando da JVM
JAVA=java
# ROOT é a raiz dos diretórios com todos os roteiros de laboratórios
ROOT=/home/rtgomes/Documents/compilers/lab03
# Caminho para o JAR do ANTLR em labs/tools
ANTLR_PATH=$(ROOT)/tools/antlr-4.13.2-complete.jar
# Opção de configuração do CLASSPATH para o ambiente Java
CLASS_PATH_OPTION=-cp .:$(ROOT)ezlanglexer/bin:$(ANTLR_PATH)
# Configuração do comando de compilação do ANTLR
ANTLR4=$(JAVA) -jar $(ANTLR_PATH)
# Configuração do ambiente de teste do ANTLR
GRUN=$(JAVA) $(CLASS_PATH_OPTION) org.antlr.v4.gui.TestRig
# Nome da gramática
GRAMMAR_NAME=EZLang
# Diretório para aonde vão os arquivos gerados
GEN_PATH=src/parser

# Executa o ANTLR e o compilador Java
all: antlr javac
	@echo "Done."
	
# Executa o ANTLR para compilar a gramática
antlr: $(GRAMMAR_NAME).g
	$(ANTLR4) -no-listener -visitor -o $(GEN_PATH) $(GRAMMAR_NAME).g

# Executa o javac para compilar os arquivos gerados
javac:
	$(JAVAC) -d bin $(CLASS_PATH_OPTION) src/*.java src/*/*.java $(GEN_PATH)/*.java

# Executa o lexer. Comando: $ make run FILE=arquivo_de_teste
run-tree:
#	cd $(GEN_PATH) && $(GRUN) $(GRAMMAR_NAME) program -tree -gui $(FILE)
	$(GRUN) parser.$(GRAMMAR_NAME) program -tree -gui test.ez

run-lexer:
	$(GRUN) parser.$(GRAMMAR_NAME) tokens -tokens $(FILE)

run: all
	java $(CLASS_PATH_OPTION) App good.ez

run-file: all
	java $(CLASS_PATH_OPTION) App $(FILE)

# Remove os arquivos gerados pelo ANTLR
clean:
	@rm -rf $(GEN_PATH)
	@rm -rf bin
