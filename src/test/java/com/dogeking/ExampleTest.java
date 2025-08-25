package com.dogeking;

import com.alibaba.fastjson2.JSON;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Scanner;

public class ExampleTest {


    @Test
    public void testForParse() {
        // 从资源文件读取SQL
        String sql = readSqlFromResource("sql_example/query.fql");
        FQLLexer lexer = new FQLLexer(CharStreams.fromString(sql));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);


        FQLParser parser = new FQLParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer,
                                    Object offendingSymbol,
                                    int line,
                                    int charPositionInLine,
                                    String msg,
                                    RecognitionException e) {
                System.out.println("line " + line + ":" + charPositionInLine + " at "
                        + offendingSymbol + ": " + msg);
            }
        });
        FQLParser.StatementsContext ast = parser.statements();
    }

    @Test
    public void testForSemantic() {
        //String sql = readSqlFromResource("sql_example/create_and_query.fql");
        String sql = readSqlFromResource("sql_example/error_create_and_query.fql");
        FQLLexer lexer = new FQLLexer(CharStreams.fromString(sql));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        FQLParser parser = new FQLParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer,
                                    Object offendingSymbol,
                                    int line,
                                    int charPositionInLine,
                                    String msg,
                                    RecognitionException e) {
                System.out.println("line " + line + ":" + charPositionInLine + " at "
                        + offendingSymbol + ": " + msg);
            }
        });
        FQLParser.StatementsContext ast = parser.statements();
        System.out.println("ast: " + ast);


        SemanticContext semanticContext = new SemanticContext(ast);
        ParseTreeWalker walker = new ParseTreeWalker();
        ColumnSemanticAnalyzer columnSemanticAnalyzer = new ColumnSemanticAnalyzer(semanticContext);
        walker.walk(columnSemanticAnalyzer, ast);
        System.out.println("columnSemanticAnalyzer work done. mapping: " + JSON.toJSON(semanticContext.getMetaDataMapping()));
    }


    private String readSqlFromResource(String resourceName) {
        String result;
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(resourceName);
        if (inputStream == null) {
            throw new IllegalArgumentException("找不到资源文件: " + resourceName);
        }
        try (Scanner scanner = new Scanner(inputStream)) {
            scanner.useDelimiter("\\A");
            result = scanner.hasNext() ? scanner.next() : "";
        }
        return result;
    }
}
