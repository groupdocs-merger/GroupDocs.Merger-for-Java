package advanced_usage.multiple_document_operations;


import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

/**
 * This example demonstrates how to join documents.
 */
public class JoinMultipleDocuments {
    public static Path run(Path inputFile1, Path inputFile2, Path inputFile3) {
        final Path outputPath = makeOutputPath("JoinMultipleDocuments.docx");

        try {
            final Merger merger = new Merger(inputFile1.toString());
            try {
                merger.join(inputFile2.toString());
                merger.join(inputFile3.toString());
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