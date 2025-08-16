package MainApp;

import AST.Program;
import Generation.Generator;
import Visitor.visitor;
import antler.TypeScriptLexer;
import antler.TypeScriptParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
        public static check_Symantic_Error semanticError = new check_Symantic_Error();
        public static int id_element = 0 ;
        public static void main(String[] args) throws IOException {
                File folder = new File("D:\\New folder (3)\\Compiler-2\\Files");
                File[] files = folder.listFiles();
            int i=0;
            for (File file : Objects.requireNonNull(files)) {

                i++;
                String source = file.getPath();
                CharStream cs = fromFileName(source);
                TypeScriptLexer lexer = new TypeScriptLexer(cs);
                CommonTokenStream token = new CommonTokenStream(lexer);
                TypeScriptParser parser = new TypeScriptParser(token);
                ParseTree tree = parser.program();
                Program program = (Program) new visitor().visit(tree);

                semanticError.check_Errors();
                Map<String,String> map = semanticError.getE6().getCheck_map().getMap();
                map.forEach((key, value) -> {
                    System.out.println(key + " => " + value);
                });
                System.out.println();
                Map<String,String> map1 = semanticError.getE6().get_Save_map().getMap();
                map1.forEach((key, value) -> {
                    System.out.println(key + " => " + value);
                });

                System.out.println(program);

                Generator generator = new Generator();

                generator.generate(program,"GeneratedCode"+i+".html");

                }
            }
    }
