package advanced_usage.multiple_document_operations;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.builders.PageBuilder;
import com.groupdocs.merger.domain.options.PageJoinOptions;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

public class JoinPages {
    public static Path fromVariousDocuments(Path inputFile1, Path inputFile2) {
        final Path outputPath = makeOutputPath("JoinPages-fromVariousDocuments.docx");

        try {
            final Merger merger = new Merger(inputFile1.toString());
            try {
                PageJoinOptions joinOptions = new PageJoinOptions(1, 2);

                merger.join(inputFile2.toString(), joinOptions);
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

    public static Path usingPageBuilder(Path inputFile1, Path inputFile2) {
        final Path outputPath = makeOutputPath("JoinPages-usingPageBuilder.pdf");

        try {
            Merger merger = new Merger(inputFile1.toString());
            try {
                merger.join(inputFile2.toString());

                PageBuilder pageBuilder = merger.createPageBuilder();
                pageBuilder.addPage(pageBuilder.getDocuments().get(1).getPages()[0]); // Add 1 page of the second document
                pageBuilder.addPage(pageBuilder.getDocuments().get(0).getPages()[1]); // Add 2 page of the first document
                pageBuilder.addPage(pageBuilder.getDocuments().get(1).getPages()[1]); // Add 2 page of the second document

                merger.applyPageBuilder(pageBuilder);
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
