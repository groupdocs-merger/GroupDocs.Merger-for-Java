package com.groupdocs.merger.examples.basic_usage.multiple_document_operations;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to join documents.
 */
public class JoinMultipleDocuments {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_DOCX_2;
        String filePathOut = new File(Constants.OutputPath, "JoinMultipleDocuments-"+ Paths.get(filePath).getFileName().toString()).getPath();

        Merger merger = new Merger(filePath);

        merger.join(Constants.SAMPLE_DOCX_3);
        merger.join(Constants.SAMPLE_DOCX_4);
        merger.save(filePathOut);

        System.out.print("Source documents was merged successfully.");
        System.out.print("Check output " + filePathOut + ".");
    }
}