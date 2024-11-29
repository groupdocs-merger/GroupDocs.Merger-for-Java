package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeDotTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeDot.run(SampleFiles.SAMPLE_DOT, SampleFiles.SAMPLE_DOT);
        Assertions.assertThat(result).isNotNull().exists();
    }
}