package com.capgemini.filehandling.domain;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

public class BinaryInteger {

	public static int writeBinary(File file) {
		
		try(ObjectOutputStream objectOutput=new ObjectOutputStream(new FileOutputStream(file)))
	     {
			 Random random = new Random();
			 int n=100;

	       	  while(n!=0)
	       	  {
		       	  objectOutput.writeObject(random.nextInt());
		       	  n--;
	       	  }
	         }
	         catch(IOException e)
	         {
	       	  e.printStackTrace();
	         }

		return 1;
	}

}
