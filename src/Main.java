import AST.Program;
import Visitor.visitor;
import antler.TypeScriptLexer;
import antler.TypeScriptParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
        public static void main(String[] args) throws IOException {


                File folder = new File("C:\\Users\\hazem\\OneDrive\\Desktop\\4_2\\compiler2\\Files");
                File[] files = folder.listFiles();
                for (int i = 0; i < files.length; i++) {
                        String source = files[i].getPath();
                        CharStream cs = fromFileName(source);
                        TypeScriptLexer lexer = new TypeScriptLexer(cs);
                        CommonTokenStream token = new CommonTokenStream(lexer);
                        TypeScriptParser parser = new TypeScriptParser(token);
                        ParseTree tree = parser.program();
                        Program program = (Program) new visitor().visit(tree);
                        System.out.println(program);

                }
        }
}
