package com.groupdocs.examples.merger.basic_usage.single_document_operations;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

public class ImportDocument {
    public static Path toDiagram(Path inputFilePath, Path imagePath, Path embeddedFilePath) {
        final Path outputPath = makeOutputPath("ImportDocument-outputPath.docx");

        try {
            final Merger merger = new Merger(inputFilePath.toString());
            try {
                int pageNumber = 2;
                byte[] imageBytes = Files.readAllBytes(imagePath);

                OleDiagramOptions oleDiagramOptions = new OleDiagramOptions(embeddedFilePath.toString(), imageBytes, pageNumber);
                oleDiagramOptions.setX(1);
                oleDiagramOptions.setY(1);
                oleDiagramOptions.setWidth(2);
                oleDiagramOptions.setHeight(1);

                merger.importDocument(oleDiagramOptions);

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

    public static Path toPdf(Path inputFilePath, Path embeddedFilePath) {
        final Path outputPath = makeOutputPath("ImportDocument-toPdf.pdf");

        try {
            final Merger merger = new Merger(inputFilePath.toString());
            try {
                PdfAttachmentOptions olePdfOptions = new PdfAttachmentOptions(embeddedFilePath.toString());

                merger.importDocument(olePdfOptions);

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

    public static Path toPresentation(Path inputFilePath, Path embeddedFilePath) {
        final Path outputPath = makeOutputPath("ImportDocument-toPresentation.pptx");

        try {
            int pageNumber = 2;
            OlePresentationOptions oleSlidesOptions = new OlePresentationOptions(embeddedFilePath.toString(), pageNumber);
            oleSlidesOptions.setX(10);
            oleSlidesOptions.setY(10);

            final Merger merger = new Merger(inputFilePath.toString());
            try {
                merger.importDocument(oleSlidesOptions);
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

    public static Path toSpreadsheet(Path inputFilePath, Path embeddedFilePath) {
        final Path outputPath = makeOutputPath("ImportDocument-toSpreadsheet.xlsx");

        try {
            int pageNumber = 2;
            OleSpreadsheetOptions oleCellsOptions = new OleSpreadsheetOptions(embeddedFilePath.toString(), pageNumber);
            oleCellsOptions.setRowIndex(2);
            oleCellsOptions.setColumnIndex(2);

            final Merger merger = new Merger(inputFilePath.toString());
            try {
                merger.importDocument(oleCellsOptions);
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

    public static Path toWordProcessing(Path inputFilePath, Path embeddedFilePath) {
        final Path outputPath = makeOutputPath("ImportDocument-toWordProcessing.docx");

        try {
            int pageNumber = 2;
            OleWordProcessingOptions oleWordsOptions = new OleWordProcessingOptions(embeddedFilePath.toString(), pageNumber);
            oleWordsOptions.setWidth(300);
            oleWordsOptions.setHeight(300);

            final Merger merger = new Merger(inputFilePath.toString());
            try {
                merger.importDocument(oleWordsOptions);
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
