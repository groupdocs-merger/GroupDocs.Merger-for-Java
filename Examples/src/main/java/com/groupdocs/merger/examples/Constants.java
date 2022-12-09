package com.groupdocs.merger.examples;

import java.io.File;
import java.nio.file.Paths;


public class Constants {

    public static boolean IsLicensed = false;

    public static String LicensePath = "c:\\License\\GroupDocs.Merger.Java.lic";

  
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
    getSampleFilePath("Image/sample1.png");
    public static String SAMPLE_BMP =
    getSampleFilePath("Image/sample2.bmp");
    public static String SAMPLE_TIF =
            getSampleFilePath("Image/sample4.tif");
    public static String SAMPLE_TIFF =
    getSampleFilePath("Image/sample3.tiff");

    private static String getSampleFilePath(String filePath) {
        String test = SamplesPath;
        return new File(SamplesPath, filePath).getPath();
    }

    public static String getOutputDirectoryPath(String callerFilePath )
    {
        String outputDirectory = new File(OutputPath, callerFilePath).getPath();
        return outputDirectory;
    }

    // CSV
    public static String SAMPLE_CSV = getSampleFilePath("Spreadsheet/sample.csv");
    public static String SAMPLE_CSV_2 = getSampleFilePath("Spreadsheet/sample.csv");

    // DOC
    public static String SAMPLE_DOC = getSampleFilePath("Wordprocessing/sample.doc");
    public static String SAMPLE_DOC_2 = getSampleFilePath("Wordprocessing/sample.doc");

    // DOCM
    public static String SAMPLE_DOCM = getSampleFilePath("Wordprocessing/sample.docm");
    public static String SAMPLE_DOCM_2 = getSampleFilePath("Wordprocessing/sample.docm");

    // DOT
    public static String SAMPLE_DOT = getSampleFilePath("Wordprocessing/sample.dot");
    public static String SAMPLE_DOT_2 = getSampleFilePath("Wordprocessing/sample.dot");

    // DOTM
    public static String SAMPLE_DOTM = getSampleFilePath("Wordprocessing/sample.dotm");
    public static String SAMPLE_DOTM_2 = getSampleFilePath("Wordprocessing/sample.dotm");

    // DOTX
    public static String SAMPLE_DOTX = getSampleFilePath("Wordprocessing/sample.dotx");
    public static String SAMPLE_DOTX_2 = getSampleFilePath("Wordprocessing/sample.dotx");

    // EPUB
    public static String SAMPLE_EPUB = getSampleFilePath("Ebook/sample.epub");
    public static String SAMPLE_EPUB_2 = getSampleFilePath("Ebook/sample.epub");

    // HTML
    public static String SAMPLE_HTML = getSampleFilePath("Web/sample.html");
    public static String SAMPLE_HTML_2 = getSampleFilePath("Web/sample.html");

    // MHT
    public static String SAMPLE_MHT = getSampleFilePath("Web/sample.mht");
    public static String SAMPLE_MHT_2 = getSampleFilePath("Web/sample.mht");

    // MHTML
    public static String SAMPLE_MHTML = getSampleFilePath("Web/sample.mhtml");
    public static String SAMPLE_MHTML_2 = getSampleFilePath("Web/sample.mhtml");

    // ODP
    public static String SAMPLE_ODP = getSampleFilePath("Presentation/sample.odp");
    public static String SAMPLE_ODP_2 = getSampleFilePath("Presentation/sample.odp");

    // ODS
    public static String SAMPLE_ODS = getSampleFilePath("Spreadsheet/sample.ods");
    public static String SAMPLE_ODS_2 = getSampleFilePath("Spreadsheet/sample.ods");

    // ODT
    public static String SAMPLE_ODT = getSampleFilePath("Wordprocessing/sample.odt");
    public static String SAMPLE_ODT_2 = getSampleFilePath("Wordprocessing/sample.odt");

    // ONE
    public static String SAMPLE_ONE_2 = getSampleFilePath("Note/sample.one");

    // OTP
    public static String SAMPLE_OTP = getSampleFilePath("Presentation/sample.otp");
    public static String SAMPLE_OTP_2 = getSampleFilePath("Presentation/sample.otp");

    // OTT
    public static String SAMPLE_OTT = getSampleFilePath("Wordprocessing/sample.ott");
    public static String SAMPLE_OTT_2 = getSampleFilePath("Wordprocessing/sample.ott");

    // PPS
    public static String SAMPLE_PPS = getSampleFilePath("Presentation/sample.pps");
    public static String SAMPLE_PPS_2 = getSampleFilePath("Presentation/sample.pps");

    // PPSX
    public static String SAMPLE_PPSX = getSampleFilePath("Presentation/sample.ppsx");
    public static String SAMPLE_PPSX_2 = getSampleFilePath("Presentation/sample.ppsx");

