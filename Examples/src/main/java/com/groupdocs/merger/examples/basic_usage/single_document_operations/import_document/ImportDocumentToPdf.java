package com.groupdocs.merger.examples.basic_usage.single_document_operations.import_document;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.PdfAttachmentOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to add attachment to the Pdf document.
 */
public class ImportDocumentToPdf {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_PDF;
        String embeddedFilePath = Constants.SAMPLE_PPTX;
        String filePathOut =  new File(Constants.OutputPath, "ImportDocumentToPdf-" + Paths.get(filePath).getFileName().toString()).getPath();

        PdfAttachmentOptions olePdfOptions = new PdfAttachmentOptions(embeddedFilePath);

        Merger merger = new Merger(filePath);
        {
            merger.importDocument(olePdfOptions);
            merger.save(filePathOut);
        }

        System.out.print("Embedded object was added to the source document successfully.");
        System.out.print("Check output "+filePathOut);
    }
}