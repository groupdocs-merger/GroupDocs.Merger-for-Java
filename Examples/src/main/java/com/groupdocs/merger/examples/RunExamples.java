package com.groupdocs.merger.examples;


import com.groupdocs.merger.examples.advanced_usage.loading.LoadPasswordProtectedDocument;
import com.groupdocs.merger.examples.advanced_usage.loading.loading_documents_from_different_sources.LoadDocumentFromLocalDisk;
import com.groupdocs.merger.examples.advanced_usage.loading.loading_documents_from_different_sources.LoadDocumentFromStream;
import com.groupdocs.merger.examples.advanced_usage.loading.loading_documents_from_different_sources.LoadDocumentFromUrl;
import com.groupdocs.merger.examples.basic_usage.GenerateDocumentPagesPreview;
import com.groupdocs.merger.examples.basic_usage.GetDocumentInformation;
import com.groupdocs.merger.examples.basic_usage.GetSupportedFileTypes;
import com.groupdocs.merger.examples.basic_usage.multiple_document_operations.JoinMultipleDocuments;
import com.groupdocs.merger.examples.basic_usage.multiple_document_operations.JoinPagesFromVariousDocuments;
import com.groupdocs.merger.examples.basic_usage.security_operations.AddDocumentPassword;
import com.groupdocs.merger.examples.basic_usage.security_operations.CheckDocumentPasswordProtection;
import com.groupdocs.merger.examples.basic_usage.security_operations.RemoveDocumentPassword;
import com.groupdocs.merger.examples.basic_usage.security_operations.UpdateDocumentPassword;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.*;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.extract_pages.ExtractPagesByNumbers;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.extract_pages.ExtractPagesByRange;
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
        System.out.print("Open RunExamples.cs.");
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
        //endregion

        //region Split document
        //SplitToMultiPageDocuments.run();
        //SplitToSinglePages.getPagesStream();
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
        //RemovePages.run();
        //endregion

        //region Move page to a new position within document
        //MovePage.run();
        //endregion

        //region Security - check, add, update, remove document password

        //AddDocumentPassword.run();
        UpdateDocumentPassword.run();
        //CheckDocumentPasswordProtection.run();
        //RemoveDocumentPassword.run();

        //endregion // Security
package com.groupdocs.merger.examples;


import com.groupdocs.merger.examples.advanced_usage.loading.LoadPasswordProtectedDocument;
import com.groupdocs.merger.examples.advanced_usage.loading.loading_documents_from_different_sources.LoadDocumentFromLocalDisk;
import com.groupdocs.merger.examples.advanced_usage.loading.loading_documents_from_different_sources.LoadDocumentFromStream;
import com.groupdocs.merger.examples.advanced_usage.loading.loading_documents_from_different_sources.LoadDocumentFromUrl;
import com.groupdocs.merger.examples.basic_usage.GenerateDocumentPagesPreview;
import com.groupdocs.merger.examples.basic_usage.GetDocumentInformation;
import com.groupdocs.merger.examples.basic_usage.GetSupportedFileTypes;
import com.groupdocs.merger.examples.basic_usage.multiple_document_operations.CrossJoinMultipleDocuments;
import com.groupdocs.merger.examples.basic_usage.multiple_document_operations.CrossJoinPagesFromVariousDocuments;
import com.groupdocs.merger.examples.basic_usage.multiple_document_operations.JoinMultipleDocuments;
import com.groupdocs.merger.examples.basic_usage.multiple_document_operations.JoinPagesFromVariousDocuments;
import com.groupdocs.merger.examples.basic_usage.security_operations.AddDocumentPassword;
import com.groupdocs.merger.examples.basic_usage.security_operations.CheckDocumentPasswordProtection;
import com.groupdocs.merger.examples.basic_usage.security_operations.RemoveDocumentPassword;
import com.groupdocs.merger.examples.basic_usage.security_operations.UpdateDocumentPassword;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.*;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.extract_pages.ExtractPagesByNumbers;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.extract_pages.ExtractPagesByRange;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.import_document.ImportDocumentToPdf;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.import_document.ImportDocumentToPresentation;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.import_document.ImportDocumentToSpreadsheet;
import com.groupdocs.merger.examples.basic_usage.single_document_operations.import_document.ImportDocumentToWordProcessing;
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
        System.out.print("Open RunExamples.cs.");
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
        //CrossJoinMultipleDocuments.run();
        //CrossJoinPagesFromVariousDocuments.run();
        //JoinMultipleDocuments.run();
        //JoinPagesFromVariousDocuments.run();
        //endregion

        //region Split document
        //SplitToMultiPageDocuments.run();
        //SplitToSinglePages.getPagesStream();
        //SplitToSinglePagesByRange.run();
        //SplitToSinglePagesByRangeWithFilter.run();
        //endregion

        //region Split text file
        //SplitToLineRanges.run();
        //SplitToSeparateLines.run();
        //endregion

        //region Import document
        //ImportDocumentToPdf.run();
        //ImportDocumentToPresentation.run();
        //ImportDocumentToSpreadsheet.run();
        //ImportDocumentToWordProcessing.run();

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