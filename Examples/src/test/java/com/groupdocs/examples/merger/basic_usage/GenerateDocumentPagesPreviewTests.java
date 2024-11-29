package com.groupdocs.examples.merger.basic_usage;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class GenerateDocumentPagesPreviewTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = GenerateDocumentPagesPreview.run(SampleFiles.SAMPLE_XLSX);
        Assertions.assertThat(result).isNotNull().exists();
    }
}