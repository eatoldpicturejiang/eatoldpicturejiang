package com.example 

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.JarFile
import java.util.jar.JarEntry 

public class filereader {
        public static boolean exists = 0; 

    public static void main (String[] args) {
        String currentDirectory = System.getProperty(“user.dir”);
        String fileName = currentDirectory + “.jar”; 
        File file = new File(fileName);

        if (file.exists()) {
            exists = true; 
        } else {
            System.err.println(“Can’t find the main program of minecraft!”);
            exists = false; 
            System.exit(1);  
        }
        
        
        
      }
}  