package Exception;

import java.io.File;
import java.io.FileInputStream;

public class CheckedException {

	
		    public void readFile() {
		        String fileName = "file does not exist";
		        File file = new File(fileName);
		        FileInputStream stream = new FileInputStream(file);
		    }
	}


