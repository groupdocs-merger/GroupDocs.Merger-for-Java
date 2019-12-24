package com.groupdocs.merger.examples.advanced_usage.loading.loading_documents_from_different_sources;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.examples.Constants;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This example demonstrates how to load document from stream.
 */
public class LoadDocumentFromStream {
    public static void run() throws Exception
    {
        InputStream stream = new FileInputStream(Constants.SAMPLE_DOCX);
        Merger merger = new Merger(stream);
        System.out.print("Document loaded from stream successfully.");


    }
}