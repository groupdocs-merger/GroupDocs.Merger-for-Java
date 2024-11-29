package com.groupdocs.examples.merger.basic_usage.merge;

import com.groupdocs.examples.merger.SampleFiles;
import com.groupdocs.examples.merger.TestsSetUp;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.nio.file.Path;

class MergeXlsbTests extends TestsSetUp {


    @Test
    void testRun() {
        Path result = MergeXlsb.run(SampleFiles.SAMPLE_XLSB, SampleFiles.SAMPLE_XLSB);
        Assertions.assertThat(result).isNotNull().exists();
    }
}