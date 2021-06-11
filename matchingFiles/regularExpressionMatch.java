package matchingFiles;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regularExpressionMatch {
    public void printCurrentWorkingDirectory1() {
        File userDirectory = new File("C:\\Users\\lavan\\IdeaProjects\\Assignments_java\\src\\assignment\\");
        System.out.println(userDirectory);
        String contents[] = userDirectory.list();
        File Filelist[] = userDirectory.listFiles();
        for (int i = 0; i < contents.length; i++) {
            if (Pattern.matches("assignment_[0-9].java", contents[i])) {
                System.out.println(Filelist[i].getAbsolutePath());
            }
        }

    }
}
