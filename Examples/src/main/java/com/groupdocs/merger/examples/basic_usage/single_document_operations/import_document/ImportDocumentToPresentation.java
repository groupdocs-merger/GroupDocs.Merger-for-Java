package com.groupdocs.merger.examples.basic_usage.single_document_operations.import_document;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.OlePresentationOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to add the OLE object to the Presentation document page.
 */
public class ImportDocumentToPresentation {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_PPTX;
        String embeddedFilePath = Constants.SAMPLE_PDF;
        String filePathOut = new File(Constants.OutputPath, "ImportDocumentToPresentation-" + Paths.get(filePath).getFileName().toString()).getPath();

        int pageNumber = 2;
        OlePresentationOptions oleSlidesOptions = new OlePresentationOptions(embeddedFilePath, pageNumber);
        oleSlidesOptions.setX(10);
        oleSlidesOptions.setY(10);

        Merger merger = new Merger(filePath);
        {
            merger.importDocument(oleSlidesOptions);
            merger.save(filePathOut);
        }

        System.out.print("Embedded object was added to the source document page successfully.");
        System.out.print("Check output "+filePathOut);
    }
}