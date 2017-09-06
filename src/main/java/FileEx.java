import java.io.*;

public class FileEx {
    public static void main(String[] args) {
        String fileName = "file.txt";
        DataOutputStream outputStream = null;
        try {
            outputStream = new DataOutputStream(new FileOutputStream(fileName));
            outputStream.writeInt(5);
            outputStream.writeBoolean(false);
            outputStream.writeDouble(5.1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (outputStream == null) return;
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        DataInputStream inputStream = null;
        try {
            inputStream = new DataInputStream(new FileInputStream(fileName));
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (inputStream == null) return;
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

