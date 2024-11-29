package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergePdfTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergePdf.run(SampleFiles.SAMPLE_PDF, SampleFiles.SAMPLE_PDF);
        Assertions.assertThat(result).isNotNull().exists();
    }
}