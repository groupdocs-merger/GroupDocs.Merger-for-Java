package advanced_usage.security_operations;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;

import java.nio.file.Path;

/**
 * This example demonstrates how to check document password.
 */
public class CheckDocumentPasswordProtection {
    public static boolean run(Path inputFile) {
        try {
            final Merger merger = new Merger(inputFile.toString());
            try {
                boolean isPasswordSet = merger.isPasswordSet();
                System.out.println("..sample finished successfully.");
                return isPasswordSet;
            } finally {
                merger.dispose();
            }
        } catch (Exception e) {
            FailureRegister.getInstance().registerFailedSample(e);
            return false;
        }
    }
}