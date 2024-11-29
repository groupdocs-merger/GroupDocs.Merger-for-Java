package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeVdxTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeVdx.run(SampleFiles.SAMPLE_VDX, SampleFiles.SAMPLE_VDX);
        Assertions.assertThat(result).isNotNull().exists();
    }
}