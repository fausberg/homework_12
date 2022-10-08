package task2;

import java.io.File;

public class Directory {

    public static void findFile(File dir) {
        File[] dirlist  = dir.listFiles();

        for(int i = 0; i < dirlist.length; i++) {
            if(dirlist[i].isFile()){
                System.out.println("Файл " + dirlist[i].getName());
            }
            if(dirlist[i].isDirectory()) {
                System.out.println("Директория " + dirlist[i].getName());
                findFile(dirlist[i]);
            }
        }
    }

}
