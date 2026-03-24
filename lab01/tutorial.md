# Como executar o Lab 01:
## Definir as variáveis de ambiente
```
export CLASSPATH="/home/tog/github/compilers/lab01/tools/antlr-4.13.2-complete.jar:$CLASSPATH"
alias antlr4="java -jar /home/tog/github/compilers/lab01/tools/antlr-4.13.2-complete.jar"
alias grun="java org.antlr.v4.gui.TestRig"
```
<br>

## Como executar a gramática
#### Executando o ANTLR
```
antlr4 -o dir_saida gramatica1.g
```

#### Compilando os arquivos .java
```
javac ./dir_saida/*.java
```

#### Executando a gramática com:
1. entrada padrão
```
grun gramatica1 tokens-tokens
```

2. arquivo txt
```
grun gramatica1 tokens -tokens ./entrada.txt
```

Dica: use o arquivo Makefile para compilar e executar o programa, mudando apenas a gramatica a executar