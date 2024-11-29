package com.groupdocs.examples.merger.basic_usage.single_document_operations;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MovePageTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MovePage.run(SampleFiles.SAMPLE_XLSX);
        Assertions.assertThat(result).isNotNull().exists();
    }
}