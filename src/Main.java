import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CopyAndWriteFile f = new CopyAndWriteFile();
        System.out.println("nhap vao source path: ");
        Scanner scanner = new Scanner(System.in);
        String sourcePath = scanner.nextLine();

        System.out.println("Moi nhap vao target path: ");
        String targetPath = scanner.nextLine();

        f.copyFileAndWrite(sourcePath, targetPath);
    }
}