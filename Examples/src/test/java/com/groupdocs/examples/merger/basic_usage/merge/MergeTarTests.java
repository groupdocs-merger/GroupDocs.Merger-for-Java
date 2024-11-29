package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeTarTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeTar.run(SampleFiles.SAMPLE_TAR, SampleFiles.SAMPLE_TAR);
        Assertions.assertThat(result).isNotNull().exists();
    }
}