package com.example.webcam;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

public class App {
	public static void main(String[] args) throws IOException {
		Webcam wc = Webcam.getDefault();
		for(Dimension supportedSize:wc.getViewSizes()) {
			System.out.println(supportedSize.toString());
		}
//		wc.setViewSize(new Dimension(176,144));
		wc.setViewSize(WebcamResolution.QQVGA.getSize());
		wc.open();
		ImageIO.write(wc.getImage(), "PNG", new File("hello-world.png"));
	}
}
