package com.groupdocs.examples.merger.basic_usage;


import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.common.PageStreamFactory;
import com.groupdocs.merger.domain.options.PreviewMode;
import com.groupdocs.merger.domain.options.PreviewOptions;
import com.groupdocs.merger.domain.options.interfaces.IPreviewOptions;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

/**
 * This example demonstrates how to generate document pages preview.
 */
public class GenerateDocumentPagesPreview {
    public static Path run(Path inputFile) {
        final Path outputPath = makeOutputPath("GenerateDocumentPagesPreview");
        try {
            Files.createDirectories(outputPath);

            Merger merger = new Merger(inputFile.toString());
            try {

                IPreviewOptions previewOption = new PreviewOptions(new PageStreamFactory() {
                    @Override
                    public OutputStream createPageStream(int pageNumber) {
                        try {
                            return Files.newOutputStream(getImagePath(outputPath, pageNumber));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    @Override
                    public void closePageStream(int pageNumber, OutputStream pageStream) {
                        try {
                            pageStream.close();
                            System.out.println("Image file '" + getImagePath(outputPath, pageNumber) + "' is ready for preview.");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }, PreviewMode.JPEG);
                merger.generatePreview(previewOption);

            } finally {
                merger.dispose();
            }
            System.out.println("..sample finished successfully.");
        } catch (Exception e) {
            FailureRegister.getInstance().registerFailedSample(e);
        }
        return outputPath;
    }

    private static Path getImagePath(Path outputPath, int pageNumber) {
        return outputPath.resolve(String.format("image-%d.jpg", pageNumber));
    }
}