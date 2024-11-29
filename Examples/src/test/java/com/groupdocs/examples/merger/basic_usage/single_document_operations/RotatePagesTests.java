package com.groupdocs.examples.merger.basic_usage.single_document_operations;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class RotatePagesTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = RotatePages.run(SampleFiles.SAMPLE_SIMPLE_PDF);
        Assertions.assertThat(result).isNotNull().exists();
    }
}