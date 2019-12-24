package com.groupdocs.merger.examples.quick_start;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
import java.nio.file.Paths;

/**
 * This example demonstrates how to join two documents.
 */
public class HelloWorld {
    public static void run() throws Exception
    {
        String firstDocPath = Constants.SAMPLE_DOCX;
        String secondDocPath = Constants.SAMPLE_DOCX_2;
        String filePathOut = new File(Constants.OutputPath, "quick_start_join-" + Paths.get(firstDocPath).getFileName().toString()).getPath();

        Merger merger = new Merger(firstDocPath);

        merger.join(secondDocPath);
        merger.save(filePathOut);

        System.out.print("Source document was merged successfully.");
        System.out.print("Check output " + filePathOut + ".");
    }
}