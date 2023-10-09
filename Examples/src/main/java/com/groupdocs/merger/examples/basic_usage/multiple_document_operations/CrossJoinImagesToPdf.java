package com.groupdocs.merger.examples.basic_usage.multiple_document_operations;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to join images with different file types to PDF.
 */
public class CrossJoinImagesToPdf {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_PDF;
        String filePathOut = new File(Constants.OutputPath, Constants.SAMPLE_NAME + Paths.get(filePath).getFileName().toString()).getPath();

        Merger merger = new Merger(filePath);
        {
            merger.join(Constants.SAMPLE_JPG);
            merger.join(Constants.SAMPLE_SVG);
            merger.save(filePathOut);
        }

        System.out.print("Source documents was merged successfully.");
        System.out.print("Check output "+filePathOut);
    }
}
