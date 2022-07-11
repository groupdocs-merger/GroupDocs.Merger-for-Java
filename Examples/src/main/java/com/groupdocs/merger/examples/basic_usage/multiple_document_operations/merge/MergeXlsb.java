package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple XLSB files into single file.
    * For more details about merging Microsoft Excel Binary Spreadsheet File (.xlsb) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/xlsb
    */

    public class MergeXlsb
    {
        public static void run() throws Exception
        {
            String outputFolder = Constants.OutputPath;
            String outputFile = new File(outputFolder, "merged.xlsb").getPath();
            // Load the source XLSB file
            Merger merger = new Merger(Constants.SAMPLE_XLSB);
            {
                // Add another XLSB file to merge
                merger.join(Constants.SAMPLE_XLSB_2);
                // Merge XLSB files ans save result
                merger.save(outputFile);
            }

            System.out.print("\nXLSB files merge completed successfully. \nCheck output in "+ outputFolder);
        }
    }


            
            