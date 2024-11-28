package com.groupdocs.examples.merger.basic_usage.loading;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.LoadOptions;

import java.nio.file.Path;

/**
 * This example demonstrates how to load password-protected document.
 */
public class LoadPasswordProtectedDocument {
    public static void run(Path inputFile) {
        try {
            LoadOptions loadOptions = new LoadOptions("SAMPLE_PASSWORD");

            Merger merger = new Merger(inputFile.toString(), loadOptions);

            System.out.print("Document loaded successfully.");
            merger.dispose();
        } catch (Exception e) {
            FailureRegister.getInstance().registerFailedSample(e);
        }
    }
}