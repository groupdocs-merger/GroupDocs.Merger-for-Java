package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergePptxTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergePptx.run(SampleFiles.SAMPLE_PPTX, SampleFiles.SAMPLE_PPTX);
        Assertions.assertThat(result).isNotNull().exists();
    }
}