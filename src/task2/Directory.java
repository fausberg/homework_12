package task2;

import java.io.File;

public class Directory {

    public static void findFile(File dir) {
        File[] dirlist  = dir.listFiles();

        for(int i = 0; i < dirlist.length; i++) {
            if(dirlist[i].isFile()){
                System.out.println("Файл " + dirlist[i].getName() + " директории " + dir.getName());
                if(dirlist[i].length() == 0){
                    System.out.println("Файл пустой");
                }else{
                    System.out.println("В файле есть данные");
                }
            }
            if(dirlist[i].isDirectory()) {
                System.out.println("Директория " + dirlist[i].getName());
                File[] dirlist1 = dirlist[i].listFiles();
                if(dirlist1.length == 0){
                    System.out.println("Директория пуста");
                }else {
                    System.out.println("Файлы директории:");
                    findFile(dirlist[i]);
                }
            }
        }
    }

}
