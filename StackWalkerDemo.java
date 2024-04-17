import java.util.List;
import java.util.stream.Collectors;
import java.lang.StackWalker.StackFrame;
public class StackWalkerDemo {
   public static void main(String args[]) {
      final List<StackWalker.StackFrame> frames = StackWalker.getInstance().walk(g -> g.collect(Collectors.toList()));
      for(StackWalker.StackFrame stack : frames) {
         System.out.println(stack.getClassName() + "::" + stack.getMethodName() + ":" + stack.getLineNumber());
      }
   }
}
