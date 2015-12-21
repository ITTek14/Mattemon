package org.ittek14.mattemon.utility;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

public class FileUtil {
  public static FileFilter directoriesOnly = new FileFilter() {
    @Override
    public boolean accept(File pathname) {
      return pathname.isDirectory();
    }
  };
  public static FileFilter filesOnly = new FileFilter() {
    @Override
    public boolean accept(File pathname) {
      return pathname.isFile();
    }
  };
  
  public static File[] getAllSubdirectories(File f) {
    File[] dirs_in_root = f.listFiles(directoriesOnly);
    if(dirs_in_root == null) {
      return null;
    }else if(dirs_in_root.length <= 0){
      return null;
    }
    ArrayList<File> dirs = new ArrayList<File>();
    for(File dir : dirs_in_root){
      if(dir.isDirectory()){
        dirs.add(dir);
      }
    }
    for(int i = 0; i < dirs.size() ; i++){
      File[] subs = getAllSubdirectories(dirs.get(i));
      if(subs != null)
      {
        for(File sub : subs) {
          if(sub.isDirectory()){
            dirs.add(sub);
          }
        }
      }
    }
    File[] result = new File[dirs.size()];
    return dirs.toArray(result);
  }
}
