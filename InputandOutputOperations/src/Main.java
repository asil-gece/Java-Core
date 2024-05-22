import javax.sound.midi.Soundbank;
import java.io.*;
import java.nio.file.*;
import java.util.RandomAccess;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Character based I/O Subclasses of Reader Class are below
        //InputStreamReader
        //BufferedReader
        //FileReader
        //FilterReader
        //StringReader
        //Character based I/O Subclasses of Writer Class are below
        //OutputStreamWriter
        //BufferedWriter
        //FileWriter
        //StringWriter
        //PrintWriter
        // Byte based I/O Subclasses of InputStream are belo
        //BufferedInputStream
        //DataInputStream
        //FilterInputStream
        //PrintStream
        //RandomAccessFile
        //FileInputStream
        //Byte based I/OO Subclasses of OutputStream are below
        //BufferedOutputStream
        //DataOutputStream
        //FileOutputStream
        //FilterOutputStream
        //If we are going to import java.io.* we can work with all these classes.

        // The syntax of File Class: File f = new File("The path of the file or the directory")
        //String path = "C:\\Nerd\\Byte\\java.txt"
        //File f = new File(path)

        String file_example1_path = "C:\\Users\\NERD BYTE ACADEMY\\Desktop\\file_example1.txt";
        File file_obj_1 = new File(file_example1_path);
        try {
            file_obj_1.createNewFile();
            System.out.println(file_obj_1.getName());
            System.out.println(file_obj_1.getAbsolutePath());
            file_obj_1.delete();
            System.out.println(file_obj_1.exists());
        } catch (IOException e) {
            System.out.println(e.toString());
        }


        File file_obj_2 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\NERD BYTE ACADEMY");
        file_obj_2.mkdir();
        file_obj_2.delete();
        System.out.println(file_obj_2.exists());
        File file_obj_3 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\NERD BYTE ACADEMY\\IO OPERATIONS");
        boolean checkDirectory_1 = file_obj_3.mkdir();
        if (checkDirectory_1 == true) {
            System.out.println("The directory has created");
        } else {
            System.out.println("The directory couldn't created");
        }
        boolean checkDirectory_2 = file_obj_3.mkdirs();
        if (checkDirectory_2 == true) {
            System.out.println("The directory has been created");
        } else {
            System.out.println("The directory couldn't created");
        }
        File file_obj_4 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\NERD BYTE ACADEMY\\IO OPERATIONS\\IO LESSON.txt");
        File file_obj_4_rename = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\NERD BYTE ACADEMY\\IO OPERATIONS\\IO LESSON2.txt");
        try {
            file_obj_4.createNewFile();
            file_obj_4.renameTo(file_obj_4_rename);
            if (file_obj_4.canRead() == true && file_obj_4.canWrite() == true) {
                System.out.println("This file can be read and can be written");
            }
            System.out.println(file_obj_4.getTotalSpace());
        } catch (IOException e) {
            System.out.println(e.toString());
        }

        //The syntax of creating an instance from File class is: File file_obj = new File("Director Path");
        // Path path_obj = Paths.get("Directory Path");
        // Path fileToPath = file.toPath(); ==> It is converted from file to path
        // File pathToFile = path.toFile(); ==> It is converted from path to file

        try {
            Path path_obj_1 = Paths.get("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\IO PATH CLASS.txt");
            Path newPathCreateFile = Files.createFile(path_obj_1);
        } catch (IOException ioe) {
            System.out.println("THE PATH DOESN'T EXIST" + ioe.toString());
        }

        try {
            Path path_obj_2 = Paths.get("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\PATHS AND FILES CLASS\\LESSON2\\LESSON3");
            Path newPathCreateDirectory = Files.createDirectories(path_obj_2);
        } catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
        try {
            File file_obj_5 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\FileToPath.txt");
            File file_obj_5_rename = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\PATHS AND FILES CLASS\\LESSON2\\LESSON3\\FileToPath.txt");
            file_obj_5.createNewFile();
            Path pathFile_obj_5 = file_obj_5.toPath();
            Path pathFile_obj_5_rename = file_obj_5_rename.toPath();
            Path newPathForFileToPath = Files.move(pathFile_obj_5, pathFile_obj_5_rename);
        } catch (IOException ioException) {
            System.out.println(ioException.toString());
        }
        try {

            Path path_delete = Paths.get("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\FileToPath");
            Files.delete(path_delete);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        try {
            Path path_delete_2 = Paths.get("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\IO PATH CLASS.txt");
            Files.delete(path_delete_2);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        try {
            Path path_delete_3 = Paths.get("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\FileToPathRenamed.txt");
            Files.delete(path_delete_3);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        try {
            Path path_delete_4 = Paths.get("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\FileToPath.txt");
            Files.delete(path_delete_4);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        try {
            Path path_delete_5 = Paths.get("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\PATHS AND FILES CLASS");
            Files.delete(path_delete_5);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        try {
            File file_obj_6 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\PATHS AND FILES CLASS");
            String[] list = file_obj_6.list();
            File[] listFiles = file_obj_6.listFiles();
            for (String items : list) {
                System.out.println(items);
            }
            for (File item : listFiles) {
                System.out.println(item);
            }
            Path path_obj_6 = file_obj_6.toPath();
            DirectoryStream<Path> paths = Files.newDirectoryStream(path_obj_6);
            for (Path path2 : paths) {
                System.out.println(path2);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            File file_obj_7 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\PATHS AND FILES CLASS");
            String absolutePath = file_obj_7.getAbsolutePath();
            System.out.println(absolutePath);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            Path path_obj_7 = Paths.get("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\PATHS AND FILES CLASS");
            Path absolutePath2 = path_obj_7.toAbsolutePath();
            System.out.println(absolutePath2);
        } catch (Exception e) {
            e.toString();
        }

        try {
            File file_obj_8 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\PATHS AND FILES CLASS");
            Path path_obj_8 = file_obj_8.toPath();
            boolean isFileExist = file_obj_8.exists();
            boolean isFileAFile = file_obj_8.isFile();
            boolean isFileADirectory = file_obj_8.isDirectory();
            boolean isFileHidden = file_obj_8.isHidden();
            boolean isFileBeAbleToRead = file_obj_8.canRead();
            boolean isFileBeAbleToWritten = file_obj_8.canWrite();
            boolean isFileExecutable = file_obj_8.canExecute();
            System.out.println(isFileExist + " " + isFileAFile + " " + isFileADirectory + " " + isFileHidden + " " + isFileBeAbleToRead
                    + " " + isFileBeAbleToWritten + " " + isFileExecutable);
            boolean isFileExist2 = Files.exists(path_obj_8);
            boolean isFileAFile2 = Files.isRegularFile(path_obj_8);
            boolean isFileADirectory2 = Files.isDirectory(path_obj_8);
            boolean isFileHidden2 = Files.isHidden(path_obj_8);
            boolean isFileBeAbleToRead2 = Files.isReadable(path_obj_8);
            boolean isFileBeAbleToWritten2 = Files.isWritable(path_obj_8);
            boolean isFileExecutable2 = Files.isExecutable(path_obj_8);
            System.out.println(isFileExist2 + " " + isFileAFile2 + " " + isFileADirectory2 + " " + isFileHidden2 + " " + isFileBeAbleToRead2 +
                    " " + isFileBeAbleToWritten2 + " " + isFileExecutable2);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        try {
            Path path_obj_9 = Files.createTempFile("Example", ".txt");
            Path otherPath = Paths.get(path_obj_9.toString());
            boolean isTheFileSame = Files.isSameFile(path_obj_9, otherPath);
            System.out.println(isTheFileSame);

            Path path_obj_10 = Files.createTempFile("Example", ".txt");
            isTheFileSame = Files.isSameFile(path_obj_9, path_obj_10);
            System.out.println(isTheFileSame);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        try {
            Path path_cities = Paths.get("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\Cities.txt");
            Path path_cities2 = Paths.get("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\Cities2.txt");
            long result = Files.mismatch(path_cities, path_cities2);
            if (result == -1L) {
                System.out.println("These are same files");
            } else
                System.out.println("These are not same files");
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        /*InputStreamReader isr = null;
        try {
            isr = new InputStreamReader(System.in);
            System.out.println("Please enter a text");
            int data = isr.read();
            while (data != -1) {
                char c = (char) data;
                data = isr.read();
                if (data == '\n') {
                    System.out.println("It is completed");
                    System.exit(0);
                }
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
           try {
               if (isr != null){
                   isr.close();
               }
           }catch (IOException e){
               System.out.println(e.toString());
           }
        }

        System.out.println("Please enter your text");
        InputStreamReader isr2 = null;
        try {
            isr2 = new InputStreamReader(System.in);
            char[] array = new char[1024];
            int byteData = isr2.read(array);

            if (byteData != -1){
                String text = new String(array,0,byteData);
                System.out.println("This is your text " + text);
            }
        }catch (IOException e){
            System.out.println(e.toString());
        }finally {
            try {
                if (isr2 != null){
                    isr2.close();
                }
            }catch (IOException e){
                System.out.println(e.toString());
            }
        }

        System.out.println("Please enter your text");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            String text2 = br.readLine();
            System.out.println("This is your text " + text2);
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
        File file_obj_7 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\Cites3.txt");
        char[] cities = new char[(int) file_obj_7.length()];
        FileReader fileReader_1 = null;
        try {
            fileReader_1 = new FileReader(file_obj_7);
            int dataByte = fileReader_1.read(cities);
            if (dataByte != -1) {
                String cities_String_Read = new String(cities, 0, dataByte);
                System.out.println("This is your file: " + '\n' + cities_String_Read);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (fileReader_1 != null) {
                    fileReader_1.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
        File file_obj_8 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\Cites3.txt");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file_obj_8));
            String cities_file;
            while ((cities_file = br.readLine()) != null){
                System.out.println(cities_file);
            }
        }catch (IOException e){
            System.out.println(e.toString());
        }finally {
            try {
                if (br != null){
                    br.close();
                }
            }catch (IOException e){
                System.out.println(e.toString());
            }
        }

        File file_obj_9 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\WitterClass.txt");
        FileWriter fileWriter_1 = null;
        try {
            fileWriter_1 = new FileWriter(file_obj_9);
            String writtenText = "This is an example";
            fileWriter_1.write(writtenText);
        }catch (IOException e){
            System.out.println(e.toString());
        }finally {
            try {
                if (fileWriter_1 != null){
                    fileWriter_1.close();
                }
            }catch (IOException e){
                System.out.println(e.toString());
            }
        }*/
        File file_obj_10 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\WitterClass.txt");
        FileInputStream read = null;
        try {
            read = new FileInputStream(file_obj_10);
            byte[] array = new byte[(int) file_obj_10.length()];
            read.read(array);
            String text_read = new String(array, 0, (int) file_obj_10.length());
            System.out.println(text_read);
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (read != null) {
                    read.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
        File file_obj_11 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\FileOutputStream.txt");
        FileOutputStream fos_1 = null;
        try {
            fos_1 = new FileOutputStream(file_obj_11);
            String text = "Hello Nerds, This is an example";
            byte[] array = text.getBytes();
            fos_1.write(array);
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (fos_1 != null) {
                    fos_1.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }

        File file_obj_12 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\FileOutputStream.txt");
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter(file_obj_12, false);
            bw = new BufferedWriter(fw);
            String text = "Hello, This is overridden";
            bw.write(text);
            bw.flush();
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
        File file_obj_13 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\FileOutputStream.txt");
        byte[] array = new byte[1024];
        BufferedInputStream bis_1 = null;
        try {
            FileInputStream fileInputStream_1 = new FileInputStream(file_obj_13);
            bis_1 = new BufferedInputStream(fileInputStream_1);
            int ByteData = bis_1.read(array);
            if (ByteData != -1) {
                String readText = new String(array, 0, ByteData);
                System.out.println(readText);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (bis_1 != null) {
                    bis_1.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
        File file_obj_14 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\BufferedOutPutStream.txt");
        BufferedOutputStream bos = null;
        try {
            bos = new BufferedOutputStream(new FileOutputStream(file_obj_14));
            String text = "Hello From The Earth";
            bos.write(text.getBytes());
            bos.flush();
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }

        try {
            Path path_obj_15 = Files.createTempFile("FilesWritingAndReading", "txt");
            String text = "Hello, I am writing the write string and read sting methods from the Files class";
            Files.write(path_obj_15, text.getBytes(), StandardOpenOption.WRITE);
            String read_1 = Files.readString(path_obj_15);
            System.out.println(read_1);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        File file_obj_16 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\ScannerClass.txt");
        try {
            Scanner scanner_1 = new Scanner(file_obj_16);
            while (scanner_1.hasNextLine()) {
                String data = scanner_1.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        File file_obj_17 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\ScannerClass.txt");
        try {
            Scanner scanner_2 = new Scanner(file_obj_17);
            System.out.println(scanner_2.hasNextInt());
        } catch (IOException e) {
            System.out.println(e.toString());
        }

        File file_obj_18 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\ScannerInt.txt");
        try {
            Scanner scanner_3 = new Scanner(file_obj_18);
            while (scanner_3.hasNextInt()) {
                int number = scanner_3.nextInt();
                if (number % 3 == 0) {
                    System.out.println(number);
                }
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        File file_obj_19 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\RandomAccessFile.txt");
        RandomAccessFile process_1 = null;
        try {
            process_1 = new RandomAccessFile(file_obj_19, "rw");
            byte data = process_1.readByte();
            System.out.println((char) data);

            String line_1 = process_1.readLine();
            System.out.println(line_1);

            process_1.seek(4);
            String line_2 = process_1.readLine();
            System.out.println(line_2);
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (process_1 != null) {
                    process_1.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
        File file_obj_20 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\RandAccessClass2.txt");
        RandomAccessFile process_2 = null;
        try {
            process_2 = new RandomAccessFile(file_obj_20, "rw");
            process_2.seek(17);
            byte[] changeData = "Earth".getBytes();
            process_2.write(changeData);
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (process_2 != null) {
                    process_2.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
        File file_obj_21 = new File("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\RandomAccessClass3.txt");
        RandomAccessFile process_3 = null;
        try {
            process_3 = new RandomAccessFile(file_obj_21, "rw");
            process_3.writeBytes("We are learning Java");
            System.out.println(process_3.getFilePointer());
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (process_3 != null) {
                    process_3.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
        Employee employee_1 = new Employee("Max", "Thunder");
        ObjectOutputStream objectOutputStream_obj_1 = null;
        FileOutputStream fileOutputStream_obj_1 = null;
        try {
            fileOutputStream_obj_1 = new FileOutputStream("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\Employees.txt");
            objectOutputStream_obj_1 = new ObjectOutputStream(fileOutputStream_obj_1);
            objectOutputStream_obj_1.writeObject(employee_1);
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (objectOutputStream_obj_1 != null) {
                    objectOutputStream_obj_1.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
            try {
                if (fileOutputStream_obj_1 != null) {
                    fileOutputStream_obj_1.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
        FileInputStream fileInputStream_obj_1 = null;
        ObjectInputStream objectInputStream_obj_1 = null;
        try {
            fileInputStream_obj_1 = new FileInputStream("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\Employees.txt");
            objectInputStream_obj_1 = new ObjectInputStream(fileInputStream_obj_1);
            Employee employee_2 =(Employee) objectInputStream_obj_1.readObject();
            System.out.println(employee_2.getName() + " " +employee_2.getLastname());
        }catch (Exception e){
            System.out.println(e.toString());
        } finally {
            try {
                if (fileInputStream_obj_1 != null){
                    fileInputStream_obj_1.close();
                }
            }catch (IOException e){
                System.out.println(e.toString());
            }
        try {
            if (objectInputStream_obj_1 != null){
                objectInputStream_obj_1.close();
            }
        }catch (IOException e){
            System.out.println(e.toString());
        }
        }
    Customer customer_1 = new Customer("Max","Thunder","abcd1234");
        try {
            FileOutputStream file_obj_22 = new FileOutputStream("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\Customer.txt");
            ObjectOutputStream o1_obj = new ObjectOutputStream(file_obj_22);
            o1_obj.writeObject(customer_1);
            o1_obj.close();
        }catch (Exception e){
            System.out.println(e.toString());
        }
    try {
        FileInputStream file_obj_23 = new FileInputStream("C:\\Users\\NERD BYTE ACADEMY\\Desktop\\Customer.txt");
        ObjectInputStream o_2 = new ObjectInputStream(file_obj_23);
        customer_1 =(Customer) o_2.readObject();
        System.out.println(customer_1.getName() + " " + customer_1.getLastName() + " " + customer_1.getCustomerID());
        o_2.close();
    }catch (Exception e){
        System.out.println(e.toString());
    }
    }
}
