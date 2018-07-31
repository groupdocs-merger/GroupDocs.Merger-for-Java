package com.groupdocs.merger.examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Properties;

import com.groupdocs.merger.licensing.License;
import com.groupdocs.merger.licensing.metered.Metered;

public class CommonUtilities {
	public final static String sourcePath = "./Data/Storage/";
	public final static String fileOne = "./Data/Storage/";
	public final static String fileTwo = "./Data/Storage/";
	public final static String outputPath = "./Data/Output/";
	public final static String publicKey = ""; // Your public license key
	public final static String privateKey = ""; // Your private license key
	public static final Path licensePath = getProjectBaseDir().resolve("GroupDocs.Total.Java.lic");

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
						String licPath = licensePath.toString();
			// Setup license
			License lic = new License();
			lic.setLicense(licensePath.toString());
			System.out.println(licensePath.toString());
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
}
