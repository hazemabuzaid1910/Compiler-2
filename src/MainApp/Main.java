package MainApp;

import AST.Program;
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
import java.util.Objects;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
        public static check_Symantic_Error semanticError = new check_Symantic_Error();
        public static List<String> test = new ArrayList<>();
        public static List<String> testcheck = new ArrayList<>();
        public static int id_element = 0 ;
        public static void main(String[] args) throws IOException {
                File folder = new File("C:/Users/LENOVO/Desktop/compiler/compiler20/Compiler-2/Files");
                File[] files = folder.listFiles();
            for (File file : Objects.requireNonNull(files)) {
                String source = file.getPath();
                CharStream cs = fromFileName(source);
                TypeScriptLexer lexer = new TypeScriptLexer(cs);
                CommonTokenStream token = new CommonTokenStream(lexer);
                TypeScriptParser parser = new TypeScriptParser(token);
                ParseTree tree = parser.program();
                Program program = (Program) new visitor().visit(tree);
                semanticError.check_Errors();
                for (int k =0 ; k< semanticError.getE4().getSavemap().size();k++){
                    System.out.print(semanticError.getE4().getSavemap().get(k).getName()+"  ");
                    System.out.print(semanticError.getE4().getSavemap().get(k).getType()+"  ");
                    System.out.print(semanticError.getE4().getSavemap().get(k).printatt());
                    System.out.println();

                }
                System.out.println();
//                semanticError.getE4().getForequal().forEach((key, value) -> {
//                    System.out.println(key + " = " + value);
//                });

                for (int i = 0; i < semanticError.getE4().getCheck().size(); i++) {
                    System.out.println(
                            semanticError.getE4().getCheck().get(i).getName()+" "+
                            semanticError.getE4().getCheck().get(i).getValue()+" "+
                            semanticError.getE4().getCheck().get(i).getLine());
                }
                System.out.println();
                for (int i = 0; i < semanticError.getE5().getFor_list().size(); i++) {
                    System.out.println(  semanticError.getE5().getFor_list().get(i).getParent()+" "+
                            semanticError.getE5().getFor_list().get(i).getName()+" "+
                                    semanticError.getE5().getFor_list().get(i).getValue()+" "+
                                    semanticError.getE5().getFor_list().get(i).getLine());
                }
                System.out.println(program);

            }
        }
}
