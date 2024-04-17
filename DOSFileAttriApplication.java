import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import static java.nio.file.FileVisitResult.*;
import java.nio.file.FileVisitResult;
import java.nio.file.attribute.BasicFileAttributes;
class D1 extends SimpleFileVisitor<Path> {
private Path file;
        private PathMatcher matcher;
    private int num;
  public D1(Path path, PathMatcher matcher) {
        file = path;
        this.matcher = matcher;
    }
  private void find(Path file) {
        Path name = file.getFileName();
        if (name != null && matcher.matches(name)) {
            num++;
            System.out.println(file);
        }
    }
    void done() {       
 System.out.println("Matched: " + num);
}
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
  find(file);
  return CONTINUE;
    }
    // Invoke the pattern matching
    // method on each directory.
    @Override
    public FileVisitResult preVisitDirectory(Path dir,
            BasicFileAttributes attrs) {
        find(dir);
        return CONTINUE;
    }
   @Override
    public FileVisitResult visitFileFailed(Path file,  IOException exc) {
                System.err.println(exc);
        return CONTINUE;
    }
}
 public class D {
    public static void main(String[] args) throws IOException {
        Path pathObj;
pathObj = Paths.get("D:/resources");
PathMatcher matcherObj = FileSystems.getDefault().getPathMatcher("glob:" + "*.java");
        D1 finder = new D1(pathObj, matcherObj);
        try {
            Files.walkFileTree(pathObj, finder);
  } catch (IOException ex) {
            System.out.println(ex);
}
}
}

    

