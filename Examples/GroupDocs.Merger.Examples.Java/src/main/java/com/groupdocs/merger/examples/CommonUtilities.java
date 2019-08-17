package com.groupdocs.merger.examples;

import java.awt.event.ItemEvent;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Map;
import java.util.Properties;

import com.groupdocs.merger.domain.DocumentInfo;
import com.groupdocs.merger.domain.format.FileFormat;
import com.groupdocs.merger.handler.DocumentHandler;
import com.groupdocs.merger.licensing.License;
import com.groupdocs.merger.licensing.metered.Metered;

public class CommonUtilities {
	public final static String sourcePath = "./Data/Storage/";
	public final static String fileOne = "./Data/Storage/";
	public final static String fileTwo = "./Data/Storage/";
	public final static String outputPath = "./Data/Output/";
	public final static String publicKey = ""; // Your public license key
	public final static String privateKey = ""; // Your private license key
	public static final String licensePath = "E://GroupDocs.Total.Java.lic";

	public static Path getProjectBaseDir() {
		Properties props = new Properties();
		try {
			InputStream i = CommonUtilities.class.getResourceAsStream("/project.properties");
			props.load(i);
		} catch (IOException x) {
			throw new RuntimeException(x);
		}
		return FileSystems.getDefault().getPath(props.getProperty("project.basedir"));
	}

	public static void applyLicenseFromFile() {
		// ExStart:applyLicenseFromFile
		try {
			// Setup license
			License lic = new License();
			lic.setLicense(licensePath);
		} catch (Exception exp) {
			System.out.println("Exception: " + exp.getMessage());
			exp.printStackTrace();
		}
		// ExEnd:applyLicenseFromFile
	}

	public static void applyLicenseFromStream(String filePath) {
		// ExStart:ApplyLicenseFromStreamObj
		try {
			// Obtain license stream
			FileInputStream licenseStream = new FileInputStream(filePath);
			// Setup license
			License lic = new License();
			lic.setLicense(licenseStream);
		} catch (Exception exp) {
			System.out.println("Exception: " + exp.getMessage());
			exp.printStackTrace();
		}
		// ExEnd:ApplyLicenseFromStreamObj
	}

	public static void meteredLicense() {
		// ExStart:meteredLicense
		try {
			// Setup license
			Metered metered = new Metered();
			metered.setMeteredKey(publicKey, privateKey);
		} catch (Exception exp) {
			System.out.println("Exception: " + exp.getMessage());
			exp.printStackTrace();
		}
		// ExEnd:meteredLicense
	}
	
	public static void saveDocument(ByteArrayOutputStream byteArrayStream, String fileName) {
		// ExStart:saveDocument
		byte[] bytes = byteArrayStream.toByteArray();
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(CommonUtilities.outputPath + fileName);
			fos.write(bytes, 0, bytes.length);
			fos.close();
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		// ExEnd:saveDocument
	}
	
	public static void getSupportedFormats() throws Exception {
		// ExStart:getSupportedFormats
		DocumentHandler handler = new DocumentHandler();
		Map<String, Long> documentFormatsContainer = handler.getSupportedFormats();
		for(Map.Entry<String, Long> item : documentFormatsContainer.entrySet())
		     System.out.println("Key:"+item.getKey()+"|Value:"+item.getValue());
		// ExEnd:getSupportedFormats
	}
	
	public static void getDocumentInformation(String fileName) throws Exception {
		// ExStart:getDocumentInformation
		DocumentHandler handler = new DocumentHandler();
		String sourceFile = sourcePath + fileName;
		String password = "somepassword";
		InputStream fileStream = new FileInputStream(sourceFile);

		// Get information about document
		DocumentInfo resultInfo = handler.getDocumentInfo(fileStream);

		// Get information about password protected document.
		DocumentInfo docInfo = new DocumentHandler().getDocumentInfo(fileStream, password);

		System.out.println("Size:"+resultInfo.getSize()+"|Pages:"+resultInfo.getPages());
	
		// ExEnd:getDocumentInformation
	}
}
