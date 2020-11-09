package com.groupdocs.merger.examples;

import java.io.File;
import java.nio.file.Paths;


public class Constants {

    public static boolean IsLicensed = false;

    public static String LicensePath = "C:/licenses/GroupDocs.Merger.lic";

  
    public static String SamplesPath = (System.getProperty("user.dir") + "\\Resources\\SampleFiles\\");
    public static String OutputPath = (System.getProperty("user.dir") + "\\Output\\");
    

    // Common
    public static String SAMPLE_NAME = "Sample";
    public static String SAMPLE_PASSWORD = "SomePasswordString";

    // Text
    public static String SAMPLE_TXT =  getSampleFilePath("Text/sample.txt");

    // Diagrams
    public static String SAMPLE_VSDX =
    getSampleFilePath("Diagram/sample.vsdx");

    // PDFs
    public static String SAMPLE_PDF_PROTECTED =
    getSampleFilePath("Pdf/sample_protected.pdf");
    public static String SAMPLE_PDF =
    getSampleFilePath("Pdf/sample.pdf");
    public static String SAMPLE_PDF_2 =
    getSampleFilePath("Pdf/sample_simple.pdf");


    // Presentations
    public static String SAMPLE_PPTX_PROTECTED =
    getSampleFilePath("Presentation/sample_protected.pptx");
    public static String SAMPLE_PPTX =
    getSampleFilePath("Presentation/sample.pptx");

    // Spreadsheets
    public static String SAMPLE_XLSX_PROTECTED =
    getSampleFilePath("Spreadsheet/sample_protected.xlsx");
    public static String SAMPLE_XLSX =
    getSampleFilePath("Spreadsheet/sample.xlsx");

    // Word Processing documents
    public static String SAMPLE_DOCX_PROTECTED =
    getSampleFilePath("WordProcessing/sample_protected.docx");
    public static String SAMPLE_DOCX =
    getSampleFilePath("WordProcessing/sample.docx");
    public static String SAMPLE_DOCX_2 =
    getSampleFilePath("WordProcessing/sample2.docx");
    public static String SAMPLE_DOCX_3 =
    getSampleFilePath("WordProcessing/sample3.docx");
    public static String SAMPLE_DOCX_4 =
    getSampleFilePath("WordProcessing/sample4.docx");
    public static String SAMPLE_DOCX_10_PAGES =
    getSampleFilePath("WordProcessing/sample-10-pages.docx");

    // Note documents
    public static String SAMPLE_ONE_PROTECTED =
    getSampleFilePath("Note/sample_protected.one");
    public static String SAMPLE_ONE =
    getSampleFilePath("Note/sample.one");

    // Images
    public static String SAMPLE_EMF =
    getSampleFilePath("Image/sample.emf");
    public static String SAMPLE_PNG =
    getSampleFilePath("Image/example1.png");
    public static String SAMPLE_BMP =
    getSampleFilePath("Image/example2.bmp");
    public static String SAMPLE_TIFF =
    getSampleFilePath("Image/example3.tiff");

    private static String getSampleFilePath(String filePath) {
        String test = SamplesPath;
        return new File(SamplesPath, filePath).getPath();
    }

    public static String getOutputDirectoryPath(String callerFilePath )
    {
        String outputDirectory = new File(OutputPath, callerFilePath).getPath();
        return outputDirectory;
    }
}