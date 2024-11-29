package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeVssxTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeVssx.run(SampleFiles.SAMPLE_VSSX, SampleFiles.SAMPLE_VSSX);
        Assertions.assertThat(result).isNotNull().exists();
    }
}