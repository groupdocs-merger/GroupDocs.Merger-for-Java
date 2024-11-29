package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeTiffTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeTiff.run(SampleFiles.SAMPLE_TIFF, SampleFiles.SAMPLE_TIFF);
        Assertions.assertThat(result).isNotNull().exists();
    }
}