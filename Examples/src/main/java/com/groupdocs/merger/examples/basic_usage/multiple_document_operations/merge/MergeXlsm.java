package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple XLSM files into single file.
    * For more details about merging Microsoft Excel Macro-Enabled Spreadsheet (.xlsm) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/xlsm
    */

    public class MergeXlsm
    {
        public static void run() throws Exception
        {
            String outputFolder = Constants.OutputPath;
            String outputFile = new File(outputFolder, "merged.xlsm").getPath();
                    // Load the source XLSM file
            Merger merger = new Merger(Constants.SAMPLE_XLSM);
            {
                // Add another XLSM file to merge
                merger.join(Constants.SAMPLE_XLSM_2);
                // Merge XLSM files ans save result
                merger.save(outputFile);
            }

            System.out.print("\nXLSM files merge completed successfully. \nCheck output in "+ outputFolder);
        }
    }


            
            