package com.groupdocs.merger.examples.basic_usage.multiple_document_operations;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to join documents with different file types.
 */
public class CrossJoinMultipleDocuments {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_PDF;
        String filePathOut = new File(Constants.OutputPath, "CrossJoinMultipleDocuments-" + Paths.get(filePath).getFileName().toString()).getPath();

        Merger merger = new Merger(filePath);
        {
            merger.join(Constants.SAMPLE_DOCX);
            merger.join(Constants.SAMPLE_XLSX);
            merger.join(Constants.SAMPLE_PPTX);
            merger.save(filePathOut);
        }

        System.out.print("Source documents was merged successfully.");
        System.out.print("Check output "+filePathOut);
    }
}