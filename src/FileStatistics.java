import java.io.File;
import java.text.SimpleDateFormat;

public class FileStatistics {
    public static void main(String[] args) {
        try {
            // Specify the file path here
            File file = new File("C:\\xampp\\htdocs\\ProyectoFinal\\index.php");

            if (file.exists()) {
                // Getting file name
                String fileName = file.getName();

                // Getting folder name
                String folderName = file.getParent();

                // Getting file size in bytes
                long fileSize = file.length();

                // Formatting the last modification time
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                String lastModified = sdf.format(file.lastModified());

                // Displaying the information
                System.out.println("File Name: " + fileName);
                System.out.println("Folder Name: " + folderName);
                System.out.println("File Size: " + fileSize + " bytes");
                System.out.println("Last Modified: " + lastModified);
            } else {
                System.out.println("File does not exist.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
