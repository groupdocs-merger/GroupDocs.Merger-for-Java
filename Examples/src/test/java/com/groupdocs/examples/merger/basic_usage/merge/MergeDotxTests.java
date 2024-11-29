package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeDotxTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeDotx.run(SampleFiles.SAMPLE_DOTX, SampleFiles.SAMPLE_DOTX);
        Assertions.assertThat(result).isNotNull().exists();
    }
}