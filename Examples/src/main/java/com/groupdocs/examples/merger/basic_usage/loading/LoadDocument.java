package com.groupdocs.examples.merger.basic_usage.loading;

import com.groupdocs.examples.merger.utils.FailureRegister;
import com.groupdocs.merger.Merger;
import com.groupdocs.merger.domain.FileType;
import com.groupdocs.merger.domain.options.LoadOptions;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class LoadDocument {

    public static void fromLocalDisk(Path inputFile) {
        try {

            Merger merger = new Merger(inputFile.toString());
            System.out.println("..document loaded from local disk successfully.");
            merger.dispose();

        } catch (Exception e) {
            FailureRegister.getInstance().registerFailedSample(e);
        }
    }

    public static void fromStream(Path inputFile) {
        try (InputStream stream = Files.newInputStream(inputFile)) {
            Merger merger = new Merger(stream);
            System.out.println("..document loaded from stream successfully.");
            merger.dispose();
        } catch (Exception e) {
            FailureRegister.getInstance().registerFailedSample(e);
        }

    }

    public static void fromUrl(String url) {
        try (InputStream stream = new URL(url).openStream()) {

            LoadOptions loadOptions = new LoadOptions(FileType.PDF);

            Merger merger = new Merger(stream, loadOptions);
            System.out.println("..document loaded from URL successfully.");
            merger.dispose();
        } catch (Exception e) {
            FailureRegister.getInstance().registerFailedSample(e);
        }

    }
}
