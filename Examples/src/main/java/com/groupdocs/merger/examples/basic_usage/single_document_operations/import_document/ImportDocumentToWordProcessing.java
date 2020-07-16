package com.groupdocs.merger.examples.basic_usage.single_document_operations.import_document;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.OleWordProcessingOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to add the OLE object to the Word processing document page.
 */
public class ImportDocumentToWordProcessing {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_DOCX;
        String embeddedFilePath = Constants.SAMPLE_PDF;
        String filePathOut = new File(Constants.OutputPath, "ImportDocumentToWordProcessing-" + Paths.get(filePath).getFileName().toString()).getPath();

        int pageNumber = 2;
        OleWordProcessingOptions oleWordsOptions = new OleWordProcessingOptions(embeddedFilePath, pageNumber);
        oleWordsOptions.setWidth(300);
        oleWordsOptions.setHeight(300);

        Merger merger = new Merger(filePath);
        {
            merger.importDocument(oleWordsOptions);
            merger.save(filePathOut);
        }

        System.out.print("Embedded object was added to the source document page successfully.");
        System.out.print("Check output "+filePathOut);
    }
}