importimport java.io.File;

public class main {

    public static void parserDir(String path){
        File folder = new File(path);
        if(folder.isDirectory()){
            for(File item : folder.listFiles()){
                if(item.isDirectory()){
                    parserDir(String.valueOf((item)));
                }
                else{
                    if(getFileExtension(item).equals("pdf")) System.out.println("PDF" + " " + item.getName());
                    else if (getFileExtension(item).equals("xls") |
                            getFileExtension(item).equals("xlsx")) System.out.println("XLS" + " " + item.getName());
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

        //parserDir("C:\\Users\\mishz\\IdeaProjects\\parserDirectories\\ПАО НКХП 2315014748");
        
        PathBuilder path = new PathBuilder();
        path.AddYear((short) 2021);
        path.AddQr((short) 1);
        path.pathByName("Бухгалтерская отчетность_форма 1");
        
    }
}
