package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeWavTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeWav.run(SampleFiles.SAMPLE_WAV, SampleFiles.SAMPLE_WAV);
        Assertions.assertThat(result).isNotNull().exists();
    }
}