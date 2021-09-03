import java.io.File;

public class main {

    public static void parserDir(String path){
        File folder = new File(path);
        if(folder.isDirectory()){
            for(File item : folder.listFiles()){
                if(item.isDirectory()){
                    parserDir(String.valueOf((item)));
                    System.out.println(item + "  \t folder");

                }
                else{
                    System.out.println(item.getName() + "\t file");
                    
                }
            }
        }
    }

    public static void main(String[] args) {

        parserDir("C:\\Users\\mishz\\IdeaProjects\\parserDirectories\\ПАО НКХП 2315014748");
    }
}
