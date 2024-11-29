package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergePptmTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergePptm.run(SampleFiles.SAMPLE_PPTM, SampleFiles.SAMPLE_PPTM);
        Assertions.assertThat(result).isNotNull().exists();
    }
}