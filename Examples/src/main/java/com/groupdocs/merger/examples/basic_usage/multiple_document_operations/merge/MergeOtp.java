package com.groupdocs.merger.examples.basic_usage.multiple_document_operations.merge;


import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.File;
/**
    * This example demonstrates how to merge multiple OTP files into single file.
    * For more details about merging Origin Graph Template (.otp) files please check this documentation article
    * https://docs.groupdocs.com/merger/net/merge/otp
    */

public class MergeOtp
{
    public static void run() throws Exception
    {
        String outputFolder = Constants.OutputPath;
        String outputFile = new File(outputFolder, "merged.otp").getPath();
                // Load the source OTP file
        Merger merger = new Merger(Constants.SAMPLE_OTP);
        {
            // Add another OTP file to merge
            merger.join(Constants.SAMPLE_OTP_2);
            // Merge OTP files ans save result
            merger.save(outputFile);
        }

        System.out.print("\nOTP files merge completed successfully. \nCheck output in "+ outputFolder);
    }
}


            
            