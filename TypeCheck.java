import java.util.*;
public class TypeCheck
{
public static void main(String[] args){
TypeCheck strng = new Tyepecheck(System.in);
		String tc = strng.nextLine();
   		System.out.println("The type is a " + tc.typeCheck(strng));
}
   public static type typeCheck(Context c) {
        c.push();
        for (Stmt s: stmts) {
            s.typeCheck(c);
    	}
        c.pop();
    }
}
public class Plus extends BinaryExpr {
   Type typeCheck(String s) throws SemanticError {
        Type t1 = left.typeCheck(String ty1); // type-check subexpressions
            Type t2 = right.typeCheck(String ty2);
        if (t1.equals(intType) && t2.equals(intType)) {
            type = intType; // remember type for later
            return type;
        }
        if (t1.equals(stringType)) {
            type = stringType; // remember type for later
            return type;
        }
        throw new SemanticError("operator + expects an int or string");
    }
}
