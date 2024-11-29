package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeRtfTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeRtf.run(SampleFiles.SAMPLE_RTF, SampleFiles.SAMPLE_RTF);
        Assertions.assertThat(result).isNotNull().exists();
    }
}