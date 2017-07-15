/**
 * Created by Jason on 7/15/17.
 */
// to handle byte streams
import java.io.*;
import org.apache.commons.io.*;
public class streams {



    public static void main(String[] args) throws IOException {
        File initialFile = new File("filestreamTest.txt");
        InputStream targetStream = FileUtils.openInputStream(initialFile);
        File outputFile = new File("output.txt");
        OutputStream output = FileUtils.openOutputStream(outputFile);
        IOUtils.copy(targetStream,output);

    }


}
