package com.groupdocs.examples.merger.basic_usage.single_document_operations;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.RangeMode;
import com.groupdocs.merger.domain.options.SplitMode;
import com.groupdocs.merger.domain.options.SplitOptions;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

public class SplitDocument {

    /**
     * This example demonstrates how to split the document to several multi-page documents by specified page ranges.
     */
    public static Path toMultiPageDocuments(Path inputFilePath) {
        final Path outputPath = makeOutputPath("SplitDocument-toMultiPageDocuments.docx");

        try {
            Merger merger = new Merger(inputFilePath.toString());
            try {
                SplitOptions splitOptions = new SplitOptions(outputPath.toString(), new int[]{3, 6, 8}, SplitMode.Interval);

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

    public static Path toSinglePages(Path inputFilePath) {
        final Path outputPath = makeOutputPath("SplitDocument-toSinglePages.docx");

        try {
            final Merger merger = new Merger(inputFilePath.toString());
            try {
                SplitOptions splitOptions = new SplitOptions(outputPath.toString(), new int[]{3, 6, 8});

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

    public static Path toSinglePagesByRange(Path inputFilePath) {
        final Path outputPath = makeOutputPath("SplitDocument-toSinglePagesByRange.docx");

        try {
            final Merger merger = new Merger(inputFilePath.toString());
            try {
                SplitOptions splitOptions = new SplitOptions(outputPath.toString(), 3, 7);

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

    public static Path toSinglePagesByRangeWithFilter(Path inputFilePath) {
        final Path outputPath = makeOutputPath("SplitDocument-toSinglePagesByRangeWithFilter.docx");

        try {
            final Merger merger = new Merger(inputFilePath.toString());
            try {
                SplitOptions splitOptions = new SplitOptions(outputPath.toString(), 3, 7, RangeMode.OddPages);

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