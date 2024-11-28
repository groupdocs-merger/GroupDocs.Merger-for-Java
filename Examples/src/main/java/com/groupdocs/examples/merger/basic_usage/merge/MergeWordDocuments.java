package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.WordJoinCompliance;
import com.groupdocs.merger.domain.options.WordJoinMode;
import com.groupdocs.merger.domain.options.WordJoinOptions;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

public class MergeWordDocuments {

    public static Path withoutStartingFromNewPage(Path inputFile1, Path inputFile2) {
        final Path outputPath = makeOutputPath("MergeWordDocuments-withoutStartingFromNewPage.doc");

        try {
            final Merger merger = new Merger(inputFile1.toString());
            try {
                WordJoinOptions joinOptions = new WordJoinOptions();
                joinOptions.setMode(WordJoinMode.Continuous);
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


    public static Path withPredefinedComplianceMode(Path inputFile1, Path inputFile2) {
        final Path outputPath = makeOutputPath("merged.docx");

        try {
            final Merger merger = new Merger(inputFile1.toString());
            try {
                WordJoinOptions joinOptions = new WordJoinOptions();
                joinOptions.setCompliance(WordJoinCompliance.Iso29500_2008_Strict);
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
}
