package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeVssmTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeVssm.run(SampleFiles.SAMPLE_VSSM, SampleFiles.SAMPLE_VSSM);
        Assertions.assertThat(result).isNotNull().exists();
    }
}