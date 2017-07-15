/**
 * Created by Jason on 7/15/17.
 */
// to handle byte streams
import java.io.*;
import org.apache.commons.io.*;
public class streams {

    public static void main(String[] args) throws IOException {
//        File initialFile = new File("filestreamTest.txt");
//        InputStream targetStream = FileUtils.openInputStream(initialFile);
//
//        File outputFile = new File("output.txt");
//        OutputStream output = FileUtils.openOutputStream(outputFile);
//        IOUtils.copy(targetStream,output);

        File inputFile = new File("filestreamTest.txt");
        InputStream targetStream = FileUtils.openInputStream(inputFile);

        printByteArrayToFile("fsTestOutput.txt", convertToByteArray(targetStream));
    }

    public static byte[] convertToByteArray(InputStream stream) {
        byte[] b = null;
        try {
            b = IOUtils.toByteArray(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return b;
    }

    public static void printByteArrayToFile(String pathname, byte[] b) {
        try {
            FileUtils.writeByteArrayToFile(new File(pathname), b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
