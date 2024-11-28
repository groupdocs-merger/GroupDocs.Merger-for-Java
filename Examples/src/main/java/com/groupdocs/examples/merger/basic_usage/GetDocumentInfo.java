package com.groupdocs.examples.merger.basic_usage;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.result.IDocumentInfo;

import java.nio.file.Path;

/**
 * This example demonstrates how to get document info.
 */
public class GetDocumentInfo {
    public static IDocumentInfo run(Path inputFile) {
        try {
            Merger merger = new Merger(inputFile.toString());
            try {

                IDocumentInfo info = merger.getDocumentInfo();
                System.out.println("Document type: " + info.getType());
                System.out.println("Document pages count: " + info.getPageCount());
                System.out.println("Document size: " + info.getSize()); // in bytes

                System.out.println("..sample finished successfully.");
                return info;
            } finally {
                merger.dispose();
            }
        } catch (Exception e) {
            FailureRegister.getInstance().registerFailedSample(e);
        }
        return null;
    }
}