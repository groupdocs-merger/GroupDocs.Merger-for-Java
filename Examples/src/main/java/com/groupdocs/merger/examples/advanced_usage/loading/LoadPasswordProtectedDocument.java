package com.groupdocs.merger.examples.advanced_usage.loading;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.LoadOptions;
import com.groupdocs.merger.examples.Constants;

/**
 * This example demonstrates how to load password-protected document.
 */
public class LoadPasswordProtectedDocument {
    public static void run() throws Exception
    {
        // The path to the documents directory.
        String filePath = Constants.SAMPLE_DOCX_PROTECTED;

        LoadOptions loadOptions = new LoadOptions("SAMPLE_PASSWORD");

        Merger merger = new Merger(filePath, loadOptions);
        System.out.print("Document loaded successfully.");

    }
}