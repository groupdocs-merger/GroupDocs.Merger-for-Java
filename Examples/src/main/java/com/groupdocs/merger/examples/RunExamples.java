
package com.groupdocs.merger.examples;


import com.groupdocs.merger.examples.advanced_usage.loading.LoadPasswordProtectedDocument;
import com.groupdocs.merger.examples.advanced_usage.loading.loading_documents_from_different_sources.LoadDocumentFromLocalDisk;
import com.groupdocs.merger.examples.advanced_usage.loading.loading_documents_from_different_sources.LoadDocumentFromStream;
import com.groupdocs.merger.examples.advanced_usage.loading.loading_documents_from_different_sources.LoadDocumentFromUrl;
import com.groupdocs.merger.examples.basic_usage.GenerateDocumentPagesPreview;
import com.groupdocs.merger.examples.basic_usage.GetDocumentInformation;
import com.groupdocs.merger.examples.basic_usage.GetSupportedFileTypes;
import com.groupdocs.merger.examples.basic_usage.multiple_document_operations.*;
import com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge.*;
import com.groupdocs.merger.examples.basic_usage.security_operations.AddDocumentPassword;
import com.groupdocs.merger.examples.basic_usage.security_operations.CheckDocumentPasswordProtection;
import com.groupdocs.merger.examples.basic_usage.security_operations.RemoveDocumentPassword;
import com.groupdocs.merger.examples.basic_usage.security_operations.UpdateDocumentPassword;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.*;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.extract_pages.ExtractPagesByNumbers;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.extract_pages.ExtractPagesByRange;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.import_document.*;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.split_document.SplitToMultiPageDocuments;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.split_document.SplitToSinglePages;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.split_document.SplitToSinglePagesByRange;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.split_document.SplitToSinglePagesByRangeWithFilter;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.split_text_file.SplitToLineRanges;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.split_text_file.SplitToSeparateLines;
import com.groupdocs.merger.examples.quick_start.HelloWorld;
import com.groupdocs.merger.examples.quick_start.SetLicenseFromFile;
import com.groupdocs.merger.examples.quick_start.SetLicenseFromStream;
import com.groupdocs.merger.examples.quick_start.SetMeteredLicense;

public class RunExamples {
    public static void main(String[] args) throws Throwable
    {
        System.out.print("Open runExamples.cs.");
        System.out.print("Please uncomment the example that you want to run in the Main() method.");
        System.out.print("=====================================================");

        //NOTE: Please uncomment the example that you want to run.

        //region Quick Start

        SetLicenseFromFile.run();
        //SetLicenseFromStream.run();
        //SetMeteredLicense.run();

        //HelloWorld.run();

        //endregion // Quick Start

        //region Basic Usage

        //region Import Documents
        //ImportDocumentToPdf.run();
        //ImportDocumentToWordProcessing.run();
        //ImportDocumentToSpreadsheet.run();
        //ImportDocumentToPresentation.run();
        //ImportDocumentToDiagram.run();
        //endregion

        //region Get all supported file types
        //GetSupportedFileTypes.run();
        //endregion

        //region Get info for the selected document
        //GetDocumentInformation.run();
        //endregion

        //region Generate preview for the selected document
        //GenerateDocumentPagesPreview.run();
        //endregion

        //region Join files
        //JoinMultipleDocuments.run();
        //JoinPagesFromVariousDocuments.run();
        //JoinPagesUsingPageBuilder.run();
        //endregion
		
		 //region Merge files
            //MergeCsv.run();
            //MergeDoc.run();
            //MergeDocm.run();
            //MergeDocx.run();
            //MergeDot.run();
            //MergeDotm.run();
            //MergeDotx.run();
            //MergeEpub.run();
            //MergeHtml.run();
            //MergeMht.run();
            //MergeMhtml.run();
            //MergeOdp.run();
            //MergeOds.run();
            //MergeOdt.run();
            //MergeOne.run();
            //MergeOtp.run();
            //MergeOtt.run();
            //MergePdf.run();
            //MergePps.run();
            //MergePpsx.run();
            //MergePpt.run();
            //MergePptx.run();
            //MergePng.run();
            //MergeBmp.run();
            //MergeTif.run();
            //MergeTiff.run();
            //MergeSvg.run();
            //MergeSvgz.run();
            //MergeRtf.run();
            //MergeTsv.run();
            //MergeTxt.run();
            //MergeVdx.run();
            //MergeVsdm.run();
            //MergeVsdx.run();
            //MergeVssm.run();
            //MergeVssx.run();
            //MergeVstm.run();
            //MergeVstx.run();
            //MergeVsx.run();
            //MergeVtx.run();
            //MergeXlam.run();
            //MergeXls.run();
            //MergeXlsb.run();
            //MergeXlsm.run();
            //MergeXlsx.run();
            //MergeXlt.run();
            //MergeXltm.run();
            //MergeXltx.run();
            //MergeXps.run();
            //MergeZip.run();
            //MergeTar.run();
            //MergeWav.run();
         //endregion

        //region Cross-Join files
        if (Constants.IsLicensed)
        {
            //CrossJoinMultipleDocuments.run();
            //CrossJoinMultipleImages.run();
            //CrossJoinPagesFromVariousDocuments.run();
            //CrossJoinImagesToPdf.run();
        }
        //endregion

        //region Split document
        //SplitToMultiPageDocuments.run();
        //SplitToSinglePages.run();
        //SplitToSinglePagesByRange.run();
        //SplitToSinglePagesByRangeWithFilter.run();
        //endregion

        //region Split text file
        //SplitToLineRanges.run();
        //SplitToSeparateLines.run();
        //endregion

        //region Extract document pages
        //ExtractPagesByNumbers.run();
        //ExtractPagesByRange.run();
        //endregion

        //region Change orientation of the specific document pages
        //ChangePageOrientation.run();
        //endregion

        //region Rotate document pages
        //RotatePages.run();
        //endregion

        //region Swap document pages
        //SwapPages.run();
        //endregion

        //region Remove document pages
        // TODO: Implement for some other format than One (which is not supported currently under NET Standard)
        //RemovePages.run();
        //endregion

        //region Move page to a new position within document
        //MovePage.run();
        //endregion

        //region Security - check, add, update, remove document password

        //AddDocumentPassword.run();
        //UpdateDocumentPassword.run();
        //CheckDocumentPasswordProtection.run();
        //RemoveDocumentPassword.run();

        //endregion // Security

        //endregion // Basic usage

        //region Advanced Usage

        //region Loading

        //LoadDocumentFromLocalDisk.run();
        //LoadDocumentFromStream.run();
        //LoadDocumentFromUrl.run();
        //LoadPasswordProtectedDocument.run();

        //endregion // Loading

        //endregion // Advanced Usage


        System.out.print("=====================================================");
        System.out.print("All done.");

    }
}