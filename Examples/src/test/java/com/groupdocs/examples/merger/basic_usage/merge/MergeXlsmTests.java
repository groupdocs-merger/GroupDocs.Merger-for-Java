package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeXlsmTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeXlsm.run(SampleFiles.SAMPLE_XLSM, SampleFiles.SAMPLE_XLSM);
        Assertions.assertThat(result).isNotNull().exists();
    }
}