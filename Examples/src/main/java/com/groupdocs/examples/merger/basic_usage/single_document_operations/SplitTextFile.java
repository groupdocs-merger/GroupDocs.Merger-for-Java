package com.groupdocs.examples.merger.basic_usage.single_document_operations;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.TextSplitMode;
import com.groupdocs.merger.domain.options.TextSplitOptions;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

public class SplitTextFile {
    public static Path toLineRanges(Path inputFilePath) {
        final Path outputPath = makeOutputPath("SplitTextFile-toLineRanges.txt");

        try {
            final Merger merger = new Merger(inputFilePath.toString());
            try {
                TextSplitOptions splitOptions = new TextSplitOptions(outputPath.toString(), TextSplitMode.Interval, new int[]{3, 6});
                merger.split(splitOptions);

                System.out.println("..sample finished successfully.");
            } finally {
                merger.dispose();
            }
        } catch (Exception e) {
            FailureRegister.getInstance().registerFailedSample(e);
        }
        return outputPath;
    }

    public static Path toSeparateLines(Path inputFilePath) {
        final Path outputPath = makeOutputPath("SplitTextFile-toSeparateLines.txt");

        try {
            final Merger merger = new Merger(inputFilePath.toString());
            try {
                TextSplitOptions splitOptions = new TextSplitOptions(outputPath.toString(), new int[]{3, 6});
                merger.split(splitOptions);

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
