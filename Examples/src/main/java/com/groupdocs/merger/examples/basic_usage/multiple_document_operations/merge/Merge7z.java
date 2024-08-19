package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;

public class Merge7z {
    public static void run() throws Exception
    {
        System.out.print("=======================================================================");
        System.out.print("");
        System.out.print("Example Basic Usage: Merge7z");
        System.out.print("");

        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder,  "merged.7z").getPath();

        // Load the source 7Z file
        Merger merger = new Merger(Constants.SAMPLE_7Z);
        {
            // Add another 7Z file to merge
            merger.join(Constants.SAMPLE_7Z);
            // Merge 7Z files and save result
            merger.save(outputFile);
        }

        System.out.print("\n7Z files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}
