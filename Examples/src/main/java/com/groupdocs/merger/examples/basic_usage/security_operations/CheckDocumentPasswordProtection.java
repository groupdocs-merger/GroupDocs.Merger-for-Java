package com.groupdocs.merger.examples.basic_usage.security_operations;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

/**
 * This example demonstrates how to check document password.
 */
public class CheckDocumentPasswordProtection {
    public static void run() throws Exception
    {
        String filePath = Constants.SAMPLE_XLSX_PROTECTED;
        boolean isPasswordSet = false;

        Merger merger = new Merger(filePath);
        isPasswordSet = merger.isPasswordSet();


        System.out.print("Source document password has password: "+isPasswordSet);
    }
}