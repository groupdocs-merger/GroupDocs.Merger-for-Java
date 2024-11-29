package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeVtxTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeVtx.run(SampleFiles.SAMPLE_VTX, SampleFiles.SAMPLE_VTX);
        Assertions.assertThat(result).isNotNull().exists();
    }
}