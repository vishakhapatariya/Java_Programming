// FileOutputStream with Try-With-Resources

package FileInputOutputStream;

import java.io.FileOutputStream;

public class FileOutputDemoTWR {
    public static void main(String[] args) throws Exception {
        try (FileOutputStream fos = new FileOutputStream("/home/pp-8/Desktop/" +
                "vishakha/Java/Java_Programming/Projects/IOStreams/" +
                "src/FileInputOutputStream/test.txt");) {

            String str = "My Java Program";

            // Writing one byte at a time
            byte b[] = str.getBytes();
            for (byte x : b) {
                fos.write(x);
            }
            fos.write("\n".getBytes());

            // Writing all the bytes at a time
            fos.write(str.getBytes());
            fos.write("\n".getBytes());

            // Writing with giving offset and lenth
            fos.write(b, 3, str.length() - 3);
        }
    }
}
