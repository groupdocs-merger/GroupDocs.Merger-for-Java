package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeBmpTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeBmp.run(SampleFiles.SAMPLE_BMP, SampleFiles.SAMPLE_BMP);
        Assertions.assertThat(result).isNotNull().exists();
    }
}