package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeOttTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeOtt.run(SampleFiles.SAMPLE_OTT, SampleFiles.SAMPLE_OTT);
        Assertions.assertThat(result).isNotNull().exists();
    }
}