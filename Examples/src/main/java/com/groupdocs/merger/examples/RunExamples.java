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
        System.out.print("Please uncomment the example that you want to run in the main() method.");
        System.out.print("=====================================================");

        //NOTE: Please uncomment the example that you want to run.

        // Quick Start

        SetLicenseFromFile.run();
        //SetLicenseFromStream.run();
        //SetMeteredLicense.run();
        HelloWorld.run();

        // // Basic Usage
        // // Get all supported file types
        // GetSupportedFileTypes.run();
        
        // // Get info for the selected document
        // GetDocumentInformation.run();
        
        // // Generate preview for the selected document
        // GenerateDocumentPagesPreview.run();
        
        // // Join files
        // JoinMultipleDocuments.run();
        // JoinPagesFromVariousDocuments.run();
        
        // // Split document
        // SplitToMultiPageDocuments.run();
        // SplitToSinglePages.run();
        // SplitToSinglePagesByRange.run();
        // SplitToSinglePagesByRangeWithFilter.run();
        
        // // Split text file
        // SplitToLineRanges.run();
        // SplitToSeparateLines.run();
        
        // // Extract document pages
        // ExtractPagesByNumbers.run();
        // ExtractPagesByRange.run();
        
        // // Change orientation of the specific document pages
        // ChangePageOrientation.run();
        
        // // Rotate document pages
        // RotatePages.run();
        
        // // Swap document pages
        // SwapPages.run();
        
        // // Remove document pages
        // //RemovePages.run();
        
        // // Move page to a new position within document
        // MovePage.run();
        
        // // Security - check, add, update, remove document password
        // AddDocumentPassword.run();
        // UpdateDocumentPassword.run();
        // CheckDocumentPasswordProtection.run();
        // RemoveDocumentPassword.run();
        
        // // Advanced Usage
        // // Loading
        // LoadDocumentFromLocalDisk.run();
        // LoadDocumentFromStream.run();
        // LoadDocumentFromUrl.run();
        // LoadPasswordProtectedDocument.run();
       
        System.out.print("=====================================================");
        System.out.print("All done.");
    }
}