    // PPT
    public static String SAMPLE_PPT = getSampleFilePath("Presentation/sample.ppt");
    public static String SAMPLE_PPT_2 = getSampleFilePath("Presentation/sample.ppt");

    // PPTX
    public static String SAMPLE_PPTX_2 = getSampleFilePath("Presentation/sample.pptx");

    // RTF
    public static String SAMPLE_RTF = getSampleFilePath("Wordprocessing/sample.rtf");
    public static String SAMPLE_RTF_2 = getSampleFilePath("Wordprocessing/sample.rtf");

    // TEX
    public static String SAMPLE_TEX = getSampleFilePath("PageDescriptionLanguage/sample.tex");
    public static String SAMPLE_TEX_2 = getSampleFilePath("PageDescriptionLanguage/sample.tex");

    // TSV
    public static String SAMPLE_TSV = getSampleFilePath("Spreadsheet/sample.tsv");
    public static String SAMPLE_TSV_2 = getSampleFilePath("Spreadsheet/sample.tsv");

    // TXT
    public static String SAMPLE_TXT_2 = getSampleFilePath("Text/sample.txt");

    // VDX
    public static String SAMPLE_VDX = getSampleFilePath("Diagram/sample.vdx");
    public static String SAMPLE_VDX_2 = getSampleFilePath("Diagram/sample.vdx");

    // VSDM
    public static String SAMPLE_VSDM = getSampleFilePath("Diagram/sample.vsdm");
    public static String SAMPLE_VSDM_2 = getSampleFilePath("Diagram/sample.vsdm");

    // VSDX
    public static String SAMPLE_VSDX_2 = getSampleFilePath("Diagram/sample.vsdx");

    // VSSM
    public static String SAMPLE_VSSM = getSampleFilePath("Diagram/sample.vssm");
    public static String SAMPLE_VSSM_2 = getSampleFilePath("Diagram/sample.vssm");

    // VSSX
    public static String SAMPLE_VSSX = getSampleFilePath("Diagram/sample.vssx");
    public static String SAMPLE_VSSX_2 = getSampleFilePath("Diagram/sample.vssx");

    // VSTM
    public static String SAMPLE_VSTM = getSampleFilePath("Diagram/sample.vstm");
    public static String SAMPLE_VSTM_2 = getSampleFilePath("Diagram/sample.vstm");

    // VSTX
    public static String SAMPLE_VSTX = getSampleFilePath("Diagram/sample.vstx");
    public static String SAMPLE_VSTX_2 = getSampleFilePath("Diagram/sample.vstx");

    // VSX
    public static String SAMPLE_VSX = getSampleFilePath("Diagram/sample.vsx");
    public static String SAMPLE_VSX_2 = getSampleFilePath("Diagram/sample.vsx");

    // VTX
    public static String SAMPLE_VTX = getSampleFilePath("Diagram/sample.vtx");
    public static String SAMPLE_VTX_2 = getSampleFilePath("Diagram/sample.vtx");

    // XLAM
    public static String SAMPLE_XLAM = getSampleFilePath("Spreadsheet/sample.xlam");
    public static String SAMPLE_XLAM_2 = getSampleFilePath("Spreadsheet/sample.xlam");

    // XLS
    public static String SAMPLE_XLS = getSampleFilePath("Spreadsheet/sample.xls");
    public static String SAMPLE_XLS_2 = getSampleFilePath("Spreadsheet/sample.xls");

    // XLSB
    public static String SAMPLE_XLSB = getSampleFilePath("Spreadsheet/sample.xlsb");
    public static String SAMPLE_XLSB_2 = getSampleFilePath("Spreadsheet/sample.xlsb");

    // XLSM
    public static String SAMPLE_XLSM = getSampleFilePath("Spreadsheet/sample.xlsm");
    public static String SAMPLE_XLSM_2 = getSampleFilePath("Spreadsheet/sample.xlsm");

    // XLSX
    public static String SAMPLE_XLSX_2 = getSampleFilePath("Spreadsheet/sample.xlsx");

    // XLT
    public static String SAMPLE_XLT = getSampleFilePath("Spreadsheet/sample.xlt");
    public static String SAMPLE_XLT_2 = getSampleFilePath("Spreadsheet/sample.xlt");

    // XLTM
    public static String SAMPLE_XLTM = getSampleFilePath("Spreadsheet/sample.xltm");
    public static String SAMPLE_XLTM_2 = getSampleFilePath("Spreadsheet/sample.xltm");

    // XLTX
    public static String SAMPLE_XLTX = getSampleFilePath("Spreadsheet/sample.xltx");
    public static String SAMPLE_XLTX_2 = getSampleFilePath("Spreadsheet/sample.xltx");

    // XPS
    public static String SAMPLE_XPS = getSampleFilePath("PageDescriptionLanguage/sample.xps");
    public static String SAMPLE_XPS_2 = getSampleFilePath("PageDescriptionLanguage/sample.xps");
}