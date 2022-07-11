package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;

  /**
    * This example demonstrates how to merge multiple CSV files into single file.
    * For more details about merging Comma Separated Values File (.csv) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/csv
    */
public class MergeCsv
{
    public static void run() throws Exception
    {

        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.csv").getPath();
        // Load the source CSV file
        Merger merger = new Merger(Constants.SAMPLE_CSV);
        {
            // Add another CSV file to merge
            merger.join(Constants.SAMPLE_CSV_2);
            // Merge CSV files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nCSV files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            