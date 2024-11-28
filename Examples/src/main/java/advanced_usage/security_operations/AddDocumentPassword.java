package advanced_usage.security_operations;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.AddPasswordOptions;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

/**
 * This example demonstrates how to add password to document.
 */
public class AddDocumentPassword {
    private static final String SAMPLE_PASSWORD = "SomePasswordString";

    public static Path run(Path inputFile) {
        final Path outputPath = makeOutputPath("AddDocumentPassword.docx");

        try {
            final Merger merger = new Merger(inputFile.toString());
            try {
                AddPasswordOptions addOptions = new AddPasswordOptions(SAMPLE_PASSWORD);
                merger.addPassword(addOptions);
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