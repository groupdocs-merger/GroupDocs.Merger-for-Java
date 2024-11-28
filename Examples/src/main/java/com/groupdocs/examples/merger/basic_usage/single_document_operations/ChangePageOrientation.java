package com.groupdocs.examples.merger.basic_usage.single_document_operations;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.OrientationMode;
import com.groupdocs.merger.domain.options.OrientationOptions;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

/**
 * This example demonstrates how to change document page orientation.
 */
public class ChangePageOrientation {
    public static Path run(Path inputFile) {
        final Path outputPath = makeOutputPath("ChangePageOrientation.docx");
        try {
            Merger merger = new Merger(inputFile.toString());
            try {

                OrientationOptions options = new OrientationOptions(OrientationMode.Landscape, new int[]{3, 4});

                merger.changeOrientation(options);

                merger.save(outputPath.toString());

                System.out.println("..sample finished successfully.");
            } finally {
                merger.dispose();
            }
        } catch (Exception e) {
            FailureRegister.getInstance().registerFailedSample(e);
        }
        return outputPath;
    }
}