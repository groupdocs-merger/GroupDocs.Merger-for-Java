package com.groupdocs.examples.merger;

import advanced_usage.multiple_document_operations.CrossJoin;
import advanced_usage.multiple_document_operations.JoinMultipleDocuments;
import advanced_usage.multiple_document_operations.JoinPages;
import advanced_usage.security_operations.AddDocumentPassword;
import advanced_usage.security_operations.CheckDocumentPasswordProtection;
import advanced_usage.security_operations.RemoveDocumentPassword;
import advanced_usage.security_operations.UpdateDocumentPassword;
import com.groupdocs.examples.merger.basic_usage.GenerateDocumentPagesPreview;
import com.groupdocs.examples.merger.basic_usage.GetDocumentInfo;
import com.groupdocs.examples.merger.basic_usage.GetPagesStream;
import com.groupdocs.examples.merger.basic_usage.GetSupportedFileTypes;
import com.groupdocs.examples.merger.basic_usage.loading.LoadDocument;
import com.groupdocs.examples.merger.basic_usage.loading.LoadPasswordProtectedDocument;
import com.groupdocs.examples.merger.basic_usage.merge.*;
import com.groupdocs.examples.merger.basic_usage.single_document_operations.*;
import com.groupdocs.examples.merger.quick_start.HelloWorld;
import com.groupdocs.examples.merger.quick_start.licensing.SetLicenseFromStream;
import com.groupdocs.examples.merger.utils.FailureRegister;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Open `src/main/java/com/groupdocs/examples/merger/Main.java` file. \nIn runExamples() method uncomment the example that you want to run.");
        System.out.println("=====================================================");
        Locale.setDefault(Locale.US);

        runExamples();

        final boolean printFailedSamplesStacktrace = System.getenv("PRINT_FAILED_SAMPLES_STACKTRACE") != null;
        FailureRegister.getInstance().printFailedSamples(printFailedSamplesStacktrace);

        System.out.println("\nAll done.");
        System.exit(FailureRegister.getInstance().getFailedSamplesCount());
    }

    public static void runExamples() {
        // TODO: Comment examples which you don't want to run

        { // Licensing
//            SetLicenseFromFile.run();
            SetLicenseFromStream.run();
//            SetMeteredLicense.run();
        }
        { // Quick start
            HelloWorld.run(SampleFiles.SAMPLE_DOCX, SampleFiles.SAMPLE2_DOCX);
        }
        { // Basic usage
            LoadDocument.fromLocalDisk(SampleFiles.SAMPLE_DOCX);
            LoadDocument.fromStream(SampleFiles.SAMPLE_DOCX);
            LoadDocument.fromUrl("https://github.com/groupdocs-merger/GroupDocs.Merger-for-Java/blob/master/Examples/Resources/SampleFiles/Pdf/sample.pdf?raw=true");

            LoadPasswordProtectedDocument.run(SampleFiles.SAMPLE_PROTECTED_DOCX);

            GenerateDocumentPagesPreview.run(SampleFiles.SAMPLE_XLSX);
            GetDocumentInfo.run(SampleFiles.SAMPLE_VSDX);
            GetPagesStream.run(SampleFiles.SAMPLE_DOCX_10_PAGES);
            GetSupportedFileTypes.run();
            ChangePageOrientation.run(SampleFiles.SAMPLE_DOCX);
            MovePage.run(SampleFiles.SAMPLE_XLSX);
            RemovePages.run(SampleFiles.SAMPLE_DOCX_10_PAGES);
            RotatePages.run(SampleFiles.SAMPLE_SIMPLE_PDF);

            ExtractPages.byNumbers(SampleFiles.SAMPLE_DOCX);
            ExtractPages.byRange(SampleFiles.SAMPLE_DOCX);

            ImportDocument.toDiagram(SampleFiles.SAMPLE_VSDX, SampleFiles.SAMPLE_EMF, SampleFiles.SAMPLE_PPTX);
            ImportDocument.toPdf(SampleFiles.SAMPLE_PDF, SampleFiles.SAMPLE_PPTX);
            ImportDocument.toPresentation(SampleFiles.SAMPLE_PPTX, SampleFiles.SAMPLE_PDF);
            ImportDocument.toSpreadsheet(SampleFiles.SAMPLE_XLSX, SampleFiles.SAMPLE_PDF);
            ImportDocument.toWordProcessing(SampleFiles.SAMPLE_DOCX, SampleFiles.SAMPLE_PDF);

            SplitDocument.toMultiPageDocuments(SampleFiles.SAMPLE_DOCX_10_PAGES);
            SplitDocument.toSinglePages(SampleFiles.SAMPLE_DOCX_10_PAGES);
            SplitDocument.toSinglePagesByRange(SampleFiles.SAMPLE_DOCX_10_PAGES);
            SplitDocument.toSinglePagesByRangeWithFilter(SampleFiles.SAMPLE_DOCX_10_PAGES);

            SplitTextFile.toLineRanges(SampleFiles.SAMPLE_TXT);
            SplitTextFile.toSeparateLines(SampleFiles.SAMPLE_TXT);

            MergeWordDocuments.withoutStartingFromNewPage(SampleFiles.SAMPLE_DOC, SampleFiles.SAMPLE_DOC);
            MergeWordDocuments.withPredefinedComplianceMode(SampleFiles.SAMPLE_DOCX, SampleFiles.SAMPLE2_DOCX);

            Merge7z.run(SampleFiles.SAMPLE_7Z, SampleFiles.SAMPLE_7Z);
            MergeBmp.run(SampleFiles.SAMPLE_BMP, SampleFiles.SAMPLE_BMP);
            MergeCsv.run(SampleFiles.SAMPLE_CSV, SampleFiles.SAMPLE_CSV);
            MergeDoc.run(SampleFiles.SAMPLE_DOC, SampleFiles.SAMPLE_DOC);
            MergeDocm.run(SampleFiles.SAMPLE_DOCM, SampleFiles.SAMPLE_DOCM);
            MergeDocx.run(SampleFiles.SAMPLE_DOCX, SampleFiles.SAMPLE_DOCX);
            MergeDot.run(SampleFiles.SAMPLE_DOT, SampleFiles.SAMPLE_DOT);
            MergeDotm.run(SampleFiles.SAMPLE_DOTM, SampleFiles.SAMPLE_DOTM);
            MergeDotx.run(SampleFiles.SAMPLE_DOTX, SampleFiles.SAMPLE_DOTX);
            MergeEmf.run(SampleFiles.SAMPLE_EMF, SampleFiles.SAMPLE_EMF);
            MergeEmz.run(SampleFiles.SAMPLE_EMZ, SampleFiles.SAMPLE_EMZ);
            MergeEpub.run(SampleFiles.SAMPLE_EPUB, SampleFiles.SAMPLE_EPUB);
            MergeHtml.run(SampleFiles.SAMPLE_HTML, SampleFiles.SAMPLE_HTML);
            MergeMht.run(SampleFiles.SAMPLE_MHT, SampleFiles.SAMPLE_MHT);
            MergeMhtml.run(SampleFiles.SAMPLE_MHTML, SampleFiles.SAMPLE_MHTML);
            MergeOdp.run(SampleFiles.SAMPLE_ODP, SampleFiles.SAMPLE_ODP);
            MergeOds.run(SampleFiles.SAMPLE_ODS, SampleFiles.SAMPLE_ODS);
            MergeOdt.run(SampleFiles.SAMPLE_ODT, SampleFiles.SAMPLE_ODT);
            MergeOne.run(SampleFiles.SAMPLE_ONE, SampleFiles.SAMPLE_ONE);
            MergeOtp.run(SampleFiles.SAMPLE_OTP, SampleFiles.SAMPLE_OTP);
            MergeOtt.run(SampleFiles.SAMPLE_OTT, SampleFiles.SAMPLE_OTT);
            MergePdf.run(SampleFiles.SAMPLE_PDF, SampleFiles.SAMPLE_PDF);
            MergePng.run(SampleFiles.SAMPLE_PNG, SampleFiles.SAMPLE_PNG);
            MergePps.run(SampleFiles.SAMPLE_PPS, SampleFiles.SAMPLE_PPS);
            MergePpsx.run(SampleFiles.SAMPLE_PPSX, SampleFiles.SAMPLE_PPSX);
            MergePpt.run(SampleFiles.SAMPLE_PPT, SampleFiles.SAMPLE_PPT);
            MergePptm.run(SampleFiles.SAMPLE_PPTM, SampleFiles.SAMPLE_PPTM);
            MergePptx.run(SampleFiles.SAMPLE_PPTX, SampleFiles.SAMPLE_PPTX);
            MergeRtf.run(SampleFiles.SAMPLE_RTF, SampleFiles.SAMPLE_RTF);
            MergeSvg.run(SampleFiles.SAMPLE_SVG, SampleFiles.SAMPLE_SVG);
            MergeSvgz.run(SampleFiles.SAMPLE_SVGZ, SampleFiles.SAMPLE_SVGZ);
            MergeTar.run(SampleFiles.SAMPLE_TAR, SampleFiles.SAMPLE_TAR);
            MergeTex.run(SampleFiles.SAMPLE_TEX, SampleFiles.SAMPLE_TEX);
            MergeTif.run(SampleFiles.SAMPLE_TIF, SampleFiles.SAMPLE_TIF);
            MergeTiff.run(SampleFiles.SAMPLE_TIFF, SampleFiles.SAMPLE_TIFF);
            MergeTsv.run(SampleFiles.SAMPLE_TSV, SampleFiles.SAMPLE_TSV);
            MergeTxt.run(SampleFiles.SAMPLE_TXT, SampleFiles.SAMPLE_TXT);
            MergeVdx.run(SampleFiles.SAMPLE_VDX, SampleFiles.SAMPLE_VDX);
            MergeVsdm.run(SampleFiles.SAMPLE_VSDM, SampleFiles.SAMPLE_VSDM);
            MergeVsdx.run(SampleFiles.SAMPLE_VSDX, SampleFiles.SAMPLE_VSDX);
            MergeVssm.run(SampleFiles.SAMPLE_VSSM, SampleFiles.SAMPLE_VSSM);
            MergeVssx.run(SampleFiles.SAMPLE_VSSX, SampleFiles.SAMPLE_VSSX);
            MergeVstm.run(SampleFiles.SAMPLE_VSTM, SampleFiles.SAMPLE_VSTM);
            MergeVstx.run(SampleFiles.SAMPLE_VSTX, SampleFiles.SAMPLE_VSTX);
            MergeVsx.run(SampleFiles.SAMPLE_VSX, SampleFiles.SAMPLE_VSX);
            MergeVtx.run(SampleFiles.SAMPLE_VTX, SampleFiles.SAMPLE_VTX);
            MergeWav.run(SampleFiles.SAMPLE_WAV, SampleFiles.SAMPLE_WAV);
            MergeXlam.run(SampleFiles.SAMPLE_XLAM, SampleFiles.SAMPLE_XLAM);
            MergeXls.run(SampleFiles.SAMPLE_XLS, SampleFiles.SAMPLE_XLS);
            MergeXlsb.run(SampleFiles.SAMPLE_XLSB, SampleFiles.SAMPLE_XLSB);
            MergeXlsm.run(SampleFiles.SAMPLE_XLSM, SampleFiles.SAMPLE_XLSM);
            MergeXlsx.run(SampleFiles.SAMPLE_XLSX, SampleFiles.SAMPLE_XLSX);
            MergeXlt.run(SampleFiles.SAMPLE_XLT, SampleFiles.SAMPLE_XLT);
            MergeXltm.run(SampleFiles.SAMPLE_XLTM, SampleFiles.SAMPLE_XLTM);
            MergeXltx.run(SampleFiles.SAMPLE_XLTX, SampleFiles.SAMPLE_XLTX);
            MergeXps.run(SampleFiles.SAMPLE_XPS, SampleFiles.SAMPLE_XPS);
            MergeZip.run(SampleFiles.SAMPLE_ZIP, SampleFiles.SAMPLE_ZIP);
        }
        { // Advanced usage

            CrossJoin.imagesToPdf(SampleFiles.SAMPLE_PDF, SampleFiles.SAMPLE_JPG, SampleFiles.SAMPLE_SVG);
            CrossJoin.multipleDocuments(SampleFiles.SAMPLE_PDF, SampleFiles.SAMPLE_DOCX, SampleFiles.SAMPLE_XLSX, SampleFiles.SAMPLE_PPTX);
            CrossJoin.multipleImages(SampleFiles.SAMPLE_PNG, SampleFiles.SAMPLE_BMP, SampleFiles.SAMPLE_JPG);
            CrossJoin.pagesFromVariousDocuments(SampleFiles.SAMPLE_PDF, SampleFiles.SAMPLE_DOCX);
            JoinMultipleDocuments.run(SampleFiles.SAMPLE2_DOCX, SampleFiles.SAMPLE3_DOCX, SampleFiles.SAMPLE4_DOCX);

            JoinPages.usingPageBuilder(SampleFiles.SAMPLE_PDF, SampleFiles.SAMPLE_SIMPLE_PDF);
            JoinPages.fromVariousDocuments(SampleFiles.SAMPLE2_DOCX, SampleFiles.SAMPLE_DOCX);

            AddDocumentPassword.run(SampleFiles.SAMPLE_PPTX);
            CheckDocumentPasswordProtection.run(SampleFiles.SAMPLE_PROTECTED_XLSX);
            RemoveDocumentPassword.run(SampleFiles.SAMPLE_PROTECTED_DOCX);
            UpdateDocumentPassword.run(SampleFiles.SAMPLE_PROTECTED_XLSX);

        }
    }
}
