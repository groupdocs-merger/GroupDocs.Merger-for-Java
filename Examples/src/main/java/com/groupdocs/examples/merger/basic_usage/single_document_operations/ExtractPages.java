package com.groupdocs.examples.merger.basic_usage.single_document_operations;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.ExtractOptions;
import com.groupdocs.merger.domain.options.RangeMode;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

public class ExtractPages {
    public static Path byNumbers(Path inputFile) {
        final Path outputPath = makeOutputPath("ExtractPages-byNumbers.docx");

        try {
            final Merger merger = new Merger(inputFile.toString());
            try {
                ExtractOptions extractOptions = new ExtractOptions(new int[]{1, 4});

                merger.extractPages(extractOptions);

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
    public static Path byRange(Path inputFile) {
        final Path outputPath = makeOutputPath("ExtractPages-byRange.docx");

        try {
            final Merger merger = new Merger(inputFile.toString());
            try {
                ExtractOptions extractOptions = new ExtractOptions(1, 3, RangeMode.EvenPages);

                merger.extractPages(extractOptions);

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
