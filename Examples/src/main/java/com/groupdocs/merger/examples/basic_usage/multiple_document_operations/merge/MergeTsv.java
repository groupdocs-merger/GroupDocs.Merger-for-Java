package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple TSV files into single file.
    * For more details about merging Tab Separated Values File (.tsv) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/tsv
    */

public class MergeTsv
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.tsv").getPath();
                // Load the source TSV file
        Merger merger = new Merger(Constants.SAMPLE_TSV);
        {
            // Add another TSV file to merge
            merger.join(Constants.SAMPLE_TSV_2);
            // Merge TSV files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nTSV files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            