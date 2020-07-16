package com.groupdocs.merger.examples.basic_usage.multiple_document_operations;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.JoinOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to join specific pages from several source documents with different file types.
 */
public class CrossJoinPagesFromVariousDocuments {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_PDF;
        String filePathOut = new File(Constants.OutputPath, "CrossJoinPagesFromVariousDocuments-" + Paths.get(filePath).getFileName().toString()).getPath();

        JoinOptions joinOptions = new JoinOptions(1, 2);

        Merger merger = new Merger(filePath);
        {
            merger.join(Constants.SAMPLE_DOCX, joinOptions);
            merger.save(filePathOut);
        }

        System.out.print("Source documents was merged successfully.");
        System.out.print("Check output "+filePathOut);
    }
}