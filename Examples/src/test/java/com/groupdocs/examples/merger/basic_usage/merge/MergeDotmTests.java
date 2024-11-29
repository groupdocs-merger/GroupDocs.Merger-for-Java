package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeDotmTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeDotm.run(SampleFiles.SAMPLE_DOTM, SampleFiles.SAMPLE_DOTM);
        Assertions.assertThat(result).isNotNull().exists();
    }
}