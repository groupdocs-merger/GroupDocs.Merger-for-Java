package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeVstxTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeVstx.run(SampleFiles.SAMPLE_VSTX, SampleFiles.SAMPLE_VSTX);
        Assertions.assertThat(result).isNotNull().exists();
    }
}