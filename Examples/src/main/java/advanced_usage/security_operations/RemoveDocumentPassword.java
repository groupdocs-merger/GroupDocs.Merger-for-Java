package advanced_usage.security_operations;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.LoadOptions;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

/**
 * This example demonstrates how to remove document password.
 */
public class RemoveDocumentPassword {
    private static final String SAMPLE_PASSWORD = "SomePasswordString";

    public static Path run(Path inputFile) {
        final Path outputPath = makeOutputPath("RemoveDocumentPassword.docx");

        try {
            LoadOptions loadOptions = new LoadOptions(SAMPLE_PASSWORD);
            Merger merger = new Merger(inputFile.toString(), loadOptions);
            try {
                merger.removePassword();
                merger.save(outputPath.toString());

                System.out.println("..sample finished successfully.");
                return outputPath;
            } finally {
                merger.dispose();
            }
        } catch (Exception e) {
            FailureRegister.getInstance().registerFailedSample(e);
        }

        return null;
    }
}