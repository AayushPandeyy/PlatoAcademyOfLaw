package com.example.billNo;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;
import java.nio.file.*;	

public class App {
	public static String data;
			public static void main(String[] args) throws IOException {
//				Webcam wc = Webcam.getDefault();
//				wc.open();
				
					String text;
//					ImageIO.write(wc.getImage(), "PNG", new File("hello-world.png"));
					File myObj = new File("billNo.txt");
				      if (myObj.createNewFile()) {
				        System.out.println("File created: " + myObj.getName());
				        
				      }
				     
						Path filename = Path.of("billNo.txt");
						String filecontect = Files.readString(filename);
						if(filecontect=="") {
							Files.writeString(filename, "1");
							System.out.println(filecontect);
							data=filecontect;
						}else {
							text = String.valueOf(Integer.parseInt(filecontect)+1);
							Files.writeString(filename, text);
							System.out.println(filecontect);
							data=filecontect;
						}
				
				
				
				
				
				
			}
			
}

