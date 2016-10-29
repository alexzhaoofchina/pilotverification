package com.veris.omni.pilotVerification;


import java.io.File;
import java.io.FileFilter;
import java.util.function.Function;

public class FileFilterTest {

	public FileFilterTest(){
				
	}
	
	public static void getFileFilter(){





		System.out.println( "getFileFilter Start" );
		
        File dir = new File("D:/VerisPilot/pilotVerificationWorkspace/pilotVerification/");
        FileFilter directoryFilter = (File f) -> f.isDirectory();
        File[] dirs = dir.listFiles(directoryFilter);
        
        for(File file : dirs){
        	
        	System.out.println(file.getPath());
        }
        
        System.out.println("getFileFilter is over");
	}
	
	public static void getFileFilter2(){
		
		System.out.println( "getFileFilter2 Start" );
		
		File dir = new File("/");
		File[] dirs = dir.listFiles((File f) -> f.isDirectory());


        for(File file : dirs){
        	
        	System.out.println(file.getPath());
        }
		
		System.out.println("getFileFilter2 is over");
	}
	
	public static void getFileFilter3(){
		
		System.out.println( "getFileFilter3 Start" );
		
		File dir = new File("/");
		
		FileFilter directoryFilter = new FileFilter() {
		      public boolean accept(File file) {
		         return file.isDirectory();
		      }
		};
		
		File[] dirs = dir.listFiles(directoryFilter);
		
        for(File file : dirs){
        	
        	System.out.println(file.getPath());
        }
		
		System.out.println("getFileFilter3 is over");
	}
	
}
