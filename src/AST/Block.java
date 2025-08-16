package AST;

import java.util.ArrayList;
import java.util.List;

public class Block implements Statement {
    List<Statements> statements = new ArrayList<>();


        public List<Statements> getStatements() {
            return statements;
        }

        public void setStatements(List<Statements> statements) {
            this.statements = statements;
        }

        @Override
        public String toString() {

            StringBuilder sb = new StringBuilder("Block {\n");

            // التأكد من أن كل عنصر في القائمة غير null قبل طباعته
            if (statements != null && !statements.isEmpty()) {
                for (Statements stmt : statements) {
                    if (stmt != null) {
                        sb.append("  ").append(stmt.toString().replace("\n", "\n    ")).append("\n");
                    }
                }
            } else {
                sb.append("  No statements\n");
            }

            sb.append("}");
            return sb.toString();
        }

    }

