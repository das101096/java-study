package streamex;

import java.io.*;

public class ByteStreamCopyFile implements Serializable{
    private static final long serialVersionUID  = 1L;

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("b.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("b_copy.txt"))){

            String line = "";
            byte[] readBytes = new byte[10];

            while ((line = br.readLine()) != null) {
                bw.write(line);
            }
        }

    }
}
