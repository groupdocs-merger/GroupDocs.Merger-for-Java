package com.groupdocs.merger.examples.basic_usage;

import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.result.IDocumentInfo;
import com.groupdocs.merger.examples.Constants;

import java.io.FileInputStream;

/**
 * This example demonstrates how to get document info.
 */
public class GetDocumentInformation {
    public static void run() throws Exception
    {
        
        Merger merger = new Merger(Constants.SAMPLE_VSDX);

        IDocumentInfo info = merger.getDocumentInfo();
        System.out.print(info);

        System.out.print("Document info retrieved successfully.");
    }
}
