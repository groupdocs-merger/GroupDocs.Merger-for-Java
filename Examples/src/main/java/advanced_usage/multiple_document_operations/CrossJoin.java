package advanced_usage.multiple_document_operations;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.options.ImageJoinMode;
import com.groupdocs.merger.domain.options.ImageJoinOptions;
import com.groupdocs.merger.domain.options.PageJoinOptions;

import java.nio.file.Path;

import static com.groupdocs.examples.merger.utils.FilesUtils.makeOutputPath;

public class CrossJoin {

    public static Path imagesToPdf(Path inputFilePath, Path jpgFilePath, Path svgFilePath) {
        final Path outputPath = makeOutputPath("CrossJoin-imagesToPdf.pdf");

        try {
            final Merger merger = new Merger(inputFilePath.toString());
            try {
                merger.join(jpgFilePath.toString());
                merger.join(svgFilePath.toString());
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

    public static Path multipleDocuments(Path filePath, Path docxPath, Path xlsxPath, Path pptxPath) {
        final Path outputPath = makeOutputPath("CrossJoin-multipleDocuments.pdf");

        try {
            final Merger merger = new Merger(filePath.toString());
            try {
                merger.join(docxPath.toString());
                merger.join(xlsxPath.toString());
                merger.join(pptxPath.toString());
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


    public static Path multipleImages(Path filePath, Path bmpPath, Path jpgPath) {
        final Path outputPath = makeOutputPath("CrossJoin-multipleImages.png");

        try {
            final Merger merger = new Merger(filePath.toString());
            try {
                ImageJoinOptions imageJoinOptions = new ImageJoinOptions(ImageJoinMode.Vertical);
                merger.join(bmpPath.toString(), imageJoinOptions);
                merger.join(jpgPath.toString(), imageJoinOptions);
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

    public static Path pagesFromVariousDocuments(Path filePath, Path docxPath) {
        final Path outputPath = makeOutputPath("CrossJoin-pagesFromVariousDocuments.pdf");

        try {
            final Merger merger = new Merger(filePath.toString());
            try {
                PageJoinOptions joinOptions = new PageJoinOptions(1, 2);
                merger.join(docxPath.toString(), joinOptions);
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
