import java.io.File;

public class main {

    public static void parserDir(String path){
        File folder = new File(path);
        if(folder.isDirectory()){
            for(File item : folder.listFiles()){
                if(item.isDirectory()){
                    parserDir(String.valueOf((item)));
                }
                else{
                    //System.out.println(getFileExtension(item) );

                    String file = getFileExtension(item);
                    System.out.println(file);

                }
            }
        }
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }

    public static void main(String[] args) {

        parserDir("C:\\Users\\mishz\\IdeaProjects\\parserDirectories\\ПАО НКХП 2315014748");
    }
}
