package com.groupdocs.merger.examples.basic_usage.single_document_operations;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.MoveOptions;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to move document page to a new position.
 */
public class MovePage {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_XLSX;
        String filePathOut = new File(Constants.OutputPath, "MoveDocumentPage-"+ Paths.get(filePath).getFileName().toString()).getPath();

        int pageNumber = 6;
        int newPageNumber = 1;
        MoveOptions moveOptions = new MoveOptions(pageNumber, newPageNumber);

        Merger merger = new Merger(filePath);

        merger.movePage(moveOptions);
        merger.save(filePathOut);


        System.out.print("Source document page was moved successfully.");
        System.out.print("Check output "+filePathOut+".");
    }
}