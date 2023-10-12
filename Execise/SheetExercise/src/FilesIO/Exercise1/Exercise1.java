/* 1) Write a java program to traverse a directory and count number of lines of each file in
that directory and print it. Assume that directory may contains another directories in it and so on
*/

package FilesIO.Exercise1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Exercise1 {
    public static void displayFiles(File[] files) throws IOException {
        for (File filename : files) {
            if (filename.isDirectory()) {
                System.out.println("\nDirectory: "
                        + filename.getName());

                displayFiles(filename.listFiles());
            }

            // Printing the file name present in given path
            else {
                // Getting the file name
                System.out.print("File: "
                        + filename.getName());
                // Counting No. of lines in a file
                long lines = Files.lines(filename.toPath()).count();
                System.out.println(" -> No. of lines : "+lines);
            }
        }
    }

    public static void main(String[] args) throws Exception{
        // Storing the name of files and directories
        // in an array of File type
        File[] files = new File("src/FilesIO/Exercise1/My").listFiles();

        // Calling method 1 to
        // display files
        displayFiles(files);
    }
}
