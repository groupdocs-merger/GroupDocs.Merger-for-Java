package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple XLSX files into single file.
    * For more details about merging Microsoft Excel Open XML Spreadsheet (.xlsx) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/xlsx
    */

    public class MergeXlsx
    {
        public static void run() throws Exception
        {
            String outputFolder = Constants.OutputPath;
            String outputFile = new File(outputFolder, "merged.xlsx").getPath();
            // Load the source XLSX file
            Merger merger = new Merger(Constants.SAMPLE_XLSX);
            {
                // Add another XLSX file to merge
                merger.join(Constants.SAMPLE_XLSX_2);
                // Merge XLSX files ans save result
                merger.save(outputFile);
            }

            System.out.print("\nXLSX files merge completed successfully. \nCheck output in "+ outputFolder);
        }
    }


            
            