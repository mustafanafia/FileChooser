import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileChooser1 {
   public static void main(String[] args) {
        

          try {
        

    JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    

    int returnValue = jfc.showOpenDialog(null);                     // int returnValue = jfc.showSaveDialog(null);
        
    BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(jfc.getSelectedFile()), "UTF8"));
    
    String str;                                         //Creating a variable str
            while ((str = in.readLine()) != null) {            //While loop to read each line

		if (returnValue == JFileChooser.APPROVE_OPTION) {
		File selectedFile = jfc.getSelectedFile();
		 System.out.println(str);
		 Thread.sleep(13000);
		 
		 System.out.println("Last sentence has been posted: " + str);
                
              

            }   
             
        }

            in.close();
        }                                              //in object of buffer

        catch (UnsupportedEncodingException e)          //Catch errors
        {
            System.out.println(e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }                                               //main
}              
			
	

