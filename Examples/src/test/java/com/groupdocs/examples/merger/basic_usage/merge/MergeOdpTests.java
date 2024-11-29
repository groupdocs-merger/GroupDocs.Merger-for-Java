package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeOdpTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeOdp.run(SampleFiles.SAMPLE_ODP, SampleFiles.SAMPLE_ODP);
        Assertions.assertThat(result).isNotNull().exists();
    }
}