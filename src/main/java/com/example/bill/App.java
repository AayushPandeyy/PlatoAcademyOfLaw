package com.example.bill;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;


public class App {
	public static void main(String[] args) throws IOException {
		String title = "Plato Academy of Law"; 
		int marginTop = 30; 

		PDDocument document = new PDDocument();
		PDPage page = new PDPage();
		document.addPage(page);
		PDPage mypage = document.getPage(0);

		PDPageContentStream stream = new PDPageContentStream(document, mypage);
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 20);
		stream.newLineAtOffset(250, 750);
		stream.showText(title);
		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 12);
		stream.newLineAtOffset(180, 720);
		stream.showText("Putalisadak, (Opposite to Shankerdev Campus), Kathmandu, Nepal");
		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(10+100, 690);
		stream.showText("SN");
		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(90+100, 690);
		stream.showText("ITEM");
		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(140+180, 690);
		stream.showText("PRICE");
		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(220+180, 690);
		stream.showText("QUANTITY");
		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(500, 690);
		stream.showText("AMOUNT");
		stream.endText();
		
//		stream.beginText();
//		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
//		stream.newLineAtOffset(50, 735);
//		stream.showText("PAN No : 109737522");
//		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(500, 740);
		stream.showText("Phone No : 984-5991110");
		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(20, 740);
		stream.showText("Bill No : "+com.example.billNo.App.data);
		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(110, 650);
		stream.showText("1");
		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(190, 650);
		stream.showText(com.example.Platoproject.mainPanel.text);
		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(320, 650);
		stream.showText(String.valueOf(com.example.Platoproject.mainPanel.price));
		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(400, 650);
		stream.showText("1");
		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(500, 650);
		stream.showText(String.valueOf(com.example.Platoproject.mainPanel.price));
		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(0, 625);
		stream.showText("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		stream.endText();
		
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(500, 600);
		stream.showText("Sub Total : "+String.valueOf(com.example.Platoproject.mainPanel.price));
		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(500, 560);
		stream.showText("Paid : "+String.valueOf(com.example.Platoproject.mainPanel.paidAmt));
		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(500, 520);
		stream.showText("Discount : "+String.valueOf(com.example.Platoproject.mainPanel.discountAmt));
		stream.endText();
		
		stream.beginText();
		stream.setFont(PDType1Font.TIMES_ROMAN, 10);
		stream.newLineAtOffset(500, 480);
		stream.showText("Grand Total : "+String.valueOf(com.example.Platoproject.mainPanel.price-com.example.Platoproject.mainPanel.discountAmt-com.example.Platoproject.mainPanel.paidAmt));
		stream.endText();
		
		String filename = com.example.Platoproject.mainPanel.filename+".pdf";
		stream.close();
		document.save(filename);
		try {
			File file = new File(filename);
			Desktop dk = Desktop.getDesktop();
			if(file.exists()) {
				dk.open(file);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
