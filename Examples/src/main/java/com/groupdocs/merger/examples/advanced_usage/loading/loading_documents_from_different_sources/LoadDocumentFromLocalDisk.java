package com.groupdocs.merger.examples.advanced_usage.loading.loading_documents_from_different_sources;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

/**
 * This example demonstrates how to load document from local disk.
 */
public class LoadDocumentFromLocalDisk {
    public static void run() throws Exception
    {
        // The path to the documents directory.
        String filePath = Constants.SAMPLE_DOCX;
        Merger merger = new Merger(filePath);
        System.out.print("Document loaded from local disk successfully.");

    }
